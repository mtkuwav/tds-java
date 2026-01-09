package td4.exercice3;

public class CarteBancaire extends MoyenPaiement {
    private String numeroCarte;

    public CarteBancaire(String titulaire, double solde, String numeroCarte) {
        super(titulaire, solde);
        this.numeroCarte = numeroCarte;
    }

    @Override
    boolean payer(double montant) {
        if (verifierSolde(montant)) {
            this.solde -= montant;
            return true;
        } else {
            System.out.println("Solde insuffisant pour la carte bancaire");
            return false;
        }
    }

    @Override
    String getTypePaiement() {
        return "Carte Bancaire";
    }

    String getDernierChiffres() {
        return this.numeroCarte.substring(this.numeroCarte.length() - 4);
    }

    @Override
    void afficherSolde() {
        System.out.println("Carte bancaire **** " + getDernierChiffres());
        super.afficherSolde();
    }
}

