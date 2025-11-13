package models;

import alignings.AlignLeft;
import models.Element;
import alignings.AlignStrategy;

public class Paragraph extends Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text, AlignStrategy alignStrategy) {
        this.text = text; this.alignStrategy = alignStrategy;
    }

    public Paragraph(String text)
    {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this.text);
        } else {
            System.out.println("Paragraph: " + this.text);
        }
    }


}