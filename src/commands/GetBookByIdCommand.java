package commands;

public class GetBookByIdCommand implements Command {
    private CommandContext context;
    private int bookId;

    public GetBookByIdCommand(CommandContext context, int bookId) {
        this.context = context;
        this.bookId = bookId;
    }

    @Override
    public void execute() {
        System.out.println("GET /books/" + bookId);
        var book = context.getBooksService().getBook(bookId);
        if (book != null) book.print();
        else System.out.println("Book not found");
    }
}