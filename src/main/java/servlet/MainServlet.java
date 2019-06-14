package servlet;

import document.Document;
import document.DocumentFactory;

import javax.print.Doc;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        Document doc = DocumentFactory.getDocument(id);
        req.setAttribute("elements",  doc.getElements());
        req.setAttribute("idDocument", id);
        req.setAttribute("docName", doc.getDocName());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("document.jsp");
        requestDispatcher.forward(req, resp);
    }
}
