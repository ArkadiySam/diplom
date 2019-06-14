package document;

import tools.ElementType;
import tools.Misc;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public abstract class Document {
    private String docName;
    private ArrayList<ElementType> elements;
    private String path = "C:\\Users\\Arkadiy\\Desktop\\диплом\\template\\";
    private static final String nextLine = "{\\rtlch\\fcs1 \\af1\\afs23 \\ltrch\\fcs0 \\f1\\fs22\\cf6\\insrsid4534803\\par }";

    public Document(ArrayList<ElementType> elements, String fileName) {
        this.elements = elements;
        this.path += fileName;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<ElementType> getElements(){
        return elements;
    }

    public List<String> getParamList(HttpServletRequest request) {
        List<String> valueList = new ArrayList<>();
        List<String> params = new ArrayList<>();
        for(ElementType element : elements)
            params.add(element.getName());
        for(String param : params){
            String value = Misc.toString(request.getParameter(param));
            while (value.contains("\r\n"))
                value = value.replace("\r\n", nextLine);
            valueList.add(value);
        }
        return valueList;
    }


    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
}
