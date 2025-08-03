package Task1_2.Vehicles;

import Task1_2.AbstractClass.AVehicle;
import Task1_2.Interface.IPropeller;
import Task1_2.Interface.IWheel;
import Task1_2.Interface.IWing;

public class Aircraft extends AVehicle {

    public Aircraft() {
    }

    public Aircraft(String name, IWing wing, IWheel wheel, IPropeller propeller) {
        super(name, wing, wheel, propeller);
    }

    @Override
    public void transportGoods() {
        System.out.println(getName() + " возит грузы");
    }
}
