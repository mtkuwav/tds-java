package td3.exercice9;

public class Manager extends Personnel {
    private double prime;

    public Manager(String matricule, String nom, String prenom, double salaireBase, double prime) {
        super(matricule, nom, prenom, salaireBase);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + prime;
    }

    public void afficherFicheManager() {
        afficherFiche();
        System.out.println("Prime : " + prime + " €");
    }
}

