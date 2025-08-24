package BuilderPattern;

public interface PizzaBuilderI {
    void buildDough();

    void buildSauce();

    void buildToppings();

    Pizza getPizza();
}
