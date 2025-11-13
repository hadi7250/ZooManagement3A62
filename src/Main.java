public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(51235, "Ahmed", "Mohamed", "HR", 3);
        Employe e2 = new Employe(23156, "Abdullah", "Sami", "Finance", 2);
        Employe e3 = new Employe(32114, "Hedi", "Ammar", "Maintenance", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("List of employees: ");
        societe.displayEmploye();

        System.out.println("\n search by name (Hedi): " + societe.rechercherEmploye("Hedi"));
        System.out.println("\n search by name (khouna): " + societe.rechercherEmploye("khouna"));


        System.out.println("\n Suppression of e2:");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        System.out.println("\n sorting by id: ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n sorting by name, department and grade: ");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}
