<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:useBean id="student" scope="request" type="mvcdemo.model.Student"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
<br><br>
Student confirmed: ${student.firstName} ${student.lastName} from ${student.country}.
<br><br>
Programming actives per week: ${student.hoursInProgrammingPerWeek} hours.
<br><br>
Weekly amount of hours in practice: ${student.favouriteLanguage}
<br><br>
The selected operating systems are:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp} </li>
    </c:forEach>
</ul>
<br><br>
<img src="../../../web/WEB-INF/resources/images/student.png"/>
</body>
</html>
