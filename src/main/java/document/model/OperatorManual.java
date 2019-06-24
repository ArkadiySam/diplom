package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class OperatorManual extends Document {
    private static final String path = "ruk_operatora.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Назначение программы", "info1"));
        elements.add(new ElementType("textarea", "Условия выполнения программы", "info2"));
        elements.add(new ElementType("textarea", "Выполнение программы", "info3"));
        elements.add(new ElementType("textarea", "Сообщения оператору", "functional"));

    }

    public OperatorManual() {
        super(elements, path);
        super.setDocName("Руководство оператора");
    }
}