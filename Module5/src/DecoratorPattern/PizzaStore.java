package DecoratorPattern;

public class PizzaStore {

    public static void main(String[] args) {

        Pizza simplePizza = new ThickcrustPizza();
        System.out.println(simplePizza.getDescription() + " - " + simplePizza.cost());
        System.out.println();

        Pizza margarita = new ThincrustPizza();
        margarita = new Cheese(margarita);
        margarita = new Olives(margarita);
        System.out.println(margarita.getDescription() + " - " + margarita.cost());
        System.out.println();

        Pizza myasnaya = new ThincrustPizza();
        myasnaya = new Cheese(myasnaya);
        myasnaya = new Olives(myasnaya);
        myasnaya = new Meat(myasnaya);
        System.out.println(myasnaya.getDescription() + " - " + myasnaya.cost());
    }
}
