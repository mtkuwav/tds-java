import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Td2 {

    // partie 1

    void exercice1() {
        int niveauEtudes = 3;

        if (niveauEtudes >= 2) {
            System. out.println("Inscription validée – Niveau suffisant");
        } else {
            System.out.println("Inscription refusée – Niveau insuffisant");
        }

        System.out.println("\nTest avec niveau 1:");
        niveauEtudes = 1;
        if (niveauEtudes >= 2) {
            System.out.println("Inscription validée – Niveau suffisant");
        } else {
            System.out.println("Inscription refusée – Niveau insuffisant");
        }

        System.out.println("\nTest avec niveau 4:");
        niveauEtudes = 4;
        if (niveauEtudes >= 2) {
            System.out.println("Inscription validée – Niveau suffisant");
        } else {
            System.out.println("Inscription refusée – Niveau insuffisant");
        }
    }

    void exercice2(double montant) {
        double taux = 0.0;
        if (montant >= 500) {
            taux = 0.20;
        } else if (montant >= 300) {
            taux = 0.15;
        } else if (montant >= 100) {
            taux = 0.10;
        }
        System.out.println("Remise appliquée : " + (taux * 100) + "%");
        System.out.println("Montant final : " + (montant * (1 - taux)) + " €");
    }

    void testExercice2() {
        System.out.println("\nTest avec 50€:");
        exercice2(50.0);
        System.out. println("\nTest avec 150€:");
        exercice2(150.0);
        System.out.println("\nTest avec 350€:");
        exercice2(350.0);
        System.out. println("\nTest avec 600€:");
        exercice2(600.0);
    }

    void exercice3(int choix) {
        switch (choix) {
            case 1:
                System.out.println("Consulter les statistiques");
                break;
            case 2:
                System.out.println("Exporter les données");
                break;
            case 3:
                System.out.println("Importer un fichier");
                break;
            case 4:
                System.out. println("Paramètres");
                break;
            default:
                System.out.println("Erreur : option invalide");
                break;
        }
    }

    void testExercice3() {
        System.out.println("\nTest avec choix 1:");
        exercice3(1);
        System.out.println("\nTest avec choix 3:");
        exercice3(3);
        System.out.println("\nTest avec choix 5:");
        exercice3(5);
        System.out.println("\nTest avec choix 10:");
        exercice3(10);
    }

    void exercice4(int anciennete, double revenu, boolean incidents) {
        boolean eligible = (anciennete >= 2) && (revenu >= 2500) && (!incidents);

        if (eligible) {
            System.out.println("Prêt accordé – Profil validé");
        } else {
            System.out. println("Prêt refusé – Critères non satisfaits");
            if (anciennete < 2) {
                System.out.println("- Ancienneté insuffisante");
            }
            if (revenu < 2500) {
                System.out.println("- Revenu insuffisant");
            }
            if (incidents) {
                System.out.println("- Incidents de paiement détectés");
            }
        }
    }

    void testExercice4() {
        System.out.println("\n=== Profil 1 ===");
        exercice4(1, 3000.0, false);
        System.out.println("\n=== Profil 2 ===");
        exercice4(5, 2200.0, false);

        System. out.println("\n=== Profil 3 ===");
        exercice4(3, 3500.0, true);
    }

    void exercice5(String code) {
        String categorie = "";
        double tauxTVA = 0.0;

        switch (code) {
            case "AL":
                categorie = "Alimentation";
                tauxTVA = 5.5;
                break;
            case "EL":
                categorie = "Électronique";
                tauxTVA = 20.0;
                break;
            case "VT":
                categorie = "Vêtements";
                tauxTVA = 20.0;
                break;
            case "MB":
                categorie = "Meubles";
                tauxTVA = 20.0;
                break;
            case "LV":
                categorie = "Livres";
                tauxTVA = 5.5;
                break;
            default:
                categorie = "Catégorie inconnue";
                break;
        }

        System.out.println("Catégorie : " + categorie);
        if (tauxTVA > 0) {
            System.out.println("Taux TVA : " + tauxTVA + "%");
        }
    }

    void testExercice5() {
        System.out.println("\nTest avec code 'AL':");
        exercice5("AL");
        System.out.println("\nTest avec code 'EL':");
        exercice5("EL");
        System.out.println("\nTest avec code 'XX':");
        exercice5("XX");
    }

    // PARTIE 2 - TABLEAUX

    void exercice6() {
        int[] quantites = {45, 12, 78, 5, 60, 23};

        System.out.println("Quantité du premier produit :  " + quantites[0]);
        System.out.println("Quantité du dernier produit : " + quantites[quantites.length - 1]);

        quantites[3] = 50;

        System.out.println("\nTableau après modification :");
        for (int i = 0; i < quantites.length; i++) {
            System.out.println("Produit " + (i + 1) + " : " + quantites[i]);
        }
    }

    void exercice7() {
        double[] chiffreAffaires = {12500.0, 9800.0, 15200.0, 11000.0, 18500.0, 13700.0};

        System.out.println("Chiffres d'affaires mensuels :");
        for (int i = 0; i < chiffreAffaires.length; i++) {
            System.out.println("Mois " + (i + 1) + " : " + chiffreAffaires[i] + " €");
        }

        double total = 0.0;
        for (int i = 0; i < chiffreAffaires.length; i++) {
            total += chiffreAffaires[i];
        }

        double moyenne = total / chiffreAffaires. length;

        int compteur = 0;
        for (int i = 0; i < chiffreAffaires. length; i++) {
            if (chiffreAffaires[i] > moyenne) {
                compteur++;
            }
        }

        System.out.println("\nChiffre d'affaires total : " + total + " €");
        System.out.println("Chiffre d'affaires moyen : " + moyenne + " €");
        System.out.println("Nombre de mois au-dessus de la moyenne : " + compteur);
    }

    void exercice8() {
        int[] temperaturesMax = {15, 18, 12, 22, 19, 24, 16};

        int min = temperaturesMax[0];
        int max = temperaturesMax[0];

        for (int i = 1; i < temperaturesMax.length; i++) {
            if (temperaturesMax[i] < min) {
                min = temperaturesMax[i];
            }
            if (temperaturesMax[i] > max) {
                max = temperaturesMax[i];
            }
        }

        System.out.println("Température minimale : " + min + "°C");
        System.out.println("Température maximale :  " + max + "°C");

        System.out.print("Jours > 20°C : ");
        boolean premier = true;
        for (int i = 0; i < temperaturesMax.length; i++) {
            if (temperaturesMax[i] > 20) {
                if (! premier) {
                    System. out.print(", ");
                }
                System.out.print(temperaturesMax[i] + "°C");
                premier = false;
            }
        }
        System.out.println();

        int ecart = max - min;
        System.out.println("Écart de température : " + ecart + "°C");
    }

    void exercice9() {
        double[] notes = {12.5, 8.0, 15.5, 10.0, 14.0, 6.5, 18.0, 11.5};

        System.out.println("Notes :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Étudiant " + (i + 1) + " : " + notes[i]);
        }

        double somme = 0.0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        double moyenne = somme / notes.length;

        int admis = 0;
        int nonAdmis = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 10) {
                admis++;
            } else {
                nonAdmis++;
            }
        }

        double meilleure = notes[0];
        double plusMauvaise = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > meilleure) {
                meilleure = notes[i];
            }
            if (notes[i] < plusMauvaise) {
                plusMauvaise = notes[i];
            }
        }

        double tauxReussite = (admis * 100.0) / notes.length;

        System.out.println("\nMoyenne de la classe : " + moyenne);
        System.out.println("Nombre d'admis : " + admis);
        System.out.println("Nombre de non-admis : " + nonAdmis);
        System.out.println("Meilleure note : " + meilleure);
        System.out. println("Plus mauvaise note :  " + plusMauvaise);
        System.out.println("Taux de réussite :  " + tauxReussite + "%");
    }

    void exercice10() {
        int[] indicesPollution = {45, 120, 78, 95, 150, 60, 200, 88, 110};

        int bon = 0;
        int moyen = 0;
        int mauvais = 0;

        for (int i = 0; i < indicesPollution.length; i++) {
            if (indicesPollution[i] < 50) {
                bon++;
            } else if (indicesPollution[i] <= 100) {
                moyen++;
            } else {
                mauvais++;
            }
        }

        System. out.println("Catégorie Bon (< 50) : " + bon);
        System.out.println("Catégorie Moyen (50-100) : " + moyen);
        System.out.println("Catégorie Mauvais (> 100) : " + mauvais);

        int[] indicesMauvais = new int[mauvais];
        int index = 0;
        for (int i = 0; i < indicesPollution.length; i++) {
            if (indicesPollution[i] > 100) {
                indicesMauvais[index] = indicesPollution[i];
                index++;
            }
        }

        System. out.println("\nIndices > 100 :");
        for (int i = 0; i < indicesMauvais.length; i++) {
            System.out.println(indicesMauvais[i]);
        }

        double somme = 0.0;
        for (int i = 0; i < indicesPollution.length; i++) {
            somme += indicesPollution[i];
        }
        double indiceMoyen = somme / indicesPollution.length;

        System.out.println("\nIndice moyen de pollution : " + indiceMoyen);
    }

    // partie 3

    void exercice11() {
        ArrayList<String> cours = new ArrayList<>();

        cours.add("Mathématiques");
        cours.add("Programmation Java");
        cours.add("Base de données");
        cours.add("Algorithmique");
        cours.add("Réseaux");
        cours.add("Systèmes d'exploitation");

        System.out.println("Liste complète des cours :");
        for (String c : cours) {
            System.out.println("- " + c);
        }

        cours.remove("Base de données");

        System.out.println("\nTaille de la liste après suppression :  " + cours.size());

        boolean existe = cours.contains("Algorithmique");
        System.out.println("\nLe cours 'Algorithmique' existe : " + existe);
    }

    void exercice12() {
        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(1200);
        scores.add(950);
        scores.add(1450);
        scores.add(800);
        scores.add(1600);

        boolean existe = scores.contains(950);
        System.out.println("Le score 950 existe :  " + existe);

        int index = scores.indexOf(1450);
        System.out.println("Index du score 1450 :  " + index);

        int indexScore800 = scores.indexOf(800);
        scores.set(indexScore800, 1000);

        System.out.println("\nListe mise à jour :");
        for (Integer score : scores) {
            System.out.println(score);
        }

        System.out.println("\nPremier score : " + scores. get(0));
        System.out.println("Dernier score : " + scores.get(scores.size() - 1));
    }

    void exercice13() {
        ArrayList<String> fileAttente = new ArrayList<>();

        fileAttente.add("Client_A");
        fileAttente.add("Client_B");
        fileAttente.add("Client_C");
        fileAttente.add("Client_D");
        fileAttente.add("Client_E");

        System.out.println("File d'attente initiale :");
        for (String client : fileAttente) {
            System.out.println("- " + client);
        }

        fileAttente.remove(0);

        System.out.println("\nFile d'attente après traitement :");
        for (String client : fileAttente) {
            System.out.println("- " + client);
        }

        fileAttente.add("Client_F");

        int position = fileAttente.indexOf("Client_D");
        System.out.println("\nPosition de Client_D : " + position);

        System.out.println("Nombre total de clients en attente : " + fileAttente. size());
    }

    void exercice14() {
        ArrayList<String> tachesEquipe1 = new ArrayList<>(Arrays.asList("Tâche1", "Tâche2", "Tâche3"));
        ArrayList<String> tachesEquipe2 = new ArrayList<>(Arrays.asList("Tâche4", "Tâche5"));

        ArrayList<String> tachesGlobales = new ArrayList<>();

        tachesGlobales.addAll(tachesEquipe1);
        tachesGlobales.addAll(tachesEquipe2);

        System.out.println("Tâches globales :");
        for (String tache : tachesGlobales) {
            System.out.println("- " + tache);
        }

        System.out.println("\nNombre total de tâches : " + tachesGlobales. size());

        boolean existe = tachesGlobales.contains("Tâche3");
        System.out.println("La Tâche3 est dans la liste globale : " + existe);
    }

    // partie 4

    void exercice15() {
        List<String> clients = new ArrayList<>(Arrays.asList("Dupont", "Martin", "Bernard", "Dubois", "Lefebvre"));

        System.out.println("Liste originale :");
        for (String client : clients) {
            System.out.println("- " + client);
        }

        Collections.sort(clients);
        System.out.println("\nListe triée par ordre alphabétique croissant (A→Z) :");
        for (String client : clients) {
            System. out.println("- " + client);
        }

        Collections.reverse(clients);
        System.out.println("\nListe triée par ordre alphabétique décroissant (Z→A) :");
        for (String client : clients) {
            System.out. println("- " + client);
        }
    }

    void exercice16() {
        List<String> pays = new ArrayList<>(Arrays.asList("France", "Allemagne", "Italie", "Espagne"));

        String[] tableauPays = pays.toArray(new String[0]);

        System.out.println("Tableau converti :");
        for (int i = 0; i < tableauPays.length; i++) {
            System.out.println(tableauPays[i]);
        }

        for (int i = 0; i < tableauPays.length; i++) {
            if (tableauPays[i]. equals("Italie")) {
                tableauPays[i] = "Belgique";
            }
        }

        List<String> nouvelleListe = new ArrayList<>(Arrays.asList(tableauPays));

        System.out.println("\nNouvelle liste après reconversion :");
        for (String p : nouvelleListe) {
            System.out.println("- " + p);
        }
    }

    void exercice17() {
        ArrayList<Double> notes = new ArrayList<>(Arrays.asList(14.5, 8.0, 16.0, 10.5, 12.0, 9.5, 18.0, 11.5));

        System.out.println("Liste avant tri :");
        for (Double note : notes) {
            System.out.print(note + " ");
        }
        System.out.println();

        Collections.sort(notes);

        System.out.println("\nListe après tri :");
        for (Double note :  notes) {
            System.out.print(note + " ");
        }
        System.out. println();

        double mediane;
        int taille = notes.size();

        if (taille % 2 == 0) {
            int milieu1 = taille / 2 - 1;
            int milieu2 = taille / 2;
            mediane = (notes.get(milieu1) + notes.get(milieu2)) / 2.0;
        } else {
            int centre = taille / 2;
            mediane = notes.get(centre);
        }

        System.out.println("\nMédiane :  " + mediane);
    }

    // partie 5

    void exercice18() {
        ArrayList<Double> notes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Gestion des notes ===");
            System.out.println("1. Ajouter une note");
            System.out.println("2. Supprimer une note");
            System.out.println("3. Afficher toutes les notes");
            System.out.println("4. Calculer la moyenne");
            System.out.println("5. Afficher notes > moyenne");
            System.out. println("6. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterNote(notes, scanner);
                    break;
                case 2:
                    supprimerNote(notes, scanner);
                    break;
                case 3:
                    afficherNotes(notes);
                    break;
                case 4:
                    calculerMoyenne(notes);
                    break;
                case 5:
                    notesSuperieures(notes);
                    break;
                case 6:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, entrez un numéro entre 1 et 6");
                    break;
            }
        }
    }

    void ajouterNote(ArrayList<Double> notes, Scanner scanner) {
        System.out.print("Entrez la note à ajouter : ");
        double note = scanner.nextDouble();
        notes.add(note);
        System.out.println("Note ajoutée avec succès !");
    }

    void supprimerNote(ArrayList<Double> notes, Scanner scanner) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note à supprimer !");
            return;
        }

        System.out. print("Entrez l'index de la note à supprimer (0-" + (notes.size() - 1) + ") : ");
        int index = scanner.nextInt();

        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
            System.out.println("Note supprimée avec succès !");
        } else {
            System.out.println("Erreur : index invalide !");
        }
    }

    void afficherNotes(ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note enregistrée.");
            return;
        }

        System.out.println("\n=== LISTE DES NOTES ===");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println("Note " + i + " : " + notes.get(i));
        }
    }

    void calculerMoyenne(ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out. println("Aucune note pour calculer la moyenne.");
            return;
        }

        double somme = 0.0;
        for (Double note :  notes) {
            somme += note;
        }
        double moyenne = somme / notes.size();

        System.out.println("Moyenne : " + moyenne);
    }

    void notesSuperieures(ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note enregistrée.");
            return;
        }

        // Calcul de la moyenne
        double somme = 0.0;
        for (Double note : notes) {
            somme += note;
        }
        double moyenne = somme / notes.size();

        System.out.println("\nMoyenne :  " + moyenne);
        System.out.println("Notes supérieures à la moyenne :");

        boolean aucune = true;
        for (Double note : notes) {
            if (note > moyenne) {
                System.out.println("- " + note);
                aucune = false;
            }
        }

        if (aucune) {
            System.out.println("Aucune note supérieure à la moyenne.");
        }
    }

    void exercice19() {
        ArrayList<String> nomsProduits = new ArrayList<>();
        ArrayList<Integer> quantites = new ArrayList<>();
        ArrayList<Double> prix = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Gestion de stock ===");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher le stock complet");
            System.out.println("3. Rechercher un produit par nom");
            System.out.println("4. Mettre à jour la quantité");
            System.out. println("5. Calculer la valeur totale du stock");
            System.out.println("6. Identifier les produits en rupture");
            System.out. println("7. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterProduit(nomsProduits, quantites, prix, scanner);
                    break;
                case 2:
                    afficherStock(nomsProduits, quantites, prix);
                    break;
                case 3:
                    rechercherProduit(nomsProduits, quantites, prix, scanner);
                    break;
                case 4:
                    mettreAJourQuantite(nomsProduits, quantites, scanner);
                    break;
                case 5:
                    calculerValeurTotale(quantites, prix);
                    break;
                case 6:
                    produitsEnRupture(nomsProduits, quantites);
                    break;
                case 7:
                    continuer = false;
                    System. out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, entrez un numéro entre 1 et 7");
                    break;
            }
        }
    }

    void ajouterProduit(ArrayList<String> noms, ArrayList<Integer> quantites, ArrayList<Double> prix, Scanner scanner) {
        System.out.print("Nom du produit : ");
        String nom = scanner.nextLine();

        System.out.print("Quantité : ");
        int quantite = scanner.nextInt();

        System.out.print("Prix unitaire : ");
        double prixUnit = scanner.nextDouble();
        scanner.nextLine();

        noms.add(nom);
        quantites.add(quantite);
        prix.add(prixUnit);

        System. out.println("Produit ajouté avec succès !");
    }

    void afficherStock(ArrayList<String> noms, ArrayList<Integer> quantites, ArrayList<Double> prix) {
        if (noms.isEmpty()) {
            System.out.println("Stock vide.");
            return;
        }

        System. out.println("\n=== STOCK COMPLET ===");
        System.out.printf("%-5s %-20s %-10s %-15s %-15s%n", "ID", "Nom", "Quantité", "Prix unitaire", "Valeur stock");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < noms.size(); i++) {
            double valeurStock = quantites.get(i) * prix.get(i);
            System.out.printf("%-5d %-20s %-10d %-15.2f € %-15.2f €%n",
                    i, noms.get(i), quantites.get(i), prix.get(i), valeurStock);
        }
    }

    void rechercherProduit(ArrayList<String> noms, ArrayList<Integer> quantites, ArrayList<Double> prix, Scanner scanner) {
        System.out. print("Nom du produit à rechercher : ");
        String nomRecherche = scanner.nextLine();

        int index = noms.indexOf(nomRecherche);

        if (index != -1) {
            System. out.println("\n=== Produit trouvé ===");
            System.out.println("Index : " + index);
            System.out.println("Nom :  " + noms.get(index));
            System.out.println("Quantité : " + quantites.get(index));
            System.out.println("Prix unitaire : " + prix.get(index) + " €");
        } else {
            System.out.println("Produit introuvable !");
        }
    }

    void mettreAJourQuantite(ArrayList<String> noms, ArrayList<Integer> quantites, Scanner scanner) {
        if (noms.isEmpty()) {
            System.out.println("Stock vide.");
            return;
        }

        System. out.print("Index du produit (0-" + (noms. size() - 1) + ") : ");
        int index = scanner.nextInt();

        if (index >= 0 && index < noms.size()) {
            System.out.print("Nouvelle quantité : ");
            int nouvelleQuantite = scanner.nextInt();
            quantites.set(index, nouvelleQuantite);
            System. out.println("Quantité mise à jour avec succès !");
        } else {
            System. out.println("Erreur :  index invalide !");
        }
    }

    void calculerValeurTotale(ArrayList<Integer> quantites, ArrayList<Double> prix) {
        double valeurTotale = 0.0;

        for (int i = 0; i < quantites.size(); i++) {
            valeurTotale += quantites.get(i) * prix.get(i);
        }

        System. out.println("Valeur totale du stock :  " + valeurTotale + " €");
    }

    void produitsEnRupture(ArrayList<String> noms, ArrayList<Integer> quantites) {
        System.out.println("\n=== Produits en rupture ===");
        boolean aucun = true;

        for (int i = 0; i < quantites.size(); i++) {
            if (quantites.get(i) == 0) {
                System. out.println("- " + noms.get(i));
                aucun = false;
            }
        }

        if (aucun) {
            System.out. println("Aucun produit en rupture.");
        }
    }

    void exercice20() {
        ArrayList<Double> ventesQuotidiennes = new ArrayList<>(Arrays.asList(
                150.0, 200.0, 120.0, 300.0, 180.0, 220.0, 250.0,
                190.0, 280.0, 210.0, 160.0, 290.0, 230.0, 270.0
        ));

        System.out.println("=== Analyse des ventes ===\n");

        double venteTotal = 0.0;
        double venteMax = ventesQuotidiennes.get(0);
        double venteMin = ventesQuotidiennes. get(0);
        int jourMax = 0;
        int jourMin = 0;

        for (int i = 0; i < ventesQuotidiennes.size(); i++) {
            double vente = ventesQuotidiennes.get(i);
            venteTotal += vente;

            if (vente > venteMax) {
                venteMax = vente;
                jourMax = i;
            }

            if (vente < venteMin) {
                venteMin = vente;
                jourMin = i;
            }
        }

        double venteMoyenne = venteTotal / ventesQuotidiennes.size();

        System.out.println("Vente totale : " + venteTotal + "€");
        System.out. printf("Vente moyenne : %.2f€%n", venteMoyenne);
        System.out.println("Meilleure vente : " + venteMax + "€ (jour " + (jourMax + 1) + ")");
        System.out. println("Pire vente :  " + venteMin + "€ (jour " + (jourMin + 1) + ")");


        int joursSupMoyenne = 0;
        for (Double vente : ventesQuotidiennes) {
            if (vente > venteMoyenne) {
                joursSupMoyenne++;
            }
        }

        double pourcentagePerformants = (joursSupMoyenne * 100.0) / ventesQuotidiennes.size();
        System.out.printf("Jours > moyenne : %d (%.2f%%)%n", joursSupMoyenne, pourcentagePerformants);


        double objectif = 250.0;
        int joursObjectifAtteint = 0;

        for (Double vente : ventesQuotidiennes) {
            if (vente >= objectif) {
                joursObjectifAtteint++;
            }
        }

        double tauxObjectif = (joursObjectifAtteint * 100.0) / ventesQuotidiennes.size();
        System.out.printf("Objectif atteint : %d jours (%.2f%%)%n", joursObjectifAtteint, tauxObjectif);


        ArrayList<Double> copieVentes = new ArrayList<>(ventesQuotidiennes);
        Collections.sort(copieVentes);
        Collections.reverse(copieVentes);

        System.out. print("Top 3 des ventes : ");
        for (int i = 0; i < 3 && i < copieVentes. size(); i++) {
            System.out.print(copieVentes.get(i) + "€");
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int tranche1 = 0; // 0-150€
        int tranche2 = 0; // 151-200€
        int tranche3 = 0; // 201-250€
        int tranche4 = 0; // >250€

        for (Double vente : ventesQuotidiennes) {
            if (vente <= 150) {
                tranche1++;
            } else if (vente <= 200) {
                tranche2++;
            } else if (vente <= 250) {
                tranche3++;
            } else {
                tranche4++;
            }
        }

        System.out.println("\nRépartition :");
        System.out.println("  0-150€ : " + tranche1 + " jours");
        System.out. println("  151-200€ : " + tranche2 + " jours");
        System.out.println("  201-250€ : " + tranche3 + " jours");
        System.out.println("  >250€ : " + tranche4 + " jours");
    }


    void run_all() {
        System.out.println("=== Exercice 1 ===");
        exercice1();

        System.out.println("\n=== Exercice 2 ===");
        testExercice2();

        System.out.println("\n=== Exercice 3 ===");
        testExercice3();

        System.out.println("\n=== Exercice 4 ===");
        testExercice4();

        System.out.println("\n=== Exercice 5 ===");
        testExercice5();

        System.out.println("\n=== Exercice 6 ===");
        exercice6();

        System.out.println("\n=== Exercice 7 ===");
        exercice7();

        System.out.println("\n=== Exercice 8 ===");
        exercice8();

        System.out.println("\n=== Exercice 9 ===");
        exercice9();

        System.out.println("\n=== Exercice 10 ===");
        exercice10();

        System.out.println("\n=== Exercice 11 ===");
        exercice11();

        System.out.println("\n=== Exercice 12 ===");
        exercice12();

        System.out.println("\n=== Exercice 13 ===");
        exercice13();

        System.out.println("\n=== Exercice 14 ===");
        exercice14();

        System.out.println("\n=== Exercice 15 ===");
        exercice15();

        System.out.println("\n=== Exercice 16 ===");
        exercice16();

        System.out.println("\n=== Exercice 17 ===");
        exercice17();

        System.out.println("\n=== Exercice 18 ===");
        exercice18();

        System.out.println("\n=== Exercice 19 ===");
        exercice19();

        System.out.println("\n=== Exercice 20 ===");
        exercice20();
    }
}
