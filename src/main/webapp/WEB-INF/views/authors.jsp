<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Authors</title>
</head>
<body>

<h1>All Authors</h1>

<c:if test="${empty authors}">
    <p>No authors available.</p>
</c:if>

<ul>
    <c:forEach var="author" items="${authors}">
        <li>
                ${author.name}
        </li>
    </c:forEach>
</ul>

<a href="${pageContext.request.contextPath}/books">
    Back to Books
</a>

</body>
</html>
