package td4.exercice4;

public class GestionParc {
    public static void diagnostiquerEquipement(Equipement eq) {
        System.out.println("\n=== Diagnostic ===");
        eq.afficherEtat();
        System.out.println();
        eq.effectuerMaintenance();
        System.out.println();

        if (eq instanceof Ordinateur) {
            Ordinateur ordi = (Ordinateur) eq;
            System.out.println("Système d'exploitation: " + ordi.getSystemeExploitation());
            ordi.redemarrer();
        } else if (eq instanceof Imprimante) {
            Imprimante imp = (Imprimante) eq;
            System.out.println("Niveau d'encre: " + imp.getNiveauEncre() + "%");
            if (imp.getNiveauEncre() < 20) {
                imp.remplacerCartouche();
            }
        } else if (eq instanceof Serveur) {
            Serveur serv = (Serveur) eq;
            System.out.println("Nombre de CPUs: " + serv.getNombreCPU());
            serv.sauvegarder();
        }
    }
}

