# Student Management API

A simple RESTful API for managing student records, built with Spring Boot, Spring Data JPA, and H2 in-memory database.

## Features
- **CRUD operations** for students (Create, Read, Update, Delete)
- **Input validation** with helpful error messages
- **Global exception handling**
- **OpenAPI/Swagger UI** documentation
- **In-memory H2 database** (no setup required)

## Technologies Used
- Java 21
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Lombok
- Springdoc OpenAPI

## Getting Started

### Prerequisites
- Java 21+
- Maven (or use the included `mvnw` wrapper)

### Running the Application

```
./mvnw spring-boot:run
```

The API will be available at: `http://localhost:8080/api/students`

### API Endpoints

| Method | Endpoint                | Description              |
|--------|-------------------------|--------------------------|
| POST   | `/api/students`         | Add a new student        |
| GET    | `/api/students`         | Get all students         |
| GET    | `/api/students/{id}`    | Get a student by ID      |
| PUT    | `/api/students/{id}`    | Update a student         |
| DELETE | `/api/students/{id}`    | Delete a student         |

### API Documentation
- Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### H2 Database Console
- [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:studentsdb`
- User: `sa` (no password)

## Project Structure
- `Controllers/` — REST API endpoints
- `Models/` — Data models (entities, error responses)
- `Repository/` — Spring Data JPA repositories
- `Services/` — Business logic
- `Exceptions/` — Custom and global exception handling

## Running Tests

```
./mvnw test
```

## License
This project is for demonstration purposes.
