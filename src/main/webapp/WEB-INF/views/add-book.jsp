<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Book</title>
</head>
<body>

<h1>Add New Book</h1>

<form action="${pageContext.request.contextPath}/books/add" method="post">

    <div>
        <label for="title">Book Title:</label>
        <input type="text" id="title" name="title" required>
    </div>

    <br>

    <div>
        <label for="pages">Number of Pages:</label>
        <input type="number" id="pages" name="pages" min="1" required>
    </div>

    <br>

    <div>
        <label for="authorId">Author:</label>

        <select id="authorId" name="authorId" required>
            <option value="">Select an Author</option>

            <c:forEach var="author" items="${authors}">
                <option value="${author.id}">
                        ${author.name}
                </option>
            </c:forEach>

        </select>
    </div>

    <br>

    <button type="submit">Add Book</button>

</form>

<br>

<a href="${pageContext.request.contextPath}/books">
    Back to Books
</a>

</body>
</html>
