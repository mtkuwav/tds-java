package td3.exercice9;

public class Technicien extends Personnel {
    private int nombreHeuresSupp;
    private double tauxHoraire;

    public Technicien(String matricule, String nom, String prenom, double salaireBase, int nombreHeuresSupp, double tauxHoraire) {
        super(matricule, nom, prenom, salaireBase);
        this.nombreHeuresSupp = nombreHeuresSupp;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (nombreHeuresSupp * tauxHoraire);
    }

    public void afficherFicheTechnicien() {
        afficherFiche();
        System.out.println("Heures supplémentaires : " + nombreHeuresSupp + " h, Taux horaire : " + tauxHoraire + " €/h");
    }
}

