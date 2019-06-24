package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class TextProgram extends Document {
    private static final String path = "text_prog.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Символическая запись на исходном языке", "annotation"));
        elements.add(new ElementType("textarea", "Символическая запись на промежуточных языках", "annotation"));
        elements.add(new ElementType("textarea", "Символическое представление машинных кодов", "annotation"));

    }

    public TextProgram() {
        super(elements, path);
        super.setDocName("Текст программы");
    }
}