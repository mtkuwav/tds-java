package td3;

import td3.exercice1.Livre;
import td3.exercice2.Voiture;
import td3.exercice3.TableRestaurant;
import td3.exercice4.CompteBancaire;
import td3.exercice5.ProduitElectronique;
import td3.exercice6.ReservationHotel;
import td3.exercice7.Abonnement;
import td3.exercice8.Camion;
import td3.exercice8.Moto;
import td3.exercice9.Commercial;
import td3.exercice9.Manager;
import td3.exercice9.Technicien;

public class Main {
    public static void main(String[] args) {

        // exercice 1
        System.out.println("=== Exercice 1 ===");
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, true);
        Livre livre2 = new Livre("1984", "George Orwell", 1949, false);
        Livre livre3 = new Livre("L'Étranger", "Albert Camus", 1942, true);

        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);


        // exercice 2
        System.out.println("\n=== Exercice 2 ===");
        Voiture voiture1 = new Voiture("Renault", "Clio", 45000, 35.50);
        Voiture voiture2 = new Voiture("Peugeot", "3008", 12000, 55.00);
        Voiture voiture3 = new Voiture("Citroën", "C3", 78000, 30.00);
        Voiture voiture4 = new Voiture("Toyota", "Yaris", 5000, 40.00);

        // question 3
        Voiture[] voitures = {voiture1, voiture2, voiture3, voiture4};

        for (Voiture voiture: voitures) {
            if (voiture.getKilometrage() < 50000) {
                System.out.println(voiture);
            }
        }

        // question 4
        double prixTotalLocationJour = 0;
        for (Voiture voiture: voitures) {
            prixTotalLocationJour += voiture.getPrixLocationJour();
        }
        double prixLocationVoitures7Jours = prixTotalLocationJour * 7;

        System.out.println("\nLouer toutes les voitures pendant 7 jours coûtera " + prixLocationVoitures7Jours + " euros.");


        // exercice 3
        System.out.println("\n=== Exercice 3 ===");
        TableRestaurant table1 = new TableRestaurant(1, 2, false, "");
        TableRestaurant table2 = new TableRestaurant(2, 4, true, "Dupont");
        TableRestaurant table3 = new TableRestaurant(3, 6, false, "");
        TableRestaurant table4 = new TableRestaurant(4, 2, true, "Martin");
        TableRestaurant table5 = new TableRestaurant(5, 8, false, "");

        TableRestaurant[] tables = {table1, table2, table3, table4, table5};

        // question 3
        for(TableRestaurant table: tables) {
            if (!table.isEstReservee()) {
                System.out.println("La table " + table.getNumeroTable() + " est disponible avec " + table.getNombrePlaces() + " places.");
            }
        }

        // question 4
        int totalPlacesDispo = 0;
        for(TableRestaurant table: tables) {
            if(!table.isEstReservee()) {
                totalPlacesDispo += table.getNombrePlaces();
            }
        }
        System.out.println("\nIl y a " + totalPlacesDispo + " places disponibles dans le restaurant.");


        // exercice 4
        System.out.println("\n=== Exercice 4 ===");
        CompteBancaire compte1 = new CompteBancaire();
        System.out.println(compte1);
        CompteBancaire compte2 = new CompteBancaire("FR123456", "Sophie Leblanc", 2500.00, "Épargne");
        CompteBancaire compte3 = new CompteBancaire(compte2);
        compte3.setNomTitulaire("Jean Leblanc");
        System.out.println(compte2);
        System.out.println(compte3);


        // exercice 5
        System.out.println("\n=== Exercice 5 ===");
        ProduitElectronique produit1 = new ProduitElectronique();
        ProduitElectronique produit2 = new ProduitElectronique("REF001", "Smartphone Galaxy", 799.99, 25, 3);
        ProduitElectronique produit3 = new ProduitElectronique("REF002", "Laptop HP", 1299.00);

        produit1.afficherInfos();
        produit2.afficherInfos();
        produit3.afficherInfos();

        ProduitElectronique produit4 = new ProduitElectronique(produit2);
        produit4.setStock(50);

        System.out.println("Produit original (produit2) :");
        produit2.afficherInfos();
        System.out.println("Produit copié (produit4) après modification du stock :");
        produit4.afficherInfos();


        // exercice 6
        System.out.println("\n=== Exercice 6 ===");
        ReservationHotel reservationHotel = new ReservationHotel("RES2025001", "Marie Dubois", 3, 120.00);
        System.out.println(reservationHotel.calculerCoutTotal());
        reservationHotel.setNombreNuits(35);
        reservationHotel.setNombreNuits(5);
        System.out.println(reservationHotel.calculerCoutTotal());


        // exercice 7
        System.out.println("\n=== Exercice 7 ===");
        Abonnement abonnement1 = new Abonnement("AB001", "jean.dupont@email.com", "Basic", 9.99, true);
        Abonnement abonnement2 = new Abonnement("AB002", "marie.martin@email.com", "Standard", 14.99, true);
        Abonnement abonnement3 = new Abonnement("AB003", "paul.bernard@email.com", "Premium", 19.99, true);

        abonnement1.afficherDetails();
        abonnement2.afficherDetails();
        abonnement3.afficherDetails();

        abonnement2.setActif(false);

        abonnement1.setFormule("VIP");
        abonnement1.setFormule("Premium");

        double coutAnnuelTotal = abonnement1.calculerCoutAnnuel() + abonnement2.calculerCoutAnnuel() + abonnement3.calculerCoutAnnuel();
        System.out.println("\nCoût annuel total des abonnements actifs : " + coutAnnuelTotal + " €");


        // exercice 8
        System.out.println("\n=== Exercice 8 ===");
        Camion camion1 = new Camion("AB-123-CD", "Volvo", 2020, 15000);
        Camion camion2 = new Camion("EF-456-GH", "Mercedes", 2019, 20000);
        Moto moto1 = new Moto("IJ-789-KL", "Yamaha", 2022, 600);
        Moto moto2 = new Moto("MN-012-OP", "Honda", 2021, 750);

        camion1.afficherInfosCamion();
        System.out.println();
        camion2.afficherInfosCamion();
        System.out.println();
        moto1.afficherInfosMoto();
        System.out.println();
        moto2.afficherInfosMoto();


        // exercice 9
        System.out.println("\n=== Exercice 9 ===");
        Commercial commercial1 = new Commercial("C001", "Dupont", "Jean", 2000.00, 50000.00, 0.05);
        Commercial commercial2 = new Commercial("C002", "Martin", "Sophie", 2000.00, 75000.00, 0.05);
        Technicien technicien1 = new Technicien("T001", "Bernard", "Luc", 2200.00, 15, 25.00);
        Technicien technicien2 = new Technicien("T002", "Dubois", "Marie", 2200.00, 20, 25.00);
        Manager manager1 = new Manager("M001", "Leroy", "Paul", 3500.00, 1000.00);

        System.out.println();
        commercial1.afficherFicheCommercial();
        System.out.println();
        commercial2.afficherFicheCommercial();
        System.out.println();
        technicien1.afficherFicheTechnicien();
        System.out.println();
        technicien2.afficherFicheTechnicien();
        System.out.println();
        manager1.afficherFicheManager();

        double masseSalariale = commercial1.calculerSalaire() + commercial2.calculerSalaire() + technicien1.calculerSalaire() + technicien2.calculerSalaire() + manager1.calculerSalaire();
        System.out.println("\nMasse salariale totale de l'entreprise : " + masseSalariale + " €");
    }
}