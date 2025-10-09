import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;
    private List<Element> elements;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Chapter chapter) {
        chapters.add(chapter);
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + title + "\n");

        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }

        System.out.println();
        for (Element element : elements) {
            element.print();
        }
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}