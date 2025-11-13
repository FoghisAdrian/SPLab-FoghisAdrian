package filters;

public class RequestLoggingFilter extends RequestHandler {
    @Override
    protected void process(String request) {
        System.out.println("[LOG] Processing request: " + request);
    }
}