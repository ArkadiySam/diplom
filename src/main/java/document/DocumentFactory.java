package document;

import document.model.*;

public class DocumentFactory {

    public static Document getDocument(int id){
        switch (id){
            case 5: return new OriginalsStatement();
            case 6: return new DocumentsStatement();
            case 7: return new UseDescription();
            case 8: return new ProgramDescription();
            case 13: return new Formular();
        }
        return new Formular();
    }
}
