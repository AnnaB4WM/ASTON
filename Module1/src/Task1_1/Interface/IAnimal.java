package Task1_1.Interface;

public interface IAnimal {

    default void habitat() {
        System.out.println("Среда обитания");
    };

    String getName();
}
