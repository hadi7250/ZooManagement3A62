public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin(){
    }

    public Penguin(float swimmingSpeed, String habitat){
        super(habitat);
        this.swimmingDepth = swimmingSpeed;
    }
}
