package td3.exercice8;

public class Vehicule {
    protected String immatriculation;
    protected String marque;
    protected int annee;

    public Vehicule(String immatriculation, String marque, int annee) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.annee = annee;
    }

    public void afficherInfos() {
        System.out.println("Immatriculation : " + immatriculation + ", Marque : " + marque + ", Année : " + annee);
    }
}


