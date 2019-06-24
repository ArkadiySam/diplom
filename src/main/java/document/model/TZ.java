package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class TZ extends Document {
    private static final String path = "tz.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Введение", "info1"));
        elements.add(new ElementType("textarea", "Основание для разработки", "info2"));
        elements.add(new ElementType("textarea", "Назначение разработки", "info3"));
        elements.add(new ElementType("textarea", "Требования к функциональным характеристикам", "functional"));
        elements.add(new ElementType("textarea", "Требования к надежности", "struct1"));
        elements.add(new ElementType("textarea", "Условия эксплуатации", "struct2"));
        elements.add(new ElementType("textarea", "Требования к составу и параметрам технических средств", "struct2"));
        elements.add(new ElementType("textarea", "Требования к информационной и программной совместимости", "struct2"));
        elements.add(new ElementType("textarea", "Требования к маркировке и упаковке", "struct2"));
        elements.add(new ElementType("textarea", "Требования к транспортированию и хранению", "struct2"));
        elements.add(new ElementType("textarea", "Специальные требования", "struct2"));
        elements.add(new ElementType("textarea", "Требования к программной документации", "struct2"));
        elements.add(new ElementType("textarea", "Технико-экономические показатели", "struct2"));
        elements.add(new ElementType("textarea", "Стадии и этапы разработки", "struct2"));
        elements.add(new ElementType("textarea", "Порядок контроля и приемки", "struct2"));

    }

    public TZ() {
        super(elements, path);
        super.setDocName("Техническое задание");
    }
}