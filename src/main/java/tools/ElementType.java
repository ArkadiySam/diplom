package tools;

import java.util.List;

public class ElementType {
    private String type;
    private String title;
    private String name;
    private List<String> column;
    private int totalSize;

    public ElementType(String type, String title, String name) {
        this.type = type;
        this.title = title;
        this.name = name;
    }

    public ElementType(String type, String title, String name, List<String> column, int totalSize) {
        this.type = type;
        this.title = title;
        this.name = name;
        this.column = column;
        this.totalSize = totalSize;
    }

    public int getTotalSize() {
        return totalSize;
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

    public List<String> getColumn() {
        return column;
    }
}
