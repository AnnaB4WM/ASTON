package DecoratorPattern;

public class Meat extends ToppingsDecorator {

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", с мясом";
    }

    @Override
    public double cost() {
        return pizza.cost() + 100.0;
    }
}
