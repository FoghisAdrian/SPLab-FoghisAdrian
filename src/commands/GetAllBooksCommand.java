package commands;

public class GetAllBooksCommand implements Command {
    private CommandContext context;

    public GetAllBooksCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public void execute() {
        System.out.println("GET /books");
        context.getBooksService().getAllBooks().forEach(Book -> Book.print());
    }
}
