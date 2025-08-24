package ProxyPattern;

public class ProxyPatternTest {

    public static void main(String[] args) {
        ImageI image = new ProxyImage("test.jpg");
        image.display();
        System.out.println();
        image.display();
    }
}
