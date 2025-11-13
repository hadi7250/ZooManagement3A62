public class Penguin extends Aquatic{
    private String name;

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eatMeat(Food food) {
        if (food == food.MEAT){
            System.out.println("mmm fish " + food +" yummy");
        }
        else{
            System.out.println("tra feya bagra? i don't eat " + food);
        }
    }
}
