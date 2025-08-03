package Task1_2.AbstractClass;

import Task1_2.Interface.IPropeller;
import Task1_2.Interface.IVehicle;
import Task1_2.Interface.IWheel;
import Task1_2.Interface.IWing;

public abstract class AVehicle implements IVehicle {

    private String name;
    private IWing wing;
    private IWheel wheel;
    private IPropeller propeller;

    public AVehicle() {
    }

    public AVehicle(String name, IPropeller propeller) {
        this.name = name;
        this.propeller = propeller;
    }

    public AVehicle(String name, IWheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public AVehicle(String name, IWheel wheel, IPropeller propeller) {
        this.name = name;
        this.wheel = wheel;
        this.propeller = propeller;
    }

    public AVehicle(String name, IWing wing, IWheel wheel, IPropeller propeller) {
        this.name = name;
        this.wing = wing;
        this.wheel = wheel;
        this.propeller = propeller;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IWing getWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }

    @Override
    public IWheel getWheel() {
        return wheel;
    }

    public void setWheel(IWheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public IPropeller getPropeller() {
        return propeller;
    }

    public void setPropeller(IPropeller propeller) {
        this.propeller = propeller;
    }
}
