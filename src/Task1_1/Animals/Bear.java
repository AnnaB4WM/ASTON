package Task1_1.Animals;

import Task1_1.AbstractClass.AMammal;

public class Bear extends AMammal {

    private boolean fur;

    public Bear() {
    }

    public Bear(String name, boolean spine, boolean fur) {
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
