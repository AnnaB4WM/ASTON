package BuilderPattern;

public class VeggiePizzaBuilder implements PizzaBuilderI {
    private Pizza pizza;

    public VeggiePizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thick crust dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato sauce");

    }

    @Override
    public void buildToppings() {
        pizza.setTopping("Cheese + Mushrooms + Onions + Peppers + Olives");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
