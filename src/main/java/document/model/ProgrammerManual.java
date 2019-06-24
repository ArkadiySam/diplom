package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class ProgrammerManual extends Document {
    private static final String path = "ruk_prog.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Назначение и условия применения программы", "info1"));
        elements.add(new ElementType("textarea", "Характеристики программы", "info2"));
        elements.add(new ElementType("textarea", "Обращение к программе", "info3"));
        elements.add(new ElementType("textarea", "Входные и выходные данные", "functional"));
        elements.add(new ElementType("textarea", "Сообщения", "functional1"));

    }

    public ProgrammerManual() {
        super(elements, path);
        super.setDocName("Руководство программиста");
    }
}