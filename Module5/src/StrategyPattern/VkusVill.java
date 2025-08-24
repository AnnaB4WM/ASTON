package StrategyPattern;

public class VkusVill extends Store {

    public VkusVill() {
        setPaymentMethod(new CashPayment());
    }

    @Override
    void display() {
        System.out.println("Welcome to VkusVill!");
    }
}
