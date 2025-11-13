package commands;

import models.Book;

public class AddBookCommand implements Command{
    private CommandContext context;
    private Book book;

    public AddBookCommand(CommandContext context, Book book) {
        this.context = context;
        this.book = book;
    }

    @Override
    public void execute() {
        System.out.println("POST /books");
        context.getBooksService().addBook(book);
        System.out.println("Book added successfully");
    }
}
