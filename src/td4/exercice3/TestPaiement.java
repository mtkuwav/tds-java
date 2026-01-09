package td4.exercice3;

public class TestPaiement {
    public static void main(String[] args) {
        CarteBancaire carte = new CarteBancaire("Jean Dupont", 1000.0, "1234567890123456");
        PayPal paypal = new PayPal("Marie Martin", 500.0, "marie.martin@email.com");
        Crypto crypto = new Crypto("Pierre Durand", 2000.0, "0x742d35Cc6634C0532925a3b844Bc9e7595f0bEb");

        MoyenPaiement[] moyens = {carte, paypal, crypto};

        for (MoyenPaiement moyen : moyens) {
            System.out.println("\n=================");
            System.out.println("Type: " + moyen.getTypePaiement());
            moyen.afficherSolde();

            System.out.println("\n=== Paiement simple ===");
            moyen.effectuerTransaction(50.0);

            System.out.println("\n=== Paiement avec description ===");
            moyen.effectuerTransaction(30.0, "Achat en ligne");

            System.out.println("\n=== Paiement avec commission ===");
            moyen.effectuerTransaction(20.0, "Transfert international", 5.0);

            System.out.println("\n=== Solde final ===");
            moyen.afficherSolde();
        }
    }
}

