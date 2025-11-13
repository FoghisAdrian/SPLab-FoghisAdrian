package services;

import models.Book;
import java.util.*;

public class BooksService {
    private Map<Integer, Book> books = new HashMap<>();
    private int nextId = 1;

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBook(int id) {
        return books.get(id);
    }

    public void addBook(Book book) {
        books.put(nextId++, book);
    }

    public void updateBook(int id, Book book) {
        books.put(id, book);
    }

    public void deleteBook(int id) {
        books.remove(id);
    }
}
