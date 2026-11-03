<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
</head>
<body>

<h1>Book Details</h1>

<h2>${book.title}</h2>

<p>
    <strong>Author:</strong>
    ${author.name}
</p>

<p>
    <strong>Pages:</strong>
    ${book.pages}
</p>

<a href="${pageContext.request.contextPath}/books">
    Back to Books
</a>

</body>
</html>
