public class Terrestrial implements Omnivore<Food>{
    private String name;
    public Terrestrial(String name){
        this.name=name;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.PLANT) {
            System.out.println(name + " eats meat out of water");
        }
        else {
            System.out.println(name + " doesn't eat " + meat);
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(name + " eats plants out of water");
        }
        else {
            System.out.println(name + " doesn't eat " + plant);
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(name + " eats both meat and plants out of water");
        }
        else  {
            System.out.println(name + " is stupid and doesn't like " + food);
        }
    }
}
