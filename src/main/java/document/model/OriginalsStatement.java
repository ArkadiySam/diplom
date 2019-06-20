package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;
import java.util.Arrays;

public class OriginalsStatement extends Document {
    private static final String path = "vedomost_derzhateley_podlinnikov.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("number", "Количество листов", "count"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("table", "", "noName",
                new ArrayList<>(Arrays.asList("Обозначение", "Наименование","Держатель подлинника",
                        "Примечание")), 8));
        elements.add(new ElementType("table", "Лист регистрации изменений", "register",
                new ArrayList<>(Arrays.asList("Изм.", "изменен-ных",
                        "заменен-ных", "новых","аннули-рованных",
                        "Всего листов (страниц) в докум",
                        "№ докумен-та","Входящий № сопроводит. докум. и дата",
                        "Подп", "Дата")), 20));
    }

    public OriginalsStatement() {
        super(elements, path);
        super.setDocName("Ведомость держателей подлинников");
    }
}
