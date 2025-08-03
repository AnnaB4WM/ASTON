package Task1_2.Interface;

public interface IVehicle {

    default void transportGoods() {
        System.out.println(getName() + " возит грузы");
    };

    String getName();
    IWing getWing();
    IWheel getWheel();
    IPropeller getPropeller();
}
