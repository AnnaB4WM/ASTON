package DecoratorPattern;

public abstract class ToppingsDecorator extends Pizza {

    Pizza pizza;

    public abstract String getDescription();
}
