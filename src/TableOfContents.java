import java.util.ArrayList;
import java.util.List;

class TableOfContents {
    private List<Chapter> chapters;

    public TableOfContents() {
        this.chapters = new ArrayList<>();
    }

    public void add(Chapter chapter) {
        chapters.add(chapter);
    }

    public void print() {
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}