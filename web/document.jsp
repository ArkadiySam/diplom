<%@ page import="java.util.List" %>
<%@ page import="tools.ElementType" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%List<ElementType> elements = (List<ElementType>)request.getAttribute("elements");%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><%=request.getAttribute("docName")%></title>
</head>
<body>
<form action="/download?id=<%=request.getAttribute("idDocument")%>" method="post">
    <%for (ElementType  element : elements) {
        out.println(element.getTitle() + ":<br>");
        switch (element.getType()) {
            case "text":
                out.println("<input type=\"text\" name=\"" + element.getName() + "\">");
                break;
            case "textarea":
                out.println("<label>\n" +
                        "        <textarea rows=\"10\" cols=\"45\" name=\"" + element.getName() + "\"></textarea>\n" +
                        "    </label>");
                break;
            case "number":
                out.println("<input type=\"number\" name=\"" + element.getName() + "\" value=\"1\" min=\"1\" max = \"99\">");
                break;
        }
        out.println("<br>");
    }
    %>
    <input type="submit" value="Submit">
</form>
</body>
</html>