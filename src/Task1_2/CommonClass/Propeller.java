package Task1_2.CommonClass;

import Task1_2.Interface.IPropeller;

public class Propeller implements IPropeller {

    private String material;

    @Override
    public void rotate() {
        System.out.println("Винт вращается, сделан из " + material);
    }

    @Override
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
