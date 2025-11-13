public class Terrestrial implements Omnivore<Food>{
    private String name;
    public Terrestrial(String name){
        this.name=name;
    }
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.PLANT) {
            System.out.println(name + " eats " + food + " out of water");
        }
        else {
            System.out.println(name + " doesn't eat " + food);
        }
    }

    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println(name + " eats " + food + " out of water");
        }
        else {
            System.out.println(name + " doesn't eat " + food);
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
