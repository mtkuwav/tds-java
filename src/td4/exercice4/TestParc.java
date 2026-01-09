package td4.exercice4;

public class TestParc {
    public static void main(String[] args) {
        Equipement[] parc = {
            new Ordinateur("PC-001", "Bureau 201", true, "Windows 11"),
            new Ordinateur("PC-002", "Bureau 305", true, "Linux Ubuntu"),
            new Imprimante("IMP-001", "Salle de réunion", true, 15),
            new Imprimante("IMP-002", "Accueil", true, 45),
            new Serveur("SRV-001", "Salle serveurs", true, 16)
        };

        int nbOrdinateurs = 0;
        int nbImprimantes = 0;
        int nbServeurs = 0;

        for (Equipement eq : parc) {
            GestionParc.diagnostiquerEquipement(eq);

            if (eq instanceof Ordinateur) {
                nbOrdinateurs++;
            } else if (eq instanceof Imprimante) {
                nbImprimantes++;
            } else if (eq instanceof Serveur) {
                nbServeurs++;
            }
        }

        System.out.println("=== Stats finales ===");
        System.out.println("Nombre d'ordinateurs: " + nbOrdinateurs);
        System.out.println("Nombre d'imprimantes: " + nbImprimantes);
        System.out.println("Nombre de serveurs: " + nbServeurs);
        System.out.println("Total d'équipements: " + parc.length);
    }
}

