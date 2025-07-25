# 🧑‍💼 Staff Management API

A RESTful API built with Spring Boot that allows full management (CRUD) of staff records. Ideal for HR/admin systems where staff data needs to be created, read, updated, or deleted.

---

## 🚀 Features

- ✅ Create staff
- 📋 Read all or individual staff
- ✏️ Update staff information
- ❌ Delete staff records
- 🔄 REST API architecture
- 💾 MySQL database integration

---

## 🛠 Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA (Hibernate)
- **Build Tool:** Maven

---

## 📦 API Endpoints

> Base URL: `http://localhost:8080/api/staff`

| Method | Endpoint         | Description              |
|--------|------------------|--------------------------|
| POST   | `/api/staff`     | Add a new staff member   |
| GET    | `/api/staff`     | Get list of all staff    |
| GET    | `/api/staff/{id}`| Get details of one staff |
| PUT    | `/api/staff/{id}`| Update staff info        |
| DELETE | `/api/staff/{id}`| Delete staff member      |

---

## 🧾 Sample JSON

### ➕ Add New Staff

```json
{
  "name": "Ravi Kumar",
  "mob": "9876543210",
  "sub": "Mathematics"
}
