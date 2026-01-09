package td3.exercice8;

public class Camion extends Vehicule {
    private int chargeMaximale;

    public Camion(String immatriculation, String marque, int annee, int chargeMaximale) {
        super(immatriculation, marque, annee);
        this.chargeMaximale = chargeMaximale;
    }

    public void afficherInfosCamion() {
        afficherInfos();
        System.out.println("Charge maximale : " + chargeMaximale + " kg");
    }
}

