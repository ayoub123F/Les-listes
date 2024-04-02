import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {

    public static void main(String[] args) {
        ArrayList<Produit> listeProduits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ajouter des produits
        listeProduits.add(new Produit(1, "Produit 1", 10.99));
        listeProduits.add(new Produit(2, "Produit 2", 20.49));
        listeProduits.add(new Produit(3, "Produit 3", 5.99));

        // Afficher la liste des produits
        System.out.println("Liste des produits : ");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        // Supprimer un produit par indice
        System.out.print("Entrez l'indice du produit à supprimer : ");
        int indiceSuppression = scanner.nextInt();
        listeProduits.remove(indiceSuppression);

        // Afficher la liste des produits après suppression
        System.out.println("Liste des produits après suppression : ");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        // Modifier un produit par indice
        System.out.print("Entrez l'indice du produit à modifier : ");
        int indiceModification = scanner.nextInt();
        Produit produitAModifier = listeProduits.get(indiceModification);
        System.out.print("Entrez le nouveau nom : ");
        scanner.nextLine(); // Pour consommer la nouvelle ligne
        String nouveauNom = scanner.nextLine();
        produitAModifier.setNom(nouveauNom);
        System.out.print("Entrez le nouveau prix : ");
        double nouveauPrix = scanner.nextDouble();
        produitAModifier.setPrix(nouveauPrix);

        // Afficher la liste des produits après modification
        System.out.println("Liste des produits après modification : ");
        for (Produit produit : listeProduits) {
            System.out.println(produit);
        }

        // Rechercher un produit par nom
        System.out.print("Entrez le nom du produit à rechercher : ");
        String nomRecherche = scanner.next();
        for (Produit produit : listeProduits) {
            if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouvé : " + produit);
                break; // On arrête dès qu'on trouve le produit
            }
        }
    }
}
