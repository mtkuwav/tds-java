package td4.exercice1;

public abstract class InstrumentMusique {
    protected String nom;
    protected String type;
    protected double prix;

    public InstrumentMusique(String nom, String type, double prix) {
        this.nom = nom;
        this.type = type;
        this.prix = prix;
    }

    abstract void jouer();
    abstract void accorder();

    void afficherInfo() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Type: " + this.type);
        System.out.println("Prix HT: " + this.prix);
    }

    double calculerPrixAvecTVA() {
        return this.prix * 1.2;
    }
}
