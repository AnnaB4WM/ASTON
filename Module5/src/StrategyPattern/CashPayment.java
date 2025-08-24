package StrategyPattern;

public class CashPayment implements PaymentMethodI {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with cash.");
    }
}
