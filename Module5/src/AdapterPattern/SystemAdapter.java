package AdapterPattern;

public class SystemAdapter implements OldSystem {
    private NewSystem newSystem;

    public SystemAdapter(NewSystem newSystem) {
        this.newSystem = newSystem;
    }

    public void clientRequest() {
        newSystem.specificRequest();
    }
}
