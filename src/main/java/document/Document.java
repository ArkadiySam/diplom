package document;

import tools.ElementType;
import tools.Misc;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Document {
    private String docName;
    private ArrayList<ElementType> elements;
    private String path = "C:\\Users\\Ксения\\Desktop\\доки\\template\\";
    private static final String nextLine = "{\\rtlch\\fcs1 \\af1\\afs23 \\ltrch\\fcs0 \\f1\\fs22\\cf6\\insrsid4534803\\par }";

    public Document(ArrayList<ElementType> elements, String fileName) {
        this.elements = elements;
        this.path += fileName;
    }

    private ElementType getElementByName(String name) {
        for (ElementType element : elements)
            if (element.getName().equals(name))
                return element;
        return null;
    }

    public String getPath() {
        return path;
    }

    public ArrayList<ElementType> getElements(){
        return elements;
    }

    public List<String> getParamListNew(HttpServletRequest request) {
        Map<String, String[]> parameters = request.getParameterMap();
        List<String> valueList = new ArrayList<>();
        for(String key : parameters.keySet()){
            if("id".equals(key)) continue;
            ElementType element = this.getElementByName(key);
            String value = Misc.toString(parameters.get(key)[0]);
            if(element != null && element.getType().equals("table")){
                int total = element.getTotalSize();
                for(int i = 0; i < total - Integer.valueOf(value); i++)
                    valueList.add("");
            }
            else {
                while (value.contains("\r\n")) {
                    value = value.replace("\r\n", nextLine);
                }
                valueList.add(value);
            }
        }
        return valueList;
    }

    public List<String> getParamList(HttpServletRequest request) {
        List<String> valueList = new ArrayList<>();
        List<String> params = new ArrayList<>();
        for(ElementType element : elements) {
            String type = element.getType();
            if (type.equals("table")){
                int tableSize = Integer.valueOf(request.getParameter(element.getName()));
                for(int i = 0 ; i < tableSize; i++)
                    params.add(element.getName() + i);
                for(int  i = 0; i< element.getTotalSize() - tableSize; i++)
                    params.add("");
            }else
                params.add(element.getName());
        }

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
