package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class SystemProgrammerManual extends Document {
    private static final String path = "ruk_prog.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Структура программы", "info1"));
        elements.add(new ElementType("textarea", "Настройка программы", "info2"));
        elements.add(new ElementType("textarea", "Проверка программы", "info3"));
        elements.add(new ElementType("textarea", "Дополнительные возможности", "functional"));
        elements.add(new ElementType("textarea", "Сообщения системному программисту", "functional"));

    }

    public SystemProgrammerManual() {
        super(elements, path);
        super.setDocName("Руководство системного программиста");
    }
}