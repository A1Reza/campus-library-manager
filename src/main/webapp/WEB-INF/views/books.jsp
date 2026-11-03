<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Books</title>
</head>
<body>

<h1>${libraryName}</h1>

<h2>Book Collection</h2>

<c:if test="${empty books}">
    <p>No books available.</p>
</c:if>

<ul>
    <c:forEach var="book" items="${books}">
        <li>
            <strong>${book.title}</strong>
            <br>
            Author: ${authorNames[book.authorId]}  <%--The expression ${authorNames[book.authorId]} gets the author name from the Map.--%>
            <br>
            Pages: ${book.pages}
            <br>
            <a href="${pageContext.request.contextPath}/books/detail?id=${book.id}">
                View Details
            </a>
        </li>
    </c:forEach>
</ul>

<hr>

<a href="${pageContext.request.contextPath}/books/add">Add New Book</a>
<br>
<a href="${pageContext.request.contextPath}/authors">View All Authors</a>

</body>
</html>
