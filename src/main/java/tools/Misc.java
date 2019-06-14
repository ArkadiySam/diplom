package tools;

public class Misc {

    public static String toString(String value){
        return (value == null || value.length() == 0) ? "   " : value;
    }
}
