package commands;

public class DeleteBookCommand implements Command{
    private CommandContext context;
    private int id;

    public DeleteBookCommand(CommandContext context, int id) {
        this.context = context;
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("DELETE /books/" + id);
        context.getBooksService().deleteBook(id);
        System.out.println("Book deleted successfully");
    }
}
