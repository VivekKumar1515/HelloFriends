# Facebook Clone Backend

This project is the backend component of a Facebook Clone, built using Spring Boot. It handles various operations such as creating, reading, updating, and deleting posts, and supports uploading media files up to 200MB.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Tomcat

## Project Setup

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Dependencies

The following dependencies are included in the `pom.xml` file:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- MySQL Connector Java
- Spring Boot Starter Test

### Configuration

1. **Database Configuration**: Update your database configuration in the `application.properties` file.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/facebook_clone
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

2. **File Upload Configuration**: Configure the Tomcat server to accept file uploads up to 200MB.

    ```properties
    spring.servlet.multipart.max-file-size=200MB
    spring.servlet.multipart.max-request-size=200MB
    ```

3. **Running the Application**: Use the following command to run the application:

    ```bash
    mvn spring-boot:run
    ```

## Project Structure

- **Model**: Contains entity classes representing the database tables.
- **Repository**: Contains interfaces for database interactions.
- **Controller**: Contains REST controllers that handle HTTP requests and responses.
- **Service**: Contains business logic.

## MVC Architecture

### Model

The model represents the data structure, including the entity classes that define the properties of posts and their corresponding database fields.

### Repository

The repository interfaces handle database operations, such as CRUD operations for the post entity.

### Controller

The REST controller handles incoming requests and defines endpoints for operations related to posts, including creating, reading, updating, and deleting posts, as well as handling file uploads.

### Service

The service layer contains business logic, interacting with the repository layer to perform database operations and with the controller layer to handle HTTP requests.

## API Endpoints

- `GET /api/posts` - Fetch all posts.
- `POST /api/posts` - Add a new post.
- `PUT /api/posts/{id}` - Update an existing post.
- `DELETE /api/posts/{id}` - Delete a post.
- `POST /api/posts/upload` - Upload media files for a post.

## File Storage

The application uses a MySQL database to store media files as BLOBs (Binary Large Objects). This allows for storing media files up to 200MB.

## Conclusion

This backend project for the Facebook Clone provides a solid foundation for handling posts and media files with Spring Boot.
