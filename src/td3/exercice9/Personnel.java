package td3.exercice9;

public class Personnel {
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected double salaireBase;

    public Personnel(String matricule, String nom, String prenom, double salaireBase) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }

    public void afficherFiche() {
        System.out.println("Matricule : " + matricule + ", Nom : " + nom + ", Prénom : " + prenom + ", Salaire : " + calculerSalaire() + " €");
    }
}
