import java.util.Scanner;

class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int nbrCages;
            String zooName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Zoo: ");
        zooName = sc.nextLine();
        System.out.println("Entre the number of the cages: ");
        nbrCages = sc.nextInt();
        System.out.println("Zoo name: " + zooName);
        System.out.println("Number of the cages: " + nbrCages);
    }
}
