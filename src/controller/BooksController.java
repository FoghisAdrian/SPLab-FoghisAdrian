package controller;

import commands.*;
import filters.*;
import models.Book;
import services.BooksService;

public class BooksController {
    private RequestHandler loggingFilter;
    private BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;

        // Setup filter chain
        loggingFilter = new RequestLoggingFilter();
    }

    public void handleRequest(String method, int id, Book book) {
        loggingFilter.handle(method);

        CommandContext context = new CommandContext(booksService);
        Command command = null;

        switch (method) {
            case "GET_ALL": command = new GetAllBooksCommand(context); break;
            case "GET": command = new GetBookByIdCommand(context, id); break;
            case "POST": command = new AddBookCommand(context, book); break;
            case "PUT": command = new UpdateBookCommand(context, id, book); break;
            case "DELETE": command = new DeleteBookCommand(context, id); break;
            default: System.out.println("Unknown method"); return;
        }

        command.execute();
    }
}
