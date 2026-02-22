# 🔐 Spring Boot Secure Task Manager

A **secure, production-ready REST API** built using **Spring Boot** that demonstrates **JWT-based authentication, role-based authorization, and clean backend architecture**.

This project is designed to reflect **real-world backend development practices** and is ideal for **portfolio, interviews, and industry readiness**.

---

## 📌 Overview

The **Spring Boot Secure Task Manager** allows users to:

* Register and authenticate securely
* Access protected APIs using JWT tokens
* Perform CRUD operations on tasks
* Ensure users can only access their own data

The application follows **layered architecture**, **SOLID principles**, and **Spring Security best practices**.

---

## ✨ Key Features

* 🔑 JWT Authentication (Stateless Security)
* 👤 User Registration & Login
* 🧑 Role-Based Authorization
* 📝 Task Management (Create, Read, Delete)
* 🔒 User-specific data access
* ⚠️ Global Exception Handling
* 🧼 Clean code & modular structure
* 🧪 Easily testable via Postman

---

## 🛠️ Tech Stack

| Technology      | Purpose                           |
| --------------- | --------------------------------- |
| Java 17         | Backend language                  |
| Spring Boot     | Application framework             |
| Spring Security | Authentication & Authorization    |
| JWT             | Secure token-based authentication |
| Spring Data JPA | Database interaction              |
| Hibernate       | ORM                               |
| H2 / MySQL      | Database                          |
| Maven           | Dependency management             |
| Postman         | API testing                       |

---

## 📁 Project Structure

```
springboot-secure-task-manager
│
├── config         → Security & password configuration
├── controller     → REST API endpoints
├── dto            → Request / Response objects
├── entity         → JPA entities
├── exception      → Global exception handling
├── repository     → Database repositories
├── security       → JWT filters & services
├── service        → Business logic layer
└── resources      → Application properties
```

---

## 🔐 Security Architecture

* Stateless authentication using **JWT**
* Tokens validated on every secured request
* Passwords encrypted using **BCrypt**
* Unauthorized access handled gracefully

---

## 🔄 Authentication Flow

1. User registers
2. User logs in with credentials
3. Server generates a **JWT token**
4. Client sends token in `Authorization` header
5. Token is validated before accessing secured APIs

---

## 🌐 API Endpoints

### 🔑 Authentication

| Method | Endpoint              | Description         |
| ------ | --------------------- | ------------------- |
| POST   | `/api/users/register` | Register a new user |
| POST   | `/api/auth/login`     | Authenticate user   |

### 📝 Task Management (JWT Required)

| Method | Endpoint          | Description      |
| ------ | ----------------- | ---------------- |
| POST   | `/api/tasks`      | Create a task    |
| GET    | `/api/tasks`      | Get user’s tasks |
| DELETE | `/api/tasks/{id}` | Delete a task    |

---

## 🧪 Testing with Postman

### Authorization Header

```
Authorization: Bearer <JWT_TOKEN>
```

### Example Request Body

```json
{
  "title": "Learn Spring Security",
  "description": "Implement JWT authentication"
}
```

---

## ▶️ How to Run Locally

```bash
git clone https://github.com/VinamraGupta01/springboot-secure-task-manager.git
cd springboot-secure-task-manager
mvn spring-boot:run
```

Application runs on:

```
http://localhost:8080
```

---

## 🚀 Future Enhancements

* ✅ Update Task API
* 📅 Task deadlines & priorities
* 🧾 Swagger / OpenAPI documentation
* 🐳 Docker support
* ☁️ Deployment (AWS / Render)

---

## 👨‍💻 Author

**Vinamra Gupta**
🎓 BCA Student | Java Backend Developer
💡 Focused on clean architecture & secure backend systems

🔗 GitHub: [VinamraGupta01](https://github.com/VinamraGupta01)

---

## ⭐ Why This Project?

This project showcases:

* Industry-standard Spring Boot practices
* Secure authentication mechanisms
* Clean and maintainable backend code
* Interview-ready REST API design

If you like this project, ⭐ the repository
