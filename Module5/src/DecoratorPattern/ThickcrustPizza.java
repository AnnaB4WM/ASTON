package DecoratorPattern;

public class ThickcrustPizza extends Pizza {

    public ThickcrustPizza() {
        description = "Пицца на толстом тесте с томатным соусом";
    }

    @Override
    public double cost() {
        return 350.0;
    }
}
