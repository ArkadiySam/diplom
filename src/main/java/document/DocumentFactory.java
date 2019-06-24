package document;

import document.model.*;

public class DocumentFactory {

    public static Document getDocument(int id){
        switch (id){
            case 5: return new OriginalsStatement(); //отсортировать
            case 6: return new DocumentsStatement();
            case 7: return new UseDescription();
            case 8: return new ProgramDescription();
            case 13: return new Formular();
            case 9: return new LanguageDescription();
            case 10: return new ExplanatoryNote();
            case 1: return new TestProgram();
            case 2: return new OperatorManual();
            case 3: return new MainteanceManual();
            case 4: return new ProgrammerManual();
            case 14: return new SystemProgrammerManual();
            case 15: return new Specification();
            case 11: return new TextProgram();
            case 12: return new TZ();
        }
        return new Formular();
    }
}
