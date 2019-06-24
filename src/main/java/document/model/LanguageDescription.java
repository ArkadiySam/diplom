package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class LanguageDescription extends Document {
    private static final String path = "opisanie_yazyka.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Общие сведения", "info1"));
        elements.add(new ElementType("textarea", "Элементы языка", "info2"));
        elements.add(new ElementType("textarea", "Способы структурирования программы", "info3"));
        elements.add(new ElementType("textarea", "Средства обмена данными", "functional"));
        elements.add(new ElementType("textarea", "Встроенные элементы", "struct1"));
        elements.add(new ElementType("textarea", "Средства отладки программы", "struct2"));

    }

    public LanguageDescription() {
        super(elements, path);
        super.setDocName("Описание языка");
    }
}
