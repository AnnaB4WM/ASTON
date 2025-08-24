package ChainOfResponsibilityPattern;

public class FanHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.FAN) {
            System.out.println("FanHandler handles the request");
        }
        else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
