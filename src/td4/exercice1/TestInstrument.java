package td4.exercice1;

public class TestInstrument {
    public static void main(String[] args) {
        InstrumentMusique[] instruments = new InstrumentMusique[3];

        instruments[0] = new Guitare("Fender Stratocaster", "Électrique", 1200.0, 6);
        instruments[1] = new Piano("Yamaha U1", "Droit", 5000.0, 88);
        instruments[2] = new Batterie("Pearl Export", "Acoustique", 800.0, 5);

        for (InstrumentMusique instrument : instruments) {
            instrument.afficherInfo();
            System.out.print("Son: ");
            instrument.jouer();
            System.out.print("Accordage: ");
            instrument.accorder();
            System.out.println("Prix TTC: " + instrument.calculerPrixAvecTVA() + " €");
        }
    }
}
