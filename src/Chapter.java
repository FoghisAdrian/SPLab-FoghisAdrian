import java.util.ArrayList;
import java.util.List;

class Chapter {
    private String name;
    private List<Element> elements;
    private List<SubChapter> subChapters;
    private List<Chapter> chapters;

    public Chapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.subChapters = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void add(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    public void add(Chapter chapter) {
        chapters.add(chapter);
    }

    public void print() {
        System.out.println(name);
        for (Element element : elements) {
            element.print();
        }
        for (Chapter chapter : chapters) {
            chapter.print();
        }
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}