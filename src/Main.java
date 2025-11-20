public class Main {
    public static void main(String[] args) {

        DepartementHashSet societe = new DepartementHashSet();

        Department d1 = new Department(1, 300000, "Esprit");
        Department d2 = new Department(2, 300000, "Lbattala");
        Department d3 = new Department(3, 3, "Lkhadema");

        societe.ajouterDepartement(d1);
        societe.ajouterDepartement(d2);
        societe.ajouterDepartement(d3);

        System.out.println("\nListe des départements :");
        societe.displayDepartement();

        System.out.println("\nRecherche 'Lkhadema' : " + societe.rechercherDepartement("Lkhadema"));
        societe.supprimerDepartement(d1);
        System.out.println("\nTri par ID et la detruire d'esprit:");
        System.out.println(societe.trierDepartementById());
        System.out.println("\nRecherche 'Esprit' : " + societe.rechercherDepartement(d1));
    }
}
