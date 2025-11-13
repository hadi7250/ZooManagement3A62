public class Aquatic implements Carnivore <Food>{
    private String name;
    public Aquatic(String name) {
        this.name= name;
    }

    @Override
    public void eatMeat(Food meat)
    {
        if (meat == Food.MEAT)
        {
            System.out.println(name + " eats meat in water");
        }
        else
        {
            System.out.println(name + " won't eat" + meat);
        }
    }
}
