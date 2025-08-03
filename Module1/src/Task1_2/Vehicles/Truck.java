package Task1_2.Vehicles;

import Task1_2.AbstractClass.AVehicle;
import Task1_2.Interface.IWheel;

public class Truck extends AVehicle {

    public Truck() {
    }

    public Truck(String name, IWheel wheel) {
        super(name, wheel);
    }

    @Override
    public void transportGoods() {
        System.out.println(getName() + " возит грузы");
    }
}
