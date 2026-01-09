package td4.exercice2;

public abstract class AppareilElectronique {
    protected String marque;
    protected String modele;
    protected double prix;

    public AppareilElectronique(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    abstract void allumer();

    void afficherCaracteristiques() {
        System.out.println("Marque: " + this.marque);
        System.out.println("Modèle: " + this.modele);
        System.out.println("Prix: " + this.prix + " €");
    }
}

