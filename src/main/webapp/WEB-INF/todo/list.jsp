<%--
  Created by IntelliJ IDEA.
  User: ktf_y
  Date: 2024-08-24
  Time: 오전 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Page</h1>
    <ul>
        <c:forEach var="dto" items="${todoList}">
            <li>${dto}</li>
        </c:forEach>
    </ul>
</body>
</html>
