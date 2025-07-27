package Task1_2.CommonClass;

import Task1_2.Interface.IWing;

public class AircraftWing implements IWing {

    private int size;

    @Override
    public void open() {
        System.out.println("Крылья открыты, их размер - " + getSize() + " м");
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
