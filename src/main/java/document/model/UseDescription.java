package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class UseDescription  extends Document{
    private static final String path = "opisanie_primenenia.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("number", "Количество листов", "count"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Назначение программы", "purpose"));
        elements.add(new ElementType("textarea", "Условия применения", "definitions"));
        elements.add(new ElementType("textarea", "Описание задачи", "description"));
        elements.add(new ElementType("textarea", "Входные и выходные данные", "data"));
    }

    public UseDescription () {
        super(elements, path);
        super.setDocName("Оописание применения");
    }
}
