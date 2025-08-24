package ChainOfResponsibilityPattern;

public class SpamHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.SPAM) {
            System.out.println("Spam detected, handling request");
        }
        else if (successor!= null) {
                successor.handleRequest(request);
        }
    }
}
