package td3.exercice6;

public class ReservationHotel {
    private String numeroReservation;
    private String nomClient;
    private int nombreNuits;
    private double prixParNuit;

    public ReservationHotel(String nomClient, String numeroReservation, int nombreNuits, double prixParNuit) {
        this.nomClient = nomClient;
        this.numeroReservation = numeroReservation;
        this.nombreNuits = nombreNuits;
        this.prixParNuit = prixParNuit;
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public String getNomClient() {
        return nomClient;
    }

    public int getNombreNuits() {
        return nombreNuits;
    }

    public double getPrixParNuit() {
        return prixParNuit;
    }

    public void setNombreNuits(int nombreNuits) {
        if (nombreNuits >= 1 && nombreNuits <= 30) {
            this.nombreNuits = nombreNuits;
        } else {
            System.out.println("Erreur: entrez un nombre entre 1 et 30 inclus");
        }
    }

    public void setPrixParNuit(double prixParNuit) {
        if (nombreNuits >= 50.0 && nombreNuits <= 1000.0) {
            this.prixParNuit = prixParNuit;
        } else {
            System.out.println("Erreur: entrez un nombre entre 50.0 et 1000.0 inclus");
        }
    }

    public double calculerCoutTotal() {
        return this.nombreNuits * this.prixParNuit;
    }
}
