<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Campus Library Manager</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: #f1f5f9;
            color: #1e293b;
            min-height: 100vh;
        }

        header {
            background: #1e293b;
            color: white;
            padding: 35px 20px;
            text-align: center;
        }

        header h1 {
            margin-bottom: 10px;
            font-size: 30px;
        }

        header p {
            color: #cbd5e1;
        }

        .container {
            max-width: 950px;
            margin: 40px auto;
            padding: 0 20px;
        }

        .section-title {
            margin-bottom: 20px;
            font-size: 22px;
        }

        .cards {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
            gap: 20px;
        }

        .card {
            background: white;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.05);
            transition: transform 0.2s;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card h3 {
            margin-bottom: 12px;
            font-size: 18px;
        }

        .card p {
            color: #64748b;
            font-size: 14px;
            line-height: 1.6;
            margin-bottom: 18px;
        }

        .card a {
            display: inline-block;
            background: #2563eb;
            color: white;
            text-decoration: none;
            padding: 10px 16px;
            border-radius: 7px;
            font-size: 14px;
        }

        .card a:hover {
            background: #1d4ed8;
        }

        .info {
            margin-top: 30px;
            background: #e0f2fe;
            border-left: 4px solid #0284c7;
            padding: 18px;
            border-radius: 8px;
            line-height: 1.7;
        }

        footer {
            text-align: center;
            padding: 25px;
            color: #64748b;
            font-size: 13px;
        }
    </style>
</head>

<body>

<header>
    <h1>📚 Campus Library Manager</h1>
    <p>Manage Books and Authors in Your Campus Library</p>
</header>

<main class="container">

    <h2 class="section-title">🚀 Project Navigation</h2>

    <div class="cards">

        <div class="card">
            <h3>📖 All Books</h3>
            <p>View the complete collection of available library books.</p>
            <a href="${pageContext.request.contextPath}/books">
                View Books
            </a>
        </div>

        <div class="card">
            <h3>🔍 Book Details</h3>
            <p>View detailed information about the first book.</p>
            <a href="${pageContext.request.contextPath}/books/detail?id=1">
                View Details
            </a>
        </div>

        <div class="card">
            <h3>➕ Add New Book</h3>
            <p>Add a new book to the library collection.</p>
            <a href="${pageContext.request.contextPath}/books/add">
                Add Book
            </a>
        </div>

        <div class="card">
            <h3>👨‍🏫 All Authors</h3>
            <p>Browse all authors registered in the library.</p>
            <a href="${pageContext.request.contextPath}/authors">
                View Authors
            </a>
        </div>

    </div>

    <div class="info">
        <strong>💡 Testing Guide</strong>
        <p>
            Use the navigation cards above to test all available
            features of the Campus Library Manager application.
        </p>
    </div>

</main>

<footer>
    Campus Library Manager | Java Spring MVC Project
</footer>

</body>
</html>