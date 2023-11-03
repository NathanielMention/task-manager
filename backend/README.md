# Task Manager Backend

This is the backend of the Task Manager project, an application that helps users organize and manage their tasks efficiently. The backend is built using Spring Boot and provides a RESTful API for creating, updating, and retrieving tasks and user information. This README will guide you through the setup and usage of the Task Manager backend.

## Features

- **RESTful API:** The backend offers a RESTful API to interact with tasks and users.

- **User Authentication:** Secure user authentication and authorization are implemented.

- **Data Persistence:** Task and user data are stored in a PostgreSQL database.

- **Exception Handling:** Gracefully handles exceptions and provides appropriate error responses.

- **Unit Testing:** Includes unit tests for controllers and services.

- **Security:** Implements security configurations to protect the API.

## Prerequisites

Before you start, ensure you have the following prerequisites:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)

## Setup

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/task-manager-backend.git

   ```

2. Configure your PostgreSQL database settings in the application.properties file. You can find an example .env file in this repository. Copy it and update the database credentials.

3. Build and run the Spring Boot application:

```mvn spring-boot:run

```
