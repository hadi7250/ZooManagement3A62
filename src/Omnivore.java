public interface Omnivore <T> extends Herbivore <T>, Carnivore <T>{
    void eatPlantAndMeat(T food);
}
