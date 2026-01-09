package td4.exercice3;

public class Crypto extends MoyenPaiement {
    private String walletAddress;

    public Crypto(String titulaire, double solde, String walletAddress) {
        super(titulaire, solde);
        this.walletAddress = walletAddress;
    }

    @Override
    boolean payer(double montant) {
        double commission = montant * 0.01;
        double total = montant + commission;

        if (verifierSolde(total)) {
            this.solde -= total;
            System.out.println("Commission réseau: " + commission + " €");
            System.out.println("Transaction blockchain en cours...");
            return true;
        } else {
            return false;
        }
    }

    @Override
    String getTypePaiement() {
        return "Cryptomonnaie";
    }

    @Override
    void afficherSolde() {
        System.out.println("Wallet: " + this.walletAddress);
        super.afficherSolde();
    }
}

