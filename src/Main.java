public class Main {
    public static void main(String[] args) {

        AffectationHashMap map = new AffectationHashMap();

        Employee e1 = new Employee(1, 3, "Hedi", "Ali", "IT");
        Employee e2 = new Employee(2, 2, "Sami", "Zou", "HR");
        Employee e3 = new Employee(3, 4, "Mouna", "Ben", "Finance");

        Department d1 = new Department(10, 30, "IT");
        Department d2 = new Department(20, 15, "Finance");
        Department d3 = new Department(30, 10, "HR");

        map.ajouterEmployeeDepartment(e1, d1);
        map.ajouterEmployeeDepartment(e2, d2);
        map.ajouterEmployeeDepartment(e3, d3);

        map.afficherEmployeesEtDepartments();

        map.ajouterEmployeeDepartment(e1, d3);
        map.afficherEmployeesEtDepartments();

        map.supprimerEmployee(e2);
        map.afficherEmployeesEtDepartments();

        System.out.println("===== SORTED BY EMPLOYEE ID =====");
        System.out.println(map.trierMap());

        System.out.println("===== SEARCH TESTS =====");

        Employee searchEmp = new Employee(2, 2, "Sami", "Zou", "HR");
        Department searchDept = new Department(20, 15, "Finance");

        System.out.println("employee " + searchEmp.getNom() + " yekhdem m3ana? "
                + map.rechercherEmployee(searchEmp));

        System.out.println("department " + searchDept.getNomDepart() + " mawjouda fel organization?? "
                + map.rechercherDepartment(searchDept));

        //prosit12 man7otouhouch fil main???
    }
}
