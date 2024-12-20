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
You are now set up to run the TechEazy-Assignment project. For further customization and development, refer to the Spring Boot documentation and the project codebase.# TechEazy-Assignment

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
The application uses an H2 in-memory database. You can configure the database settings in the [`src/main/resources/application.properties`](command:_github.copilot.openRelativePath?%5B%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fresources%2Fapplication.properties%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "c:\Projects\Assignment\TechEazy-Assignment\src\main\resources\application.properties") file. The default configuration is as follows:

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
- **User Name**: [`sa`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2FREADME.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A36%2C%22character%22%3A27%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A48%2C%22character%22%3A80%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Ftarget%2Fclasses%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A48%2C%22character%22%3A80%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A47%2C%22character%22%3A80%7D%7D%5D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "Go to definition")
- **Password**: (leave blank)

### Add an Admin User
To access the admin endpoints, you need to add an admin user to the database. You can do this by inserting a new user with the role [`ADMIN`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Ftarget%2Fclasses%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A72%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A72%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A72%7D%7D%5D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "Go to definition") into the [`Student`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FCustomUserDetailService.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A2%2C%22character%22%3A26%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A50%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Ftarget%2Fclasses%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java~%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A50%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fjava%2Fcom%2FTechEazy%2Fconfig%2FWebsecurity.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A33%2C%22character%22%3A50%7D%7D%5D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "Go to definition") table using the H2 console. Here is an example SQL statement to add an admin user:

```sql
INSERT INTO Student (email, password, role) VALUES ('admin@example.com', 'adminpassword', 'ROLE_ADMIN');
```

### API Endpoints
The following API endpoints are available:
- **POST /api/login**: Authenticate a user and receive a JWT token.
- **POST /api/student**: Add a new student (requires authentication).
- **POST /api/subject**: Add a subject to a student (requires authentication).
- **GET /api/getAllStudents**: Retrieve all students (requires authentication).
- **GET /api/getAllSubject**: Retrieve all subjects (requires authentication).

### Sample Data
You can populate the database with sample data by running the [`data.sql`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2FHELP.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A13%2C%22character%22%3A85%7D%7D%5D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "Go to definition") script located in [`src/main/resources/data.sql`](command:_github.copilot.openRelativePath?%5B%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FProjects%2FAssignment%2FTechEazy-Assignment%2Fsrc%2Fmain%2Fresources%2Fdata.sql%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22cad9de89-7ffe-4eb4-aac6-897b59f14b33%22%5D "c:\Projects\Assignment\TechEazy-Assignment\src\main\resources\data.sql").

## Testing
To run the tests, use the following command:

``` bash
./mvnw test
```

## Conclusion
You are now set up to run the TechEazy-Assignment project. For further customization and development, refer to the Spring Boot documentation and the project codebase.