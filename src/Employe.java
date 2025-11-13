public class Employe implements Comparable <Employe>{
    private int id, grade;
    private String nom, prenom, departement;

    public Employe(int id, String nom, String prenom, String departement, int grade) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
    }

    public int getGrade() {return grade;}
    public void setGrade(int grade) {this.grade = grade;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public String getDepartement() {return departement;}
    public void setDepartement(String departement) {this.departement = departement;}

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Employe other)) return false;
        return this.id == other.id && this.nom.equalsIgnoreCase(other.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe other) {
        return Integer.compare(this.id, other.id);
    }
}