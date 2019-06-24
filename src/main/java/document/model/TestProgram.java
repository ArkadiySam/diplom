package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class TestProgram extends Document {
    private static final String path = "programma_ispytanii.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Объект испытаний", "info1"));
        elements.add(new ElementType("textarea", "Цель испытаний", "info2"));
        elements.add(new ElementType("textarea", "Требования к программе", "info3"));
        elements.add(new ElementType("textarea", "Требования к программной документации", "info4"));
        elements.add(new ElementType("textarea", "Средства  и порядок испытаний", "info5"));
        elements.add(new ElementType("textarea", "Методы испытаний", "info6"));

    }

    public TestProgram() {
        super(elements, path);
        super.setDocName("Программа и методика испытаний");
    }
}