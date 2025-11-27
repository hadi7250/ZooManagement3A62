public class Employee implements Comparable<Employee> {

    private int id;
    private int grade;
    private String nom;
    private String prenom;
    private String nomDepart;

    public Employee() {
    }

    public Employee(int id, int grade, String nom, String prenom, String nomDepart) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
    }

    public int getId() { return id; }
    public int getGrade() { return grade; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNomDepart() { return nomDepart; }

    public void setId(int id) { this.id = id; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setNomDepart(String nomDepart) { this.nomDepart = nomDepart; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.id == e.id && this.nom.equalsIgnoreCase(e.nom);
    }

    @Override
    public int hashCode() {
        return id * 31 + nom.toLowerCase().hashCode();
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "[Employee: id=" + id +
                ", grade=" + grade +
                ", nom=" + nom +
                ", prenom=" + prenom +
                ", depart=" + nomDepart + "]";
    }
}
