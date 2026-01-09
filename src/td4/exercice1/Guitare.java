package td4.exercice1;

public class Guitare extends InstrumentMusique {
    private int nombreCordes;

    public Guitare(String nom, String type, double prix, int nombreCordes) {
        super(nom, type, prix);
        this.nombreCordes = nombreCordes;
    }

    @Override
    public void jouer() {
        System.out.println("Dring dring");
    }

    @Override
    public void accorder() {
        System.out.println("Pour accorder les cordes, il faut une note de référence et un accordeur.");
    }
}
