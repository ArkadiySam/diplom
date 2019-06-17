<%@ page import="java.util.List" %>
<%@ page import="tools.ElementType" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%List<ElementType> elements = (List<ElementType>)request.getAttribute("elements");%>
<html lang="en">
<link rel="stylesheet" type="text/css" href="all.css"/>
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
                out.println("<input type='text' name='" + element.getName() + "'>");
                break;
            case "textarea":
                out.println("<label>" +
                        "        <textarea rows='10' cols='45' name='" + element.getName() + "'></textarea>" +
                        "    </label>");
                break;
            case "number":
                out.println("<input type='number' name='" + element.getName() + "' value='1' min='1' max = '99'>");
                break;
            case "table":
                out.println("<table>" +
                        "        <thead>" +
                        "        <tr>");
                for (String columnName : element.getColumn())
                    out.println("<td>" + columnName + "</td>");
                out.println("        </tr>" +
                        "        </thead>" +
                        "        <tbody id='"+element.getName()+"'>" +
                        "        <tr>");
                for (int i = 0; i < element.getColumn().size(); i++)
                    out.println("<td><input name=\""+element.getName()+ i + "\" type=\"text\"></td>\n");
                out.println("<td><span onclick=\"add('"+element.getName()+"',"+element.getColumn().size()+")\">Добавить</span></td>\n" +
                        "        </tr>" +
                        "        </tbody>" +
                        "    </table>");
                out.println("<input hidden='true' value = '"+element.getColumn().size()+"' type='text' name='" + element.getName() + "'>");
                break;
        }
        out.println("<br>");
    }
    %>
    <input type="submit" value="Submit">
</form>
</body>
</html>
<script src="document.js"></script>