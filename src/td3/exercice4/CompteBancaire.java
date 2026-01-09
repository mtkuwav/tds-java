package td3.exercice4;

public class CompteBancaire {
    private String numeroCompte;
    private String nomTitulaire;
    private double solde;
    private String typeCompte;

    public CompteBancaire() {
        this.numeroCompte = "000000";
        this.nomTitulaire = "Anonyme";
        this.solde = 0.0;
        this. typeCompte = "Courant";
    }

    public CompteBancaire(String numeroCompte, String nomTitulaire, double solde, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.nomTitulaire = nomTitulaire;
        this.solde = solde;
        this. typeCompte = typeCompte;
    }

    public CompteBancaire(CompteBancaire compte) {
        this.numeroCompte = compte.numeroCompte;
        this.nomTitulaire = compte.nomTitulaire;
        this.solde = compte.solde;
        this.typeCompte = compte.typeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public double getSolde() {
        return solde;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", nomTitulaire='" + nomTitulaire + '\'' +
                ", solde=" + solde +
                ", typeCompte='" + typeCompte + '\'' +
                '}';
    }
}
