package AdapterPattern;

public class SystemTest {
    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem();
        SystemAdapter systemAdapter = new SystemAdapter(newSystem);
        systemAdapter.clientRequest();

    }
}
