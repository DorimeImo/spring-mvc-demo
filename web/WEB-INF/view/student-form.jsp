<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mercury
  Date: 27.01.2020
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student form</title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
<br>
<h1>New Student application form</h1>
<br>
<i><b><small>(*)- required fields</small></b></i>
<br><br><br>
<%--@elvariable id="student" type="mvcdemo"--%>
<form:form action="processForm" modelAttribute="student">
    First name (*): <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Email(*):  <form:input path="email"/>
    <form:errors path="email" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit">
</form:form>
<br><br>


</body>
</html>
