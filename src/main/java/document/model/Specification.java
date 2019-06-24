package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class Specification extends Document {
    private static final String path = "specif.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));

    }

    public Specification() {
        super(elements, path);
        super.setDocName("Спецификация");
    }
}