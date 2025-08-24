package BuilderPattern;

public class MeatPizzaBuilder implements PizzaBuilderI {

    private Pizza pizza;

    public MeatPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildSauce() {
    pizza.setSauce("Tomato Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.setTopping("Pepperoni + salami");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
