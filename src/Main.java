import controller.BooksController;
import models.Book;
import services.BooksService;

public class Main {
    public static void main(String[] args) {
        BooksService booksService = new BooksService();
        BooksController controller = new BooksController(booksService);

        // Simulate requests
        Book book1 = new Book("Design Patterns");
        controller.handleRequest("POST", 0, book1);

        controller.handleRequest("GET_ALL", 0, null);

        controller.handleRequest("GET", 1, null);

        controller.handleRequest("DELETE", 1, null);
    }
}
