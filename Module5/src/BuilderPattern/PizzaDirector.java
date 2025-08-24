package BuilderPattern;

public class PizzaDirector {

    private PizzaBuilderI pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilderI pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza buildPizza() {
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
        return pizzaBuilder.getPizza();
    }

    public static void main(String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();

        PizzaBuilderI meatPizzaBuilder = new MeatPizzaBuilder();
        pizzaDirector.setPizzaBuilder(meatPizzaBuilder);
        Pizza meatPizza = pizzaDirector.buildPizza();
        System.out.println("Мясная пицца: " + meatPizza);

        PizzaBuilderI veggiePizzaBuilder = new VeggiePizzaBuilder();
        pizzaDirector.setPizzaBuilder(veggiePizzaBuilder);
        Pizza veggiePizza = pizzaDirector.buildPizza();
        System.out.println("Вегетарианская пицца: " + veggiePizza);
    }
}
