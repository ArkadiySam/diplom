package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class Formular extends Document {
    private static final String path = "Formular.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("number", "Количество листов", "count"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Основные инструкции", "instructions"));
        elements.add(new ElementType("textarea", "Общие сведения", "information"));
        elements.add(new ElementType("textarea", "Основные характеристики", "specifications"));
        elements.add(new ElementType("text", "Обозначение", "controlName"));
        elements.add(new ElementType("text", "Наименование программного изделия", "certificateName"));
        elements.add(new ElementType("text", "Обозначение", "designation"));
        elements.add(new ElementType("text", "Дата выпуска", "releaseDate"));
        elements.add(new ElementType("textarea", "Гарантийные обязательства", "guarantee"));
    }

    public Formular() {
        super(elements, path);
        super.setDocName("Формуляр");
    }
}
