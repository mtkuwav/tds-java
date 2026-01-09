package td4.exercice3;

public class PayPal extends MoyenPaiement {
    private String email;

    public PayPal(String titulaire, double solde, String email) {
        super(titulaire, solde);
        this.email = email;
    }

    @Override
    boolean payer(double montant) {
        double commission = montant * 0.02;
        double total = montant + commission;

        if (verifierSolde(total)) {
            this.solde -= total;
            System.out.println("Commission PayPal: " + commission + " €");
            return true;
        } else {
            System.out.println("Solde insuffisant pour PayPal");
            return false;
        }
    }

    @Override
    String getTypePaiement() {
        return "PayPal";
    }

    @Override
    void afficherSolde() {
        System.out.println("PayPal (" + this.email + ")");
        super.afficherSolde();
    }
}

