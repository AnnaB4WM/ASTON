package DecoratorPattern;

public class ThincrustPizza extends Pizza {

    public ThincrustPizza() {
        description = "Пицца на тонком тесте с томатным соусом";
    }

    @Override
    public double cost() {
        return 400.0;
    }
}
