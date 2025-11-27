public class Department implements Comparable<Department> {

    private int id;
    private int nbrEmployees;
    private String nomDepart;

    public Department() {
    }

    public Department(int id, int nbrEmployees, String nomDepart) {
        this.id = id;
        this.nbrEmployees = nbrEmployees;
        this.nomDepart = nomDepart;
    }

    public int getId() { return id; }
    public int getNbrEmployees() { return nbrEmployees; }
    public String getNomDepart() { return nomDepart; }

    public void setId(int id) { this.id = id; }
    public void setNbrEmployees(int nbrEmployees) { this.nbrEmployees = nbrEmployees; }
    public void setNomDepart(String nomDepart) { this.nomDepart = nomDepart; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Department)) return false;
        Department d = (Department) o;
        return this.id == d.id && this.nomDepart.equalsIgnoreCase(d.nomDepart);
    }

    @Override
    public int hashCode() {
        return id * 31 + nomDepart.toLowerCase().hashCode();
    }

    @Override
    public int compareTo(Department o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "[Department: id=" + id +
                ", nbrEmployees=" + nbrEmployees +
                ", nomDepart=" + nomDepart + "]";
    }
}
