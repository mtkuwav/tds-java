package td3.exercice2;

public class Voiture {
    private String marque;
    private String modele;
    private int kilometrage;
    private double prixLocationJour;

    public Voiture(String marque, String modele, int kilometrage, double prixLocationJour) {
        this.marque = marque;
        this.modele = modele;
        this.kilometrage = kilometrage;
        this.prixLocationJour = prixLocationJour;
    }

    public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public int getKilometrage() {
        return this.kilometrage;
    }

    public double getPrixLocationJour() {
        return this.prixLocationJour;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + this.marque + '\'' +
                ", modele='" + this.modele + '\'' +
                ", kilometrage=" + this.kilometrage +
                ", prixLocationJour=" + this.prixLocationJour +
                '}';
    }
}
