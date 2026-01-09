package td4.exercice4;

public class Serveur extends Equipement {
    private int nombreCPU;

    public Serveur(String reference, String emplacement, boolean enService, int nombreCPU) {
        super(reference, emplacement, enService);
        this.nombreCPU = nombreCPU;
    }

    @Override
    void effectuerMaintenance() {
        System.out.println("Maintenance du serveur:");
        System.out.println("- Vérification des ventilateurs");
        System.out.println("- Contrôle de température");
        System.out.println("- Mise à jour des firmwares");
    }

    void sauvegarder() {
        System.out.println("Sauvegarde des données en cours...");
    }

    public int getNombreCPU() {
        return this.nombreCPU;
    }
}

