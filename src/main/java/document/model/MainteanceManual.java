package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class MainteanceManual extends Document {
    private static final String path = "ruk_tehob.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Введение", "info1"));
        elements.add(new ElementType("textarea", "Общие указания", "info2"));
        elements.add(new ElementType("textarea", "Требования к техническим средствам", "info3"));
        elements.add(new ElementType("textarea", "Описание функций", "functional"));

    }

    public MainteanceManual() {
        super(elements, path);
        super.setDocName("Руководство по техническому обслуживанию");
    }
}