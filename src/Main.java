public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Chapter cap1 = new Chapter("Capitolul 1");
        Chapter cap11 = new Chapter("Capitolul 1.1");
        Chapter cap111 = new Chapter("Capitolul 1.1.1");
        Chapter cap1111 = new Chapter("Subcapitol 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc color care ..."));
        noapteBuna.addContent(cap1);

        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);

        cap11.add(new Paragraph("Text subcap 1.1"));
        cap11.add(cap111);

        cap111.add(new Paragraph("Text subcap 1.1.1"));
        cap111.add(cap1111);

        cap1111.add(new Image("Img subcap 1.1.1.1"));

        noapteBuna.print();
    }
}