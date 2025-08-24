package StrategyPattern;

public class CreditCardPayment implements PaymentMethodI {

    private String cardNumber;
    private  String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
