package Task1_2.CommonClass;

import Task1_2.Interface.IWheel;

public class Wheel implements IWheel {

    private int amount;

    @Override
    public void turnRight() {
        System.out.println("Колеса поворачивают - " + amount);
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
