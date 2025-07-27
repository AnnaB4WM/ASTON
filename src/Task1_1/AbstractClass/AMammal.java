package Task1_1.AbstractClass;

import Task1_1.Interface.IAnimal;

public abstract class AMammal implements IAnimal {

    private String name;
    private boolean spine;

    public AMammal() {
    }

    public AMammal(String name, boolean spine) {
        this.name = name;
        this.spine = spine;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasSpine() {
        return spine;
    }

    public void setSpine(boolean spine) {
        this.spine = spine;
    }
}
