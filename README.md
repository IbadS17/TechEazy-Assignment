# TechEazy-Assignment

## Overview
This project is a Spring Boot application that serves as a microservice for managing students and subjects. It utilizes H2 in-memory database for data storage and implements JWT-based authentication.

## Prerequisites
- Java 19 or higher
- Apache Maven
- Git (optional, for cloning the repository)

## Getting Started

### Clone the Repository
To get started, clone the repository to your local machine using the following command:

```bash
git clone https://github.com/IbadS17/TechEazy-Assignment.git
cd TechEazy-Assignment
```

### Build the Project
Navigate to the project directory and build the project using Maven:

```bash
./mvnw clean install
```


### Configure the Application
The application uses an H2 in-memory database. You can configure the database settings in the `src/main/resources/application.properties` file. The default configuration is as follows:

```application.properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
```


### Run the Application
You can run the application using the following command:

```bash
./mvnw spring-boot:run
```

### Access the Application
Once the application is running, you can access the H2 console at:
```
http://localhost:8080/h2-console
```

Use the following credentials to log in:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User Name**: `sa`
- **Password**: (leave blank)

### API Endpoints
The following API endpoints are available:
- **POST /api/login**: Authenticate a user and receive a JWT token.
- **POST /api/student**: Add a new student (requires authentication).
- **POST /api/subject**: Add a subject to a student (requires authentication).

### Sample Data
You can populate the database with sample data by running the `data.sql` script located in `src/main/resources/data.sql`.

## Testing
To run the tests, use the following command:

``` bash
./mvnw test
```


## Conclusion
You are now set up to run the TechEazy-Assignment project. For further customization and development, refer to the Spring Boot documentation and the project codebase.