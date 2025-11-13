public class Main {
    public static void main(String[] args) {

        Aquatic shark = new Aquatic("Shark");
        Penguin penguin = new Penguin("Ping");
        Terrestrial bear = new Terrestrial("Bear");

        shark.eatMeat(Food.MEAT);
        shark.eatMeat(Food.PLANT);

        penguin.eatMeat(Food.MEAT);
        penguin.eatMeat(Food.PLANT);

        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT);
        bear.eatPlantAndMeat(Food.BOTH);
    }
}
