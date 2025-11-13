package controller;

import services.Context;

// Imports adjusted to match your actual repo (they’re likely in the default package)
import models.Book;
import models.Author;
import models.Paragraph;

public class BookController {
    private Context context;

    public BookController(Context context) {
        this.context = context;
    }

    public void run() {
        // Retrieve Book and Author instances from the DI container
        Book book = (Book) context.getBean("book");
        Author author = (Author) context.getBean("author");

        // Add author to book
        book.addAuthor(author);

        // Instead of Section (which you don’t have), we add elements directly to the Book
        Paragraph p1 = new Paragraph("Introducere în design patterns");
        Paragraph p2 = new Paragraph("Paragraful despre Strategy Pattern");

        // Add paragraphs to the book directly (Book acts as the composite container)
        book.addContent(p1);
        book.addContent(p2);

        // Print everything
        book.print();
    }
}


