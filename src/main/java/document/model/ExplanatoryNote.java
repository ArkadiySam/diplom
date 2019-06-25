package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;
import java.util.Arrays;

public class ExplanatoryNote extends Document {
    private static final String path = "poyasnitelnaya_zapiska.rtf";
    private static ArrayList<ElementType> elements = new ArrayList<>();

    static {
        elements.add(new ElementType("text", "Имя документа", "title"));
        elements.add(new ElementType("text", "Год", "year"));
        elements.add(new ElementType("textarea", "Аннотация", "annotation"));
        elements.add(new ElementType("textarea", "Введение", "info1"));
        elements.add(new ElementType("textarea", "Назначение и область применения", "info2"));
        elements.add(new ElementType("textarea", "Технические зарактеристики", "info3"));
        elements.add(new ElementType("textarea", "Постановка задачи на разработку программы, описание применяемых математических методов и, при необходимости, описание допущений и ограничений, связанных с выбранным математическим аппаратом", "functional"));
        elements.add(new ElementType("textarea", "Описание алгоритма и (или) функционирования программы с обоснованием выбора схемы алгоритма решения задачи, возможные взаимодействия программы с другими программами", "struct1"));
        elements.add(new ElementType("textarea", "Описание и обоснование выбора метода организации входных и выходных данных", "struct2"));
        elements.add(new ElementType("textarea", "Описание и обоснование выбора состава технических и программных средств на основании проведенных расчетов и (или) анализов, распределение носителей данных, которые использует программа", "struct3"));
        elements.add(new ElementType("textarea", "Ожидаемые технико-экономические показатели", "annotation"));
        elements.add(new ElementType("textarea", "Источники, использованные при разработке", "annotation2"));
        elements.add(new ElementType("table", "Лист регистрации изменений", "register",
                new ArrayList<>(Arrays.asList("Изм.", "изменен-ных",
                        "заменен-ных", "новых","аннули-рованных",
                        "Всего листов (страниц) в докум",
                        "№ докумен-та","Входящий № сопроводит. докум. и дата",
                        "Подп", "Дата")), 20));
    }

    public ExplanatoryNote() {
        super(elements, path);
        super.setDocName("Пояснительная записка");
    }
}
