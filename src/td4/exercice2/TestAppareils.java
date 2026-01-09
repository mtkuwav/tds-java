package td4.exercice2;

public class TestAppareils {
    public static void cycleRecharge(Rechargeable appareil) {
        System.out.println("--- Cycle de recharge ---");
        appareil.afficherBatterie();
        appareil.recharger();
        appareil.afficherBatterie();
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S23", 899.0, 0.168);
        OrdinateurPortable ordinateur = new OrdinateurPortable("Dell", "XPS 15", 1499.0, 1.8);
        Tablette tablette = new Tablette("Apple", "iPad Air", 699.0, 0.461);

        AppareilElectronique[] appareils = {smartphone, ordinateur, tablette};

        for (AppareilElectronique appareil : appareils) {
            System.out.println("\n=================");
            appareil.afficherCaracteristiques();
            appareil.allumer();

            if (appareil instanceof Rechargeable) {
                Rechargeable r = (Rechargeable) appareil;
                r.afficherBatterie();
                r.recharger();
            }

            if (appareil instanceof Portable) {
                Portable p = (Portable) appareil;
                p.afficherPortabilite();
            }

            if (appareil instanceof Connecte) {
                Connecte c = (Connecte) appareil;
                c.connecterWifi("MonReseau");
                System.out.println("Connecté: " + c.estConnecte());
                c.deconnecter();
            }

            if (appareil instanceof Rechargeable) {
                Rechargeable r = (Rechargeable) appareil;
                r.afficherBatterie();
            }
        }

        System.out.println("\n=================");
        cycleRecharge(smartphone);
    }
}

