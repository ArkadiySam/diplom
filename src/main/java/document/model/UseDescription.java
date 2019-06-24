package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;
import java.util.Arrays;

public class UseDescription  extends Document{
    private static final String path = "opisanie_primenenia.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Назначение программы", "purpose"));
        elements.add(new ElementType("textarea", "Условия применения", "definitions"));
        elements.add(new ElementType("textarea", "Описание задачи", "description"));
        elements.add(new ElementType("textarea", "Входные и выходные данные", "data"));
        elements.add(new ElementType("table", "Лист регистрации изменений", "register",
                new ArrayList<>(Arrays.asList("Изм.", "изменен-ных",
                        "заменен-ных", "новых","аннули-рованных",
                        "Всего листов (страниц) в докум",
                        "№ докумен-та","Входящий № сопроводит. докум. и дата",
                        "Подп", "Дата")), 20));
    }

    public UseDescription () {
        super(elements, path);
        super.setDocName("Оописание применения");
    }
}
