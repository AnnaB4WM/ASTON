package DecoratorPattern;

public class Olives extends ToppingsDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с оливками";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.0;
    }
}
