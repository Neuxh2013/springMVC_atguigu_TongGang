<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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


</body>
</html>
