package Task1_2.Vehicles;

import Task1_2.AbstractClass.AVehicle;
import Task1_2.Interface.IPropeller;

public class Tanker extends AVehicle {

    public Tanker() {
    }

    public Tanker(String name, IPropeller propeller) {
        super(name, propeller);
    }

    @Override
    public void transportGoods() {
        System.out.println(getName() + " возит грузы");
    }
}
