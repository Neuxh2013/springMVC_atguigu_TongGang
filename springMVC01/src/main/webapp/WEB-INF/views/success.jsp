<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>Success Page</h4>

<br><br>
Current time: ${requestScope.time }

<br><br>
names: ${requestScope.names }

<br><br>
request user: ${requestScope.user }

<br><br>
session user: ${sessionScope.user }

<br><br>
request school: ${requestScope.school }

<br><br>
session school: ${sessionScope.school }

<br><br>
<fmt:message key="i18n.username"/>

<br><br>
<fmt:message key="i18n.password"/>


</body>
</html>
