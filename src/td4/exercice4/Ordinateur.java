package td4.exercice4;

public class Ordinateur extends Equipement {
    private String systemeExploitation;

    public Ordinateur(String reference, String emplacement, boolean enService, String systemeExploitation) {
        super(reference, emplacement, enService);
        this.systemeExploitation = systemeExploitation;
    }

    @Override
    void effectuerMaintenance() {
        System.out.println("Maintenance de l'ordinateur:");
        System.out.println("- Nettoyage du disque dur");
        System.out.println("- Mise à jour du système");
        System.out.println("- Vérification des logiciels");
    }

    void redemarrer() {
        System.out.println("Redémarrage de l'ordinateur en cours...");
    }

    public String getSystemeExploitation() {
        return this.systemeExploitation;
    }
}

