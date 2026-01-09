package td4.exercice4;

public class Imprimante extends Equipement {
    private int niveauEncre;

    public Imprimante(String reference, String emplacement, boolean enService, int niveauEncre) {
        super(reference, emplacement, enService);
        this.niveauEncre = niveauEncre;
    }

    @Override
    void effectuerMaintenance() {
        System.out.println("Maintenance de l'imprimante:");
        System.out.println("- Nettoyage des têtes d'impression");
        System.out.println("- Vérification du niveau d'encre");
        System.out.println("- Test d'impression");
    }

    void remplacerCartouche() {
        System.out.println("Remplacement de la cartouche d'encre");
        this.niveauEncre = 100;
    }

    public int getNiveauEncre() {
        return this.niveauEncre;
    }
}

