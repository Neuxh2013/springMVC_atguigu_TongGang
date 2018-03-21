<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>

<%
    List<String> companies = (List<String>) request.getAttribute("companies");
    for (String company : companies) {
        response.getWriter().write(company + "<br>");
    }
    response.getWriter().write(new Date().toString());
%>


</body>
</html>
