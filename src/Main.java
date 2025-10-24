public class Main {
    public static void main(String[] args) throws Exception {
        SubChapter cap1 = new SubChapter("Capitolul 1");

        Paragraph p1 = new Paragraph("Paragraph 1", new AlignCenter());
        cap1.add(p1);

        Paragraph p2 = new Paragraph("Paragraph 2", new AlignLeft());
        cap1.add(p2);

        Paragraph p3 = new Paragraph("Paragraph 3", new AlignRight());
        cap1.add(p3);

        Paragraph p4 = new Paragraph("Paragraph 4", new AlignCenter());
        cap1.add(p4);


        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        cap1.print();
    }
}