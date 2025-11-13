import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom){
        for (Employe e : employes){
            if (e.getNom().equalsIgnoreCase(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e){
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes){
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId(){
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade(){
        employes.sort(new Comparator<Employe>() {
           @Override
           public int compare(Employe e1, Employe e2) {
               int diffNom = e1.getNom().compareTo(e2.getNom());
               if (diffNom != 0) return diffNom;

               int diffDept = e1.getDepartement().compareTo(e2.getDepartement());
               if (diffDept != 0) return diffDept;

               return Integer.compare(e1.getGrade(), e2.getGrade());
           }
        });
    }
}
