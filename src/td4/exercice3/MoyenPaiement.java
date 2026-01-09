package td4.exercice3;

public abstract class MoyenPaiement {
    protected String titulaire;
    protected double solde;

    public MoyenPaiement(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    abstract boolean payer(double montant);
    abstract String getTypePaiement();

    void afficherSolde() {
        System.out.println("Solde: " + this.solde + " €");
    }

    boolean verifierSolde(double montant) {
        return this.solde >= montant;
    }

    void effectuerTransaction(double montant) {
        System.out.println("Transaction de " + montant + " €");
        if (payer(montant)) {
            System.out.println("Transaction réussie");
        } else {
            System.out.println("Transaction échouée");
        }
    }

    void effectuerTransaction(double montant, String description) {
        System.out.println("Transaction: " + description);
        System.out.println("Montant: " + montant + " €");
        if (payer(montant)) {
            System.out.println("Transaction réussie");
        } else {
            System.out.println("Transaction échouée");
        }
    }

    void effectuerTransaction(double montant, String description, double commission) {
        System.out.println("Transaction: " + description);
        System.out.println("Montant: " + montant + " €");
        System.out.println("Commission: " + commission + " €");
        double total = montant + commission;
        System.out.println("Total: " + total + " €");
        if (payer(total)) {
            System.out.println("Transaction réussie");
        } else {
            System.out.println("Transaction échouée");
        }
    }
}

