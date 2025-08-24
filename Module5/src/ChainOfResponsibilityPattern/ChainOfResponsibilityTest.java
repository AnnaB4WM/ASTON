package ChainOfResponsibilityPattern;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        Handler handler1 = new SpamHandler();
        Handler handler2 = new FanHandler();

        handler1.setSuccessor(handler2);

        handler1.handleRequest(new Request(RequestType.SPAM));
        handler1.handleRequest(new Request(RequestType.FAN));
        handler1.handleRequest(new Request(RequestType.COMPLAINT));

    }
}
