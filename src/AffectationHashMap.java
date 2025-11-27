import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employee, Department> map = new HashMap<>();

    public void ajouterEmployeeDepartment(Employee e, Department d) {
        map.put(e, d);
    }

    public void afficherEmployeesEtDepartments() {
        System.out.println("===== EMPLOYEES & DEPARTMENTS =====");
        for (Map.Entry<Employee, Department> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  -> " + entry.getValue());
            System.out.println("-----------------------------------");
        }
    }

    public void supprimerEmployee(Employee e) {
        map.remove(e);
    }

    public void supprimerEmployeeEtDepartment(Employee e, Department d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployees() {
        System.out.println("===== EMPLOYEES =====");
        for (Employee e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartments() {
        System.out.println("===== DEPARTMENTS =====");
        for (Department d : map.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmployee(Employee e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartment(Department d) {
        return map.containsValue(d);
    }

    public TreeMap<Employee, Department> trierMap() {
        return new TreeMap<>(map);
    }
}
