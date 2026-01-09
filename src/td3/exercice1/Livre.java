package td3.exercice1;

public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return titre + " par " + auteur + " (" + anneePublication + ") " + "- Disponible : " + disponible;
    }
}
