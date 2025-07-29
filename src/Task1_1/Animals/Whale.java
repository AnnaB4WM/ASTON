package Task1_1.Animals;

import Task1_1.AbstractClass.AMammal;
import Task1_1.Interface.ILivesInWater;

public class Whale extends AMammal implements ILivesInWater {

    public Whale() {
    }

    public Whale(String name, boolean spine) {
        super(name, spine);
    }

    @Override
    public void livesInWater() {
        System.out.println("Кит " + getName() + " живет в воде");
    }
}
