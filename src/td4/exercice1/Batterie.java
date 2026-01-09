package td4.exercice1;

public class Batterie extends InstrumentMusique {
    private int nombreFuts;

    public Batterie(String nom, String type, double prix, int nombreFuts) {
        super(nom, type, prix);
        this.nombreFuts = nombreFuts;
    }

    @Override
    public void jouer() {
        System.out.println("Poum tchak");
    }

    @Override
    public void accorder() {
        System.out.println("Sur le côté des fûts, on trouve des vis qui permettent d'ajuster la tension des peaux.");
    }
}
