package servlet;

import document.DocStorage;
import document.Document;
import document.DocumentFactory;
import tools.Translator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.ResultSet;
import java.util.List;

public class DownloadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        int id = Integer.valueOf(request.getParameter("id"));
        Document document = DocumentFactory.getDocument(id);
        File downloadFile = new File(document.getPath());
        FileInputStream inStream = new FileInputStream(downloadFile);
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
        response.setHeader(headerKey, headerValue);


        List<String> values = DocumentFactory.getDocument(id).getParamListNew(request);
        byte[] buffer = new byte[4096]; //увеличить буфер
        OutputStream outStream = response.getOutputStream();

        Translator translator = new Translator();
        InputStream input = DocStorage.getDoc(id);
        while (input.read(buffer) != -1) {
            byte [] newValues =  translator.changeNew(buffer, "#$", values);
            for(byte value : newValues) {
                outStream.write(value);
            }
        }
        inStream.close();
        outStream.close();

    }
}
