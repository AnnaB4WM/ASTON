package Task1_1.Animals;

import Task1_1.AbstractClass.AMammal;

public class Whale extends AMammal {

    public Whale() {
    }

    public Whale(String name, boolean spine) {
        super(name, spine);
    }

    @Override
    public void habitat() {
        System.out.println("Кит " + getName() + " живет в воде");
    }
}
