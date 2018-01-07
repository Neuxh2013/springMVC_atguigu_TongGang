<%@page import="java.util.HashMap" %>
<%@page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CYH</title>
</head>
<body>

<!--
    1. WHY 使用 form 标签呢 ?
        可以更快速的开发出表单页面, 而且可以更方便的进行表单值的回显
    2. 注意:
        可以通过 modelAttribute 属性指定绑定的模型属性,
        若没有指定该属性，则默认从 request 域对象中读取 command 的表单 bean
        如果该属性值也不存在，则会发生错误。
-->

<form:form action="${pageContext.request.contextPath }/emp" method="POST" modelAttribute="employee">

    <%-- 说明是新增操作，调用POST --%>
    <c:if test="${employee.id == null}">
        LastName: <form:input path="lastName"/>
        <form:errors path="lastName"/>
    </c:if>
    <%-- 说明是修改操作，调用PUT --%>
    <c:if test="${employee.id != null}">
        <form:hidden path="id"/>
        <input type="hidden" name="_method" value="PUT"/>
        <%-- 对于 _method 不能使用 form:hidden 标签, 因为 modelAttribute 对应的 bean 中没有 _method 这个属性 --%>
        <%-- <form:hidden path="_method" value="PUT"/> --%>
    </c:if>

    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <%
        Map<String, String> genders = new HashMap();
        genders.put("1", "Male");
        genders.put("0", "Female");
        request.setAttribute("genders", genders);
    %>
    Gender: <form:radiobuttons path="gender" items="${genders }"/>
    <br>
    Birth: <form:input path="birth"/>
    <form:errors path="birth"/>
    <br>
    Salary: <form:input path="salary"/>
    <br>
    Department: <form:select path="department.id" items="${departments }"
                             itemLabel="departmentName" itemValue="id"></form:select>
    <br>
    <input type="submit" value="Submit"/>
</form:form>

<form action="testConversionServiceConverter" method="POST">
    <!-- lastname-email-gender-department.id 例如: GG-gg@atguigu.com-0-105 -->
    Employee: <input type="text" name="employee"/>
    <input type="submit" value="Submit"/>
</form>
<br><br>

</body>
</html>