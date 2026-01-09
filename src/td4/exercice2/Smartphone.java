package td4.exercice2;

public class Smartphone extends AppareilElectronique implements Rechargeable, Portable, Connecte {
    private int batterie;
    private double poids;
    private boolean wifiActif;
    private String reseauWifi;

    public Smartphone(String marque, String modele, double prix, double poids) {
        super(marque, modele, prix);
        this.poids = poids;
        this.batterie = 50;
        this.wifiActif = false;
        this.reseauWifi = null;
    }

    @Override
    public void allumer() {
        System.out.println("Le smartphone s'allume...");
    }

    @Override
    public void recharger() {
        this.batterie = 100;
        System.out.println("Smartphone rechargé à 100%");
    }

    @Override
    public int getNiveauBatterie() {
        return this.batterie;
    }

    @Override
    public void afficherBatterie() {
        System.out.println("Niveau de batterie: " + this.batterie + "%");
    }

    @Override
    public double getPoids() {
        return this.poids;
    }

    @Override
    public void afficherPortabilite() {
        System.out.println("Poids: " + this.poids + " kg");
    }

    @Override
    public void connecterWifi(String reseau) {
        this.wifiActif = true;
        this.reseauWifi = reseau;
        System.out.println("Connecté au réseau: " + reseau);
    }

    @Override
    public void deconnecter() {
        this.wifiActif = false;
        this.reseauWifi = null;
        System.out.println("WiFi déconnecté");
    }

    @Override
    public boolean estConnecte() {
        return this.wifiActif;
    }
}

