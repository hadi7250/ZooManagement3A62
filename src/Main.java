public class Main {
    public static void main(String[] args) {

        Aquatic shark = new Aquatic("Shark");
        //Penguin penguin = new Penguin("Ping");
        Terrestrial bear = new Terrestrial("Bear");

        // Test Aquatic
        shark.eatMeat(Food.MEAT);
        shark.eatMeat(Food.PLANT);

        // Test Penguin
        /*penguin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.PLANT); ERREUR PENGUIN N'EXISTE PAS (ey ok na3mel class penguin wala n5aliha haka)*/

        // Test Terrestrial
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT);
        bear.eatPlantAndMeat(Food.BOTH);
    }
}
