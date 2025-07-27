package Task1_2.Vehicles;

import Task1_2.AbstractClass.AVehicle;
import Task1_2.Interface.IPropeller;
import Task1_2.Interface.IWheel;

public class Helicopter extends AVehicle {

    public Helicopter() {
    }

    public Helicopter(String name, IWheel wheel, IPropeller propeller) {
        super(name, wheel, propeller);
    }

    @Override
    public void transportGoods() {
        System.out.println(getName() + " возит грузы");
    }
}
