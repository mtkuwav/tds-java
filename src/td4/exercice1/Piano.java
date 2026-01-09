package td4.exercice1;

public class Piano extends InstrumentMusique{
    private int nombreTouches;

    public Piano(String nom, String type, double prix, int nombreTouches) {
        super(nom, type, prix);
        this.nombreTouches = nombreTouches;
    }

    @Override
    public void jouer() {
        System.out.println("Pling pling");
    }

    @Override
    public void accorder() {
        System.out.println("Il vaut mieux laisser faire un professionnel pour accorder un piano.");
    }
}
