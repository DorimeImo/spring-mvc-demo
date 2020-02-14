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
    <link type="text/css" rel="stylesheet"
          href="/web/WEB-INF/resources/css/add-customer-style.css">
    <link type="text/css" rel="stylesheet"
          href="/web/WEB-INF/resources/css/style.css">
</head>
<body>
<i><b><small>(*)- required fields</small></b></i>
<br>
<div id="wrapper">
    <div id="header">
        <h2>SRM- student relationship management</h2>
    </div>
</div>

<div id="container">
    <h3>Save Student</h3>
        <%--@elvariable id="student" type="mvcdemo"--%>
    <form:form action="saveStudent" modelAttribute="student" method="post">
            <table>
                <tbody>
                    <tr>
                        <td><label>First name</label></td>
                        <td><form:input path="firstName"/><form:errors path="firstName" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><label>Last name</label></td>
                        <td><form:input path="lastName"/><form:errors path="lastName" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><label>Email</label></td>
                        <td><form:input path="email"/><form:errors path="email" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save"> </td>
                    </tr>
                </tbody>
            </table>
    </form:form>
    <div style="clear; both;"></div>
    <a href="list">Back to list</a>
</div>
</body>
</html>
