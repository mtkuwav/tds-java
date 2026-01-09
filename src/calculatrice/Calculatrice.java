package calculatrice;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Calculatrice {
    private JButton button1;
    private JPanel panel1;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton button5;
    private JButton a5Button;
    private JButton a1Button;
    private JButton button9;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton button13;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button16;
    private JButton button18;
    private JButton button20;
    private JButton cButton;
    private JButton delButton2;
    private JButton delButton;
    private JButton cButton1;
    private JTextField textField1;
    private JPanel Calculatrice;
    private JTextField textField2;

    private static final BigDecimal ONE_HUNDRED = BigDecimal.valueOf(100);
    private static final int MAX_DECIMAL_PLACES = 8;
    private static final int SCIENTIFIC_THRESHOLD = 1000000;
    private static final double SCIENTIFIC_THRESHOLD_SMALL = 0.0001;

    private BigDecimal accumulator = BigDecimal.ZERO;
    private String pendingOperator;
    private boolean overwriteInput = true;
    private boolean errorState;
    private String expression = "";
    private String currentInput = "0";
    private boolean useThousandsSeparator = true; // option pour les séparateurs de milliers
    private DecimalFormat decimalFormat;

    public Calculatrice() {
        initFormatter();
        initDisplay();
        initState();
        initListeners();
        initKeyboardListener();
    }

    private void initFormatter() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator(' ');
        symbols.setDecimalSeparator('.');

        decimalFormat = new DecimalFormat();
        decimalFormat.setDecimalFormatSymbols(symbols);
        decimalFormat.setGroupingUsed(useThousandsSeparator);
        decimalFormat.setMaximumFractionDigits(MAX_DECIMAL_PLACES);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    }

    private void initDisplay() {
        if (textField1 != null) {
            textField1.setEditable(false);
            textField1.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        if (textField2 != null) {
            textField2.setEditable(false);
            textField2.setHorizontalAlignment(SwingConstants.RIGHT);
        }
    }

    private void initState() {
        accumulator = BigDecimal.ZERO;
        pendingOperator = null;
        overwriteInput = true;
        errorState = false;
        expression = "";
        currentInput = "0";
        updateDisplays();
    }

    private void initListeners() {
        attachDigitListener(a0Button, "0");
        attachDigitListener(a1Button, "1");
        attachDigitListener(a2Button, "2");
        attachDigitListener(a3Button, "3");
        attachDigitListener(a4Button, "4");
        attachDigitListener(a5Button, "5");
        attachDigitListener(a6Button, "6");
        attachDigitListener(a7Button, "7");
        attachDigitListener(a8Button, "8");
        attachDigitListener(a9Button, "9");

        attachOperatorListener(button18, "+");
        attachOperatorListener(button16, "-");
        attachOperatorListener(button9, "*");
        attachOperatorListener(button5, "/");

        if (button20 != null) {
            button20.addActionListener(e -> evaluate());
        }
        if (cButton1 != null) {
            cButton1.addActionListener(e -> initState());
        }
        if (delButton != null) {
            delButton.addActionListener(e -> deleteLast());
        }
        if (delButton2 != null) {
            delButton2.addActionListener(e -> toggleSign());
        }
        if (button13 != null) {
            button13.addActionListener(e -> appendDecimal());
        }
        if (button1 != null) {
            button1.addActionListener(e -> applyPercent());
        }
    }

    private void initKeyboardListener() {
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }
        };
        if (panel1 != null) {
            panel1.setFocusable(true);
            panel1.addKeyListener(keyAdapter);
            panel1.requestFocusInWindow();
        }

        if (textField1 != null) {
            textField1.addKeyListener(keyAdapter);
        }
        if (textField2 != null) {
            textField2.addKeyListener(keyAdapter);
        }
    }

    private void handleKeyPress(KeyEvent e) {
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();

        // chiffres 0-9
        if (Character.isDigit(keyChar)) {
            appendDigit(String.valueOf(keyChar));
            e.consume();
            return;
        }

        // opérateurs
        switch (keyChar) {
            case '+':
                applyOperator("+");
                e.consume();
                break;
            case '-':
                applyOperator("-");
                e.consume();
                break;
            case '*':
            case 'x':
            case 'X':
                applyOperator("*");
                e.consume();
                break;
            case '/':
                applyOperator("/");
                e.consume();
                break;
            case '%':
                applyPercent();
                e.consume();
                break;
            case '.':
            case ',':
                appendDecimal();
                e.consume();
                break;
            case '=':
                evaluate();
                e.consume();
                break;
        }

        // touches spéciales (par code)
        switch (keyCode) {
            case KeyEvent.VK_ENTER:
                evaluate();
                e.consume();
                break;
            case KeyEvent.VK_BACK_SPACE:
                deleteLast();
                e.consume();
                break;
            case KeyEvent.VK_DELETE:
            case KeyEvent.VK_ESCAPE:
                initState();
                e.consume();
                break;
            case KeyEvent.VK_C:
                if (e.isControlDown()) {
                    break;
                }
                initState();
                e.consume();
                break;
        }
    }

    private void attachDigitListener(JButton button, String digit) {
        if (button == null) {
            return;
        }
        button.addActionListener(e -> appendDigit(digit));
    }

    private void attachOperatorListener(JButton button, String operator) {
        if (button == null) {
            return;
        }
        button.addActionListener(e -> applyOperator(operator));
    }

    private void appendDigit(String digit) {
        if (errorState) {
            return;
        }
        if (overwriteInput || "0".equals(currentInput)) {
            currentInput = digit;
        } else {
            currentInput += digit;
        }
        overwriteInput = false;
        updateDisplays();
    }

    private void appendDecimal() {
        if (errorState) {
            return;
        }
        if (overwriteInput) {
            currentInput = "0";
            overwriteInput = false;
        }
        if (!currentInput.contains(".")) {
            currentInput += ".";
        }
        updateDisplays();
    }

    private void applyOperator(String operator) {
        if (errorState) {
            return;
        }
        BigDecimal currentValue = safeParse(currentInput);
        if (pendingOperator == null || overwriteInput) {
            accumulator = currentValue;
            expression = currentInput + " " + operator;
        } else {
            accumulator = compute(accumulator, currentValue, pendingOperator);
            if (errorState) {
                return;
            }
            expression = format(accumulator) + " " + operator;
        }
        pendingOperator = operator;
        overwriteInput = true;
        currentInput = format(accumulator);
        updateDisplays();
    }

    private void evaluate() {
        if (errorState) {
            return;
        }
        if (pendingOperator == null) {
            return;
        }
        BigDecimal currentValue = safeParse(currentInput);
        expression = expression + " " + currentInput;
        accumulator = compute(accumulator, currentValue, pendingOperator);
        if (errorState) {
            return;
        }
        pendingOperator = null;
        overwriteInput = true;
        currentInput = format(accumulator);
        updateDisplays();
    }

    private BigDecimal compute(BigDecimal left, BigDecimal right, String operator) {
        try {
            return switch (operator) {
                case "+" -> left.add(right);
                case "-" -> left.subtract(right);
                case "*" -> left.multiply(right);
                case "/" -> divide(left, right);
                default -> right;
            };
        } catch (ArithmeticException ex) {
            showError("Erreur");
            return BigDecimal.ZERO;
        }
    }

    private BigDecimal divide(BigDecimal left, BigDecimal right) {
        if (right.compareTo(BigDecimal.ZERO) == 0) {
            showError("Division par 0");
            return BigDecimal.ZERO;
        }
        return left.divide(right, 10, RoundingMode.HALF_UP);
    }

    private void deleteLast() {
        if (errorState) {
            return;
        }
        if (overwriteInput || currentInput.length() <= 1) {
            currentInput = "0";
            overwriteInput = true;
        } else {
            String nextValue = currentInput.substring(0, currentInput.length() - 1);
            if (nextValue.isEmpty() || "-".equals(nextValue)) {
                currentInput = "0";
                overwriteInput = true;
            } else {
                currentInput = nextValue;
            }
        }
        updateDisplays();
    }

    private void toggleSign() {
        if (errorState) {
            return;
        }
        if (currentInput.isEmpty()) {
            currentInput = "0";
        }
        if (currentInput.startsWith("-")) {
            currentInput = currentInput.substring(1);
        } else {
            currentInput = "-" + currentInput;
        }
        overwriteInput = false;
        updateDisplays();
    }

    private void applyPercent() {
        if (errorState) {
            return;
        }
        BigDecimal current = safeParse(currentInput);
        BigDecimal percent;
        if (pendingOperator != null && !overwriteInput) {
            percent = accumulator.multiply(current).divide(ONE_HUNDRED, 10, RoundingMode.HALF_UP);
        } else {
            percent = current.divide(ONE_HUNDRED, 10, RoundingMode.HALF_UP);
        }
        currentInput = format(percent);
        overwriteInput = false;
        updateDisplays();
    }

    private BigDecimal safeParse(String value) {
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException ex) {
            showError("Erreur");
            return BigDecimal.ZERO;
        }
    }

    private void showError(String message) {
        errorState = true;
        pendingOperator = null;
        currentInput = message;
        expression = "";
        updateDisplays();
    }

    private void updateDisplays() {
        if (textField1 != null) {
            if (expression.isEmpty()) {
                textField1.setText("");
            } else {
                textField1.setText(expression);
            }
        }
        if (textField2 != null) {
            textField2.setText(currentInput);
        }
    }

    private String format(BigDecimal value) {
        if (value == null) {
            return "0";
        }

        value = value.stripTrailingZeros();

        double absValue = value.abs().doubleValue();
        if (absValue != 0 && (absValue >= SCIENTIFIC_THRESHOLD || absValue < SCIENTIFIC_THRESHOLD_SMALL)) {
            return formatScientific(value);
        }

        if (value.scale() > MAX_DECIMAL_PLACES) {
            value = value.setScale(MAX_DECIMAL_PLACES, RoundingMode.HALF_UP);
            value = value.stripTrailingZeros();
        }

        if (value.scale() < 0) {
            value = value.setScale(0, RoundingMode.HALF_UP);
        }

        if (useThousandsSeparator) {
            return decimalFormat.format(value);
        }

        return value.toPlainString();
    }

    private String formatScientific(BigDecimal value) {
        DecimalFormat scientificFormat = new DecimalFormat("0.####E0");
        scientificFormat.setRoundingMode(RoundingMode.HALF_UP);
        return scientificFormat.format(value);
    }

    private String formatWithPrecision(BigDecimal value, int decimalPlaces) {
        if (value == null) {
            return "0";
        }

        value = value.setScale(decimalPlaces, RoundingMode.HALF_UP);
        value = value.stripTrailingZeros();

        if (value.scale() < 0) {
            value = value.setScale(0, RoundingMode.HALF_UP);
        }

        if (useThousandsSeparator) {
            DecimalFormat customFormat = (DecimalFormat) decimalFormat.clone();
            customFormat.setMaximumFractionDigits(decimalPlaces);
            return customFormat.format(value);
        }

        return value.toPlainString();
    }

    public JPanel getMainPanel() {
        return panel1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice");
        Calculatrice calculatrice = new Calculatrice();
        frame.setContentPane(calculatrice.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
