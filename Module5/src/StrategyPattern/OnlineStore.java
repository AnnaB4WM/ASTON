package StrategyPattern;

public class OnlineStore extends Store {

    public OnlineStore() {
        setPaymentMethod(new CreditCardPayment("1234567890123456", "John Doe"));
    }

    @Override
    void display() {
        System.out.println("This is an Online Store");
    }
}
