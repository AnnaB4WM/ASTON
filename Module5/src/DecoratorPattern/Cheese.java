package DecoratorPattern;

public class Cheese extends ToppingsDecorator {

    public Cheese(Pizza pizza) {
       this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с сыром";
    }

    @Override
    public double cost() {
        return pizza.cost() + 80.0;
    }
}
