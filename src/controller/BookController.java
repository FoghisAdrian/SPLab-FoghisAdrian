package controller;

import services.Context;

import models.Book;
import models.Author;
import models.Paragraph;

public class BookController {
    private Context context;

    public BookController(Context context) {
        this.context = context;
    }

    public void run() {

        Book book = (Book) context.getBean("book");
        Author author = (Author) context.getBean("author");

        book.addAuthor(author);

        Paragraph p1 = new Paragraph("Introducere în design patterns");
        Paragraph p2 = new Paragraph("Paragraful despre Strategy Pattern");

        book.addContent(p1);
        book.addContent(p2);

        book.print();
    }
}


