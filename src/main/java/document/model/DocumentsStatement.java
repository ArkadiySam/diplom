package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class DocumentsStatement extends Document {
    private static final String path = "vedomost_expluatatsionnykh_dokumentov.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("number", "Количество листов", "count"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
    }

    public DocumentsStatement () {
        super(elements, path);
        super.setDocName("Ведомость эксплуатационных документов");
    }
}
