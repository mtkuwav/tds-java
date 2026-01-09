package td3.exercice7;

public class Abonnement {
    private String idAbonnement;
    private String email;
    private String formule;
    private double prixMensuel;
    private boolean actif;

    public Abonnement(String idAbonnement, String email, String formule, double prixMensuel, boolean actif) {
        this.idAbonnement = idAbonnement;
        this.email = email;
        this.formule = formule;
        this.prixMensuel = prixMensuel;
        this.actif = actif;
    }

    public String getIdAbonnement() {
        return idAbonnement;
    }

    public String getEmail() {
        return email;
    }

    public String getFormule() {
        return formule;
    }

    public double getPrixMensuel() {
        return prixMensuel;
    }

    public boolean isActif() {
        return actif;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email invalide : doit contenir @ et .");
        }
    }

    public void setFormule(String formule) {
        if (formule.equals("Basic") || formule.equals("Standard") || formule.equals("Premium")) {
            this.formule = formule;
            if (formule.equals("Basic")) {
                this.prixMensuel = 9.99;
            } else if (formule.equals("Standard")) {
                this.prixMensuel = 14.99;
            } else {
                this.prixMensuel = 19.99;
            }
        } else {
            System.out.println("Formule invalide : doit être Basic, Standard ou Premium.");
        }
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public void afficherDetails() {
        System.out.println("Abonnement{" +
                "idAbonnement='" + idAbonnement + '\'' +
                ", email='" + email + '\'' +
                ", formule='" + formule + '\'' +
                ", prixMensuel=" + prixMensuel +
                ", actif=" + actif +
                '}');
    }

    public double calculerCoutAnnuel() {
        if (actif) {
            return prixMensuel * 12;
        }
        return 0;
    }
}

