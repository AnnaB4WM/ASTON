package StrategyPattern;

public abstract class Store {
    private PaymentMethodI paymentMethod;

    public Store() {
    }

    public void setPaymentMethod(PaymentMethodI paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    abstract void display();

    public void checkout(int amount) {
        paymentMethod.pay(amount);
    }

    public void getReceipt() {
        System.out.println("All stores issue a check!");
    }
}
