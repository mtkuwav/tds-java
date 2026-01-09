public class Td1 {
    void exercice1() {
        System.out.println("************************");
        System.out.println("  * Debut TD 1 Java *  ");
        System.out.println("************************");
    }

    void exercice2() {
        String nom = "Doe";
        String prenom = "John";
        int age = 27;
        String ville = "Lyon";
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Âge: " + age);
        System.out.println("Ville: " + ville);
    }

    void exercice3() {
        int entier = 42;
        double decimal = 3.14;
        boolean vrai = true;
        char lettre = 'A';

        System.out.println("int: " + entier);
        System.out.println("double: " + decimal);
        System.out.println("boolean: " + vrai);
        System.out.println("char: " + lettre);
    }

    void exercice4() {
        int a = 10;
        int b = 5;

        System.out.println("Somme:  " + (a + b));
        System.out.println("Différence: " + (a - b));
        System.out. println("Produit: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    void exercice5() {
        int a = 7;
        int b = 2;
        System.out.println("Division avec int: " + (a / b));
        
        double aDouble = 7.0;
        double bDouble = 2.0;
        System. out.println("Division avec double: " + (aDouble / bDouble));

        System.out.println("Explication:  Avec int, la division donne 3 (division entière). Avec double, la division donne 3.5 (division décimale).");
    }

    void exercice6() {
        double note1 = 15.5;
        double note2 = 12.0;
        double note3 = 17.5;

        double moyenne = (note1 + note2 + note3) / 3;

        System.out.println("La moyenne est :  " + moyenne);
    }

    void exercice7() {
        double prixHT = 100.0;
        double tauxTVA = 0.20;

        double montantTVA = prixHT * tauxTVA;
        double prixTTC = prixHT + montantTVA;

        System.out.println("Prix HT: " + prixHT + " €");
        System.out.println("Taux TVA:  " + (tauxTVA * 100) + " %");
        System.out. println("Montant TVA: " + montantTVA + " €");
        System.out.println("Prix TTC: " + prixTTC + " €");
    }

    void exercice8() {
        int dureeMinutes = 135;

        int heures = dureeMinutes / 60;
        int minutes = dureeMinutes % 60;

        System.out.println(dureeMinutes + " minutes = " + heures + " heure(s) et " + minutes + " minute(s)");
    }

    void exercice9() {
        System.out.println("(5 + 3) * 2 = " + ((5 + 3) * 2));
        System.out. println("10 / 3 = " + (10 / 3));
        System.out. println("10.0 / 3 = " + (10.0 / 3));
    }

    void exercice10() {
        int x = 5;
        int y = 10;

        System.out.println("Avant échange:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Après échange:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    void exercice11() {
        int anneeNaissance = 1999;
        int anneeActuelle = 2026;

        int age = anneeActuelle - anneeNaissance;

        System.out.println("Année de naissance: " + anneeNaissance);
        System.out.println("Âge approximatif: " + age + " ans");
    }

    void exercice12() {
        System.out.println("************************");
        System.out.println("   * fin TD 1 Java *  ");
        System.out.println("************************");
    }
    
    void run_all() {
        System.out.println("=== Exercice 1 ===");
        exercice1();

        System.out.println("\n=== Exercice 2 ===");
        exercice2();

        System.out.println("\n=== Exercice 3 ===");
        exercice3();

        System.out.println("\n=== Exercice 4 ===");
        exercice4();

        System.out.println("\n=== Exercice 5 ===");
        exercice5();

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
    }
}
