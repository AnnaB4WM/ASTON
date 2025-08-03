package Task1_2;

import Task1_2.CommonClass.AircraftWing;
import Task1_2.CommonClass.Propeller;
import Task1_2.CommonClass.Wheel;
import Task1_2.Vehicles.Aircraft;
import Task1_2.Vehicles.Truck;

public class Main {

    public static void main(String[] args) {

        AircraftWing aircraftWing = new AircraftWing();
        aircraftWing.setSize(68);
        aircraftWing.open();

        Propeller propeller = new Propeller();
        propeller.setMaterial("сталь");
        propeller.rotate();

        Wheel wheel = new Wheel();
        wheel.setAmount(4);
        wheel.turnRight();

        Aircraft aircraft = new Aircraft();
        aircraft.setName("Боинг");
        aircraft.setPropeller(propeller);
        aircraft.setWing(aircraftWing);
        aircraft.setWheel(wheel);
        aircraft.transportGoods();

        Truck truck = new Truck();
        truck.setName("Фирма");
        truck.setWheel(wheel);
        truck.transportGoods();



    }
}
