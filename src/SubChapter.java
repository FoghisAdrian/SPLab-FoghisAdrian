import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String name;
    private List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
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

    public void print() {
        System.out.println("Subchapter " + name);
        for (Element element : elements) {
            element.print();
        }
    }
}