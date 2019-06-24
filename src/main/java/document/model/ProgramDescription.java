package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;

public class ProgramDescription extends Document {
    private static final String path = "opisanie_programmy.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Обозначение и наименование программы", "info1"));
        elements.add(new ElementType("textarea", "Программное обеспечение, необходимое для функционирования программы", "info2"));
        elements.add(new ElementType("textarea", "Языки программирования, на которых написана программа", "info3"));
        elements.add(new ElementType("textarea", "Функциональное назначение", "functional"));
        elements.add(new ElementType("textarea", "Алгоритм программы", "struct1"));
        elements.add(new ElementType("textarea", "Используемые методы", "struct2"));
        elements.add(new ElementType("textarea", "Структура программы с описанием функций составных частей и связи между ними", "struct3"));
        elements.add(new ElementType("textarea", "Связи программы с другими программами", "struct4"));
        elements.add(new ElementType("textarea", "Используемые технические средства", "resource"));
        elements.add(new ElementType("textarea", "Способ вызова программы с соответствующего носителя данных", "download1"));
        elements.add(new ElementType("textarea", "Входные точки в программу", "download2"));
        elements.add(new ElementType("textarea", "Характер, организация и предварительная подготовка входных данных", "input1"));
        elements.add(new ElementType("textarea", "Формат, описание и способ кодирования входных данных", "input2"));
        elements.add(new ElementType("textarea", "Характер и организация выходных данных", "output1"));
        elements.add(new ElementType("textarea", "Формат, описание и способ кодирования выходных данных", "output2"));
    }

    public ProgramDescription() {
        super(elements, path);
        super.setDocName("Описание программы");
    }
}
