package td3.exercice3;

public class TableRestaurant {
    private int numeroTable;
    private int nombrePlaces;
    private boolean estReservee;
    private String nomClient;

    public TableRestaurant(int numeroTable, int nombrePlaces, boolean estReservee, String nomClient) {
        this.numeroTable = numeroTable;
        this.nombrePlaces = nombrePlaces;
        this.estReservee = estReservee;
        this.nomClient = nomClient;
    }

    public String getNomClient() {
        return this.nomClient;
    }

    public boolean isEstReservee() {
        return this.estReservee;
    }

    public int getNombrePlaces() {
        return this.nombrePlaces;
    }

    public int getNumeroTable() {
        return this.numeroTable;
    }

    @Override
    public String toString() {
        return "TableRestaurant{" +
                "numeroTable=" + numeroTable +
                ", nombrePlaces=" + nombrePlaces +
                ", estReservee=" + estReservee +
                ", nomClient='" + nomClient + '\'' +
                '}';
    }
}
