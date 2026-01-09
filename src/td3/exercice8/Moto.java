package td3.exercice8;

public class Moto extends Vehicule {
    private int cylindree;

    public Moto(String immatriculation, String marque, int annee, int cylindree) {
        super(immatriculation, marque, annee);
        this.cylindree = cylindree;
    }

    public void afficherInfosMoto() {
        afficherInfos();
        System.out.println("Cylindrée : " + cylindree + " cm³");
    }
}

