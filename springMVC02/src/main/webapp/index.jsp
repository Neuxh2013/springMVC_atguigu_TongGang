<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CYH</title>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#testJson").click(function () {
                var url = this.href;
                var args = {};
                $.post(url, args, function (data) {
                    for (var i = 0; i < data.length; i++) {
                        var id = data[i].id;
                        var lastName = data[i].lastName;

                        alert(id + ": " + lastName);
                    }
                });
                return false;
            });
        })
    </script>
</head>
<body>

<a href="emps">List All Employees</a>

<br><br>
<a href="testJson" id="testJson">Test Json</a>

<br><br>
<form action="testHttpMessageConverter" method="POST" enctype="multipart/form-data">
    File: <input type="file" name="file"/>
    Desc: <input type="text" name="desc"/>
    <input type="submit" value="Submit"/>
</form>

<br><br>
<a href="testResponseEntity">Test ResponseEntity</a>

<br><br>
<a href="i18n">I18N PAGE</a>

<br><br>
<form action="testFileUpload" method="POST" enctype="multipart/form-data">
    File: <input type="file" name="file"/>
    Desc: <input type="text" name="desc"/>
    <input type="submit" value="Submit"/>
</form>

<br><br>
<a href="testExceptionHandlerExceptionResolver?i=0">Test ExceptionHandlerExceptionResolver</a>

<br><br>
<a href="testResponseStatusExceptionResolver?i=13">Test ResponseStatusExceptionResolver</a>

<br><br>
<a href="testDefaultHandlerExceptionResolver">Test DefaultHandlerExceptionResolver</a>

<br><br>
<a href="testSimpleMappingExceptionResolver?i=21">Test SimpleMappingExceptionResolver</a>

</body>
</html>
