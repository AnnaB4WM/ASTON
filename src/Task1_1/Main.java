package Task1_1;

import Task1_1.Animals.Bear;
import Task1_1.Animals.Cat;
import Task1_1.Animals.Fish;
import Task1_1.Animals.Whale;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("красная");
        fish.habitat();

        Whale whale = new Whale("Касатка", true);
        whale.habitat();

        Cat cat = new Cat();
        cat.hasFur();

        Bear bear = new Bear("Белый", true, true);

    }
}
