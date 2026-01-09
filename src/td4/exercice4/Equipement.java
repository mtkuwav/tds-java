package td4.exercice4;

public abstract class Equipement {
    protected String reference;
    protected String emplacement;
    protected boolean enService;

    public Equipement(String reference, String emplacement, boolean enService) {
        this.reference = reference;
        this.emplacement = emplacement;
        this.enService = enService;
    }

    abstract void effectuerMaintenance();

    void afficherEtat() {
        System.out.println("Référence: " + this.reference);
        System.out.println("Emplacement: " + this.emplacement);
        System.out.println("État: " + (this.enService ? "En service" : "Hors service"));
    }
}

