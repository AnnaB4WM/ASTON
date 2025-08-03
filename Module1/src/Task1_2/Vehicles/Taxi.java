package Task1_2.Vehicles;

import Task1_2.AbstractClass.AVehicle;
import Task1_2.Interface.IWheel;

public class Taxi extends AVehicle {

    public Taxi() {
    }

    public Taxi(String name, IWheel wheel) {
        super(name, wheel);
    }
}
