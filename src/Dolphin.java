public class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public Dolphin(){
    }

    public Dolphin(float swimmingSpeed, String habitat){
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
}
