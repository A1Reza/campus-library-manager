<div align="center">

# 📚 Campus Library Manager

**A lightweight campus library management web application built with Java and Spring MVC.**

Manage books and authors through a clean, layered MVC architecture.

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring MVC](https://img.shields.io/badge/Spring%20MVC-6.x-6DB33F?logo=spring)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven)
![JSP](https://img.shields.io/badge/View-JSP-blue)
![MapStruct](https://img.shields.io/badge/Mapper-MapStruct-2E7D32)

</div>

---

## 📖 Overview

Campus Library Manager is a Java web application for browsing and managing a small campus library collection. It provides pages for viewing all books, inspecting an individual book, adding a new book, and browsing authors.

The application uses **in-memory repositories** for data storage. No database is required; the sample data is initialized when the application starts, and books added during runtime are reset when the server restarts.

## ✨ Features

- 📚 View the complete book collection.
- 🔎 View book details, including the associated author and page count.
- ➕ Add a new book using an HTML form.
- ✍️ Browse the available authors.
- 🔗 Navigate between the main application pages.
- 🧩 Convert request and response objects with MapStruct.
- 🏗️ Separate model, repository, service, controller, and view layers.
- ⚙️ Configure application components using XML-based Spring configuration.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Framework 6.x | MVC and dependency injection |
| Spring MVC | Web request handling and controllers |
| JSP & JSTL | Server-side view rendering |
| Maven | Dependency and build management |
| Lombok | Reduce Java boilerplate |
| MapStruct | DTO/entity mapping |
| Apache Tomcat 11 | Servlet container |
| Jakarta Servlet | Servlet API |

## 🧱 Application Architecture

The application follows a layered architecture:

```text
Browser
   |
   v
Spring DispatcherServlet
   |
   v
Controllers
   |
   v
Services  <---- MapStruct Mappers / DTOs
   |
   v
Repositories
   |
   v
In-Memory Data
```

### Project structure

```text
campus-library-manager/
├── src/
│   └── main/
│       ├── java/com/library/
│       │   ├── controller/
│       │   ├── dto/
│       │   │   ├── request/
│       │   │   └── response/
│       │   ├── mapper/
│       │   ├── model/
│       │   ├── repository/
│       │   └── service/
│       ├── resources/
│       │   └── applicationContext.xml
│       └── webapp/
│           ├── WEB-INF/
│           │   ├── views/
│           │   ├── dispatcher-servlet.xml
│           │   └── web.xml
│           └── index.jsp
├── api-requests.http
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites

Make sure the following tools are installed:

- JDK 21
- Apache Maven (or use the included Maven Wrapper)
- Apache Tomcat 11
- IntelliJ IDEA (recommended)

### Run the application

1. Clone the repository:

   ```bash
   git clone https://github.com/A1Reza/campus-library-manager.git
   cd campus-library-manager
   ```

2. Build the WAR package:

   **Windows:**
   ```bash
   mvnw.cmd clean package
   ```

   **Linux / macOS:**
   ```bash
   ./mvnw clean package
   ```

3. Deploy the generated WAR file from `target/` to Tomcat 11.

4. Start Tomcat and open:

   ```text
   http://localhost:8080/campus-library/
   ```

> **Note:** The deployed context path depends on the WAR file name and your Tomcat configuration.

## 🌐 Application Pages

| Page | URL | Description |
|---|---|---|
| Home | `/` | Main navigation page |
| Book List | `/books` | Displays all books |
| Book Details | `/books/detail?id=1` | Displays a selected book |
| Add Book | `/books/add` | Shows the form and accepts new books |
| Author List | `/authors` | Displays all authors |

## 🧪 HTTP Requests

The project includes [`api-requests.http`](./api-requests.http), which contains sample HTTP requests for checking the application endpoints.

You can run these requests directly from IntelliJ IDEA's HTTP Client. Make sure the `baseUrl` in the file matches your local Tomcat context path.

## 🗃️ Sample Data and Storage

The repositories initialize the application with sample authors and books.

- Books contain an ID, title, author ID, and page count.
- Authors contain an ID and name.
- Book and author data are held in memory.
- No database configuration or external database server is needed.
- Runtime changes are not persisted after an application restart.

## 🎯 Design Notes

- Controllers implement Spring MVC's `Controller` interface.
- Spring beans are configured through XML configuration files.
- The root application context contains repositories and services.
- The `DispatcherServlet` child context contains MVC controllers and view resolution configuration.
- DTO mapping is handled with MapStruct and invoked from the service layer.

## 👨‍💻 Author

**Reza Asadipour**

- GitHub: [@A1Reza](https://github.com/A1Reza)
- Repository: [campus-library-manager](https://github.com/A1Reza/campus-library-manager)

---

<div align="center">

**Built with ☕ Java and Spring MVC**

</div>
