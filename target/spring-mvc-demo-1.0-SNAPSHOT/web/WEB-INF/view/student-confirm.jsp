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
Student confirmed: ${student.firstName} ${student.lastName}
<br><br>
Email: ${student.email}

<br><br>
<img src="../../../web/WEB-INF/resources/images/student.png"/>
</body>
</html>
