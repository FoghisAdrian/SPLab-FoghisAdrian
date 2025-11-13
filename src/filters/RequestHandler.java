package filters;

public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler setNext(RequestHandler next) {
        this.next = next;
        return next;
    }

    public void handle(String request) {
        process(request);
        if (next != null) next.handle(request);
    }

    protected abstract void process(String request);
}
