package document.model;

import tools.ElementType;
import document.Document;
import java.util.ArrayList;
import java.util.Arrays;

public class DocumentsStatement extends Document {
    private static final String path = "vedomost_expluatatsionnykh_dokumentov.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("table", "", "noName",
                new ArrayList<>(Arrays.asList("Обозначение", "Наименование","Кол. экз",
                        "Местонахождение")), 8));
        elements.add(new ElementType("table", "Лист регистрации изменений", "register",
                new ArrayList<>(Arrays.asList("Изм.", "изменен-ных",
                        "заменен-ных", "новых","аннули-рованных",
                        "Всего листов (страниц) в докум",
                        "№ докумен-та","Входящий № сопроводит. докум. и дата",
                        "Подп", "Дата")), 20));
    }

    public DocumentsStatement () {
        super(elements, path);
        super.setDocName("Ведомость эксплуатационных документов");
    }
}
