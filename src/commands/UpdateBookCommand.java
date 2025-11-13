package commands;

import models.Book;

public class UpdateBookCommand implements Command{
    private CommandContext context;
    private int id;
    private Book newBook;

    public UpdateBookCommand(CommandContext context, int id, Book newBook) {
        this.context = context;
        this.id = id;
        this.newBook = newBook;
    }

    @Override
    public void execute() {
        System.out.println("PUT /books/" + id);
        context.getBooksService().updateBook(id, newBook);
        System.out.println("Book updated successfully");
    }
}
