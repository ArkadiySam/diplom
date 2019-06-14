package tools;

public class ElementType {
    private String type;
    private String title;
    private String name;

    public ElementType(String type, String title, String name) {
        this.type = type;
        this.title = title;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
