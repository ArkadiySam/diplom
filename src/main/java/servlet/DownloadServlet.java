package servlet;

import document.Document;
import document.DocumentFactory;
import tools.Translator;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
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


        List<String> values = DocumentFactory.getDocument(id).getParamList(request);
        byte[] buffer = new byte[500]; //увеличить буфер
        OutputStream outStream = response.getOutputStream();

        Translator translator = new Translator();
        while (inStream.read(buffer) != -1) {
            byte [] newValues =  translator.change(buffer, "#$", values);
            for(byte value : newValues) {
                outStream.write(value);
            }
        }
        inStream.close();
        outStream.close();

    }
}
