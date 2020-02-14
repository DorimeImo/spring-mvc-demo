<%--
  Created by IntelliJ IDEA.
  User: Mercury
  Date: 13.02.2020
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students list</title>

    <link type="text/css" rel="stylesheet"
    href="/web/WEB-INF/resources/css/style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>SRM- student relationship management</h2>
        </div>
    </div>

    <div id="container">
        <div id="content">
            <input type="button" value="Add Student"
            onclick="window.location.href='showForm'; return false;"
            class="add-button">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>
                <c:forEach var="tempStident" items="${students}">
                    <tr>
                        <td>${tempStident.firstName}</td>
                        <td>${tempStident.lastName}</td>
                        <td>${tempStident.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>


</body>
</html>
