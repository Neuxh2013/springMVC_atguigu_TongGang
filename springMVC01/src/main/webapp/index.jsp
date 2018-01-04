<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CYH</title>
</head>
<body>

<br><br>
<a href="helloworld">Hello World</a>

<br><br>
<a href="springmvc/testRequestMapping">Test RequestMapping</a>

<br><br>
<a href="springmvc/testMethod">Test Method</a>

<br><br>
<form action="springmvc/testMethod" method="POST">
    <input type="submit" value="submit"/>
</form>

<br><br>
<a href="springmvc/testParamsAndHeaders?username=cyh&age=10">Test Params And Headers</a>

<br><br>
<a href="/springmvc/testAntPath/cyh/abc">Test Ant Path</a>

<br><br>
<a href="/springmvc/testPathVariable/cyh">Test Path Variable</a>

<br><br>
<a href="/springmvc/testRestGet/cyh">Test REST Get</a>

<br><br>
<form action="/springmvc/testRestPost" method="post">
    <input type="submit" value="Test REST Post"/>
</form>

<br><br>
<form action="/springmvc/testRestDelete/cyh" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="Test REST Delete"/>
</form>

<br><br>
<form action="/springmvc/testRestPut/cyh" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="Test REST Put"/>
</form>

<br><br>
<a href="/springmvc/testRequestParam?username=cyh&age=27">Test Request Param</a>

<br><br>
<a href="/springmvc/testRequestHeader">Test Request Header</a>

<br><br>
<a href="/springmvc/testCookieValue">Test Cookie Value</a>

<br><br>
<form action="/springmvc/testPojo" method="post">
    username: <input type="text" name="username">
    <br>
    password: <input type="password" name="password">
    <br>
    email: <input type="text" name="email">
    <br>
    age: <input type="text" name="age">
    <br>
    city: <input type="text" name="address.city">
    <br>
    province: <input type="text" name="address.province">
    <br>
    <input type="submit" value="submittttt">
</form>


</body>
</html>
