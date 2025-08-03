package Task1_1.Animals;

import Task1_1.AbstractClass.AMammal;

public class Cat extends AMammal {

    private boolean fur;

    public Cat() {
    }

    public Cat(String name, boolean spine, boolean fur) {
        super(name, spine);
        this.fur = fur;
    }

    public boolean hasFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }
}
