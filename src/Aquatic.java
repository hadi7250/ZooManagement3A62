public class Aquatic implements Carnivore <Food>{
    private String name;
    public Aquatic(String name) {
        this.name= name;
    }

    @Override
    public void eatMeat(Food food)
    {
        if (food == Food.MEAT)
        {
            System.out.println(name + " eats meat in water");
        }
        else
        {
            System.out.println(name + " won't eat " + food);
        }
    }
}
