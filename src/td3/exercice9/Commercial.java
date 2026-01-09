package td3.exercice9;

public class Commercial extends Personnel {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(String matricule, String nom, String prenom, double salaireBase, double chiffreAffaires, double tauxCommission) {
        super(matricule, nom, prenom, salaireBase);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (chiffreAffaires * tauxCommission);
    }

    public void afficherFicheCommercial() {
        afficherFiche();
        System.out.println("Chiffre d'affaires : " + chiffreAffaires + " €, Taux de commission : " + (tauxCommission * 100) + " %");
    }
}

