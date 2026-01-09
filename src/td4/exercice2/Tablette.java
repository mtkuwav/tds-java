package td4.exercice2;

public class Tablette extends AppareilElectronique implements Rechargeable, Portable {
    private int batterie;
    private double poids;

    public Tablette(String marque, String modele, double prix, double poids) {
        super(marque, modele, prix);
        this.poids = poids;
        this.batterie = 60;
    }

    @Override
    public void allumer() {
        System.out.println("La tablette s'allume...");
    }

    @Override
    public void recharger() {
        this.batterie = 100;
        System.out.println("Tablette rechargée à 100%");
    }

    @Override
    public int getNiveauBatterie() {
        return this.batterie;
    }

    @Override
    public void afficherBatterie() {
        System.out.println("Charge: " + this.batterie + "%");
    }

    @Override
    public double getPoids() {
        return this.poids;
    }

    @Override
    public void afficherPortabilite() {
        System.out.println("Poids: " + this.poids + " kg");
    }
}

