package document.model;

import document.Document;
import tools.ElementType;

import java.util.ArrayList;
import java.util.Arrays;

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
        elements.add(new ElementType("table", "Комплектность", "complect",
                new ArrayList<>(Arrays.asList("Обозначение", "Наименование", "Количество",
                        "Порядковый учетный номер", "Примечание")), 10));
        elements.add(new ElementType("text", "Обозначение", "controlName"));
        elements.add(new ElementType("text", "Наименование программного изделия", "certificateName"));
        elements.add(new ElementType("text", "Обозначение", "designation"));
        elements.add(new ElementType("text", "Дата выпуска", "releaseDate"));
        elements.add(new ElementType("textarea", "Гарантийные обязательства", "guarantee"));
        elements.add(new ElementType("table", "СВЕДЕНИЯ О РЕКЛАМАЦИЯХ", "reclam",
                new ArrayList<>(Arrays.asList("Дата", "Содержание рекламации", "Меры, принятые по рекламации",
                        "Подпись ответственного лица")), 12));
        elements.add(new ElementType("table", "СВЕДЕНИЯ О ХРАНЕНИИ", "storage",
                new ArrayList<>(Arrays.asList("Установки на хранение", "Снятие с хранения", "Условия хранения",
                        "Должность, фамилия и подпись лица, ответственного за хранение")), 12));
        elements.add(new ElementType("table", "СВЕДЕНИЯ О ЗАКРЕПЛЕНИИ ПРОГРАММНОГО ИЗДЕЛИЯ ПРИ ЭКСПЛУАТАЦИИ", "program",
                new ArrayList<>(Arrays.asList("Должность ответственного лица", "Фамилия ответственного лица", "О назначении",
                        "Об освобождении", "Подпись ответственного лица")), 10));
        elements.add(new ElementType("table", "СВЕДЕНИЯ ОБ ИЗМЕНЕНИЯХ", "change",
                new ArrayList<>(Arrays.asList("Основание (входящий номер сопроводительного документа и дата)",
                        "Дата проведения изменения", "Содержание изменения",
                        "Порядковый номер изменения", "Должность, фамилия и подпись ответственного лица за проведение изменения",
                        "Подпись лица, ответственного за эксплуатацию программного изделия")), 12));
        elements.add(new ElementType("table", "Лист регистрации изменений", "register",
                new ArrayList<>(Arrays.asList("Изм.", "изменен-ных",
                        "заменен-ных", "новых","аннули-рованных",
                        "Всего листов (страниц) в докум",
                        "№ докумен-та","Входящий № сопроводит. докум. и дата",
                        "Подп", "Дата")), 20));
    }

    public Formular() {
        super(elements, path);
        super.setDocName("Формуляр");
    }
}
