package Task1_1.Animals;

import Task1_1.Interface.IAnimal;

public class Fish implements IAnimal {

    private String name;

    @Override
    public void habitat() {
        System.out.println("Рыба " + getName() + " живет в воде");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
