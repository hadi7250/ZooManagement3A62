public class Main {
    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic("Sea");
        Terrestrial terrestrial = new Terrestrial(4);
        Dolphin dolphin = new Dolphin(35.5f , "Ocean");
        Penguin penguin = new Penguin(20.0f, "Antarctica");

        System.out.println("Habitat: " + aquatic.habitat);
        System.out.println("Terrestrial legs: " + terrestrial.nbrLegs);
        System.out.println("Dolphin swims at " + dolphin.swimmingSpeed + " km/h in " + dolphin.habitat);
        System.out.println("Penguin swims at depth " + penguin.swimmingDepth + " m in " + penguin.habitat);
    }
}

