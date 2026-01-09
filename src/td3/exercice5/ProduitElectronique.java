package td3.exercice5;

public class ProduitElectronique {
    private String reference;
    private String nom;
    private double prix;
    private int stock;
    private int garantieAnnees;

    public ProduitElectronique() {
        this.reference = "REF000";
        this.nom = "Produit générique";
        this.prix = 0.0;
        this.stock = 0;
        this.garantieAnnees = 1;
    }

    public ProduitElectronique(String reference, String nom, double prix, int stock, int garantieAnnees) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
        this.garantieAnnees = garantieAnnees;
    }

    public ProduitElectronique(String reference, String nom, double prix) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.stock = 10;
        this.garantieAnnees = 2;
    }

    public ProduitElectronique(ProduitElectronique produit) {
        this.reference = produit.reference;
        this.nom = produit.nom;
        this.prix = produit.prix;
        this.stock = produit.stock;
        this.garantieAnnees = produit.garantieAnnees;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public int getGarantieAnnees() {
        return garantieAnnees;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void afficherInfos() {
        System.out.println("Référence: " + reference);
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix + " €");
        System.out.println("Stock: " + stock + " unités");
        System.out.println("Garantie: " + garantieAnnees + " an(s)");
        System.out.println("---");
    }
}
