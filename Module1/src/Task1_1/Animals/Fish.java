package Task1_1.Animals;

import Task1_1.Interface.IAnimal;
import Task1_1.Interface.ILivesInWater;

public class Fish implements IAnimal, ILivesInWater {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void livesInWater() {
        System.out.println("Рыба " + getName() + " живет в воде");
    }
}
