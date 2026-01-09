package td4.exercice2;

public class OrdinateurPortable extends AppareilElectronique implements Rechargeable, Portable, Connecte {
    private int batterie;
    private double poids;
    private boolean wifiActif;
    private String reseauWifi;

    public OrdinateurPortable(String marque, String modele, double prix, double poids) {
        super(marque, modele, prix);
        this.poids = poids;
        this.batterie = 70;
        this.wifiActif = false;
        this.reseauWifi = null;
    }

    @Override
    public void allumer() {
        System.out.println("L'ordinateur portable démarre...");
    }

    @Override
    public void recharger() {
        this.batterie = 100;
        System.out.println("Ordinateur rechargé à 100%");
    }

    @Override
    public int getNiveauBatterie() {
        return this.batterie;
    }

    @Override
    public void afficherBatterie() {
        System.out.println("Batterie: " + this.batterie + "%");
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
        System.out.println("WiFi activé sur le réseau: " + reseau);
    }

    @Override
    public void deconnecter() {
        this.wifiActif = false;
        this.reseauWifi = null;
        System.out.println("Déconnecté du réseau WiFi");
    }

    @Override
    public boolean estConnecte() {
        return this.wifiActif;
    }
}

