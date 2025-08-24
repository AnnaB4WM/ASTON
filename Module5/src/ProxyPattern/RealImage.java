package ProxyPattern;

public class RealImage implements ImageI {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
