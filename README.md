<h1 align="center">🔐 Secure Task Manager</h1>

<h3 align="center">
Production-Style Task Management Backend built with Spring Boot & JWT Authentication
</h3>

<p align="center">
Manage users, authenticate securely, and organize tasks through a scalable REST API architecture powered by Spring Security and JWT.
</p>

<p align="center">

<img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk">

<img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot">

<img src="https://img.shields.io/badge/Spring%20Security-Secured-success?style=for-the-badge&logo=springsecurity">

<img src="https://img.shields.io/badge/JWT-Authentication-blue?style=for-the-badge">

<img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql">

<img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven">

</p>

---

# 🚀 Overview

Secure Task Manager is a backend-focused task management application designed using modern Spring Boot development practices.

The system provides secure user authentication, authorization, task management, and role-based access control using JSON Web Tokens (JWT).

This project demonstrates production-oriented backend engineering concepts commonly used in enterprise applications.

---

# ✨ Key Features

## 🔐 Authentication & Authorization

- User Registration
- Secure Login
- JWT Token Generation
- JWT Validation
- Protected Endpoints
- Stateless Authentication
- Password Encryption using BCrypt

---

## 👤 User Management

- Create User Accounts
- User Profile Retrieval
- Role Assignment
- Role-Based Access Control
- Secure User Access

---

## ✅ Task Management

- Create Tasks
- View Tasks
- Update Tasks
- Delete Tasks
- Assign Tasks
- Task Status Management

---

## 🛡️ Security Features

- Spring Security Integration
- JWT Authentication Filter
- Secure API Access
- Password Encryption
- Custom UserDetailsService
- Authentication Middleware
- Protected Routes

---

# 🏗️ Project Architecture

```text
src/main/java/com/springboot_secure_task_manager

├── config
│   ├── SecurityConfig
│   └── PasswordEncoderConfig
│
├── controller
│   ├── AuthController
│   ├── UserController
│   └── TaskController
│
├── dto
│   ├── AuthRequestDto
│   ├── AuthResponseDto
│   ├── LoginRequest
│   ├── UserRegisterRequest
│   └── UserResponse
│
├── entity
│   ├── UserEntity
│   ├── TaskEntity
│   └── Role
│
├── repository
│   ├── UserRepository
│   └── TaskRepository
│
├── service
│   ├── UserService
│   ├── UserServiceImpl
│   ├── TaskService
│   └── TaskServiceImpl
│
├── security
│   ├── JwtAuthenticationFilter
│   ├── JwtService
│   └── UserDetailsServiceImpl
│
├── exception
│   ├── ApiError
│   └── GlobalExceptionHandler
│
└── SpringbootSecureTaskManagerApplication
```

---

# 🛠️ Tech Stack

## Backend

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate

## Security

- JWT Authentication
- BCrypt Password Hashing
- UserDetailsService

## Database

- MySQL

## Build Tool

- Maven

## Testing & Development

- Postman
- IntelliJ IDEA
- Git
- GitHub

---

# 📦 API Modules

## Authentication APIs

### Register User

```http
POST /api/auth/register
```

### Login User

```http
POST /api/auth/login
```

Returns a JWT token upon successful authentication.

---

## User APIs

### Get User Details

```http
GET /api/users
```

### Manage Users

```http
POST /api/users
PUT /api/users/{id}
DELETE /api/users/{id}
```

---

## Task APIs

### Create Task

```http
POST /api/tasks
```

### Get Tasks

```http
GET /api/tasks
```

### Update Task

```http
PUT /api/tasks/{id}
```

### Delete Task

```http
DELETE /api/tasks/{id}
```

---

# 🔒 Authentication Flow

```text
User Login
     │
     ▼
Authentication Manager
     │
     ▼
JWT Token Generated
     │
     ▼
Client Stores Token
     │
     ▼
Token Sent In Headers
     │
     ▼
JWT Filter Validation
     │
     ▼
Authorized Access
```

---

# 🎯 Learning Outcomes

This project demonstrates:

✅ Spring Boot Fundamentals

✅ Spring Security

✅ JWT Authentication

✅ Role-Based Authorization

✅ DTO Pattern

✅ Repository Pattern

✅ Service Layer Architecture

✅ Exception Handling

✅ REST API Development

✅ Secure Backend Engineering

---

# 🚀 Future Enhancements

- Refresh Tokens
- Email Verification
- Password Reset
- User Activity Logs
- Task Priorities
- Task Deadlines
- File Attachments
- Docker Support
- CI/CD Pipeline
- Cloud Deployment

---

# 📸 Project Status

✅ Functional Backend Application

🚀 Actively Improved & Maintained

---

# 📈 Why This Project Matters

This project simulates backend concepts used in real-world enterprise applications.

It focuses on security, authentication, layered architecture, and API development—skills expected from backend developers and internship candidates.

---

# 🤝 Connect With Me

## 👨‍💻 Vinamra Gupta

📧 Email

**vinamra.gupta.dev@gmail.com**

🔗 LinkedIn

**https://www.linkedin.com/in/vinamra-gupta-0aa4b4375**

🔗 GitHub

**https://github.com/VinamraGupta01**

---

# ⭐ Support

If you found this project useful, consider giving it a star.

It helps support future development and motivates future improvements.

---

<p align="center">

Built with ❤️ using Java, Spring Boot, Spring Security, JWT, and MySQL

</p>
