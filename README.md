# Car Management System

## Overview
The Car Management System is a Spring Boot-based REST API that allows users to perform CRUD operations on car details. It includes features like pagination, sorting, global search, and validation.

## Features
- Add, view, update, and delete car information.
- Global search by name, model, year, color, and fuel type.
- Pagination and sorting for efficient data handling.
- Input validation for all car details.
- Swagger-based API documentation.
- Deployed on AWS Elastic Beanstalk.

## Technologies Used
- **Backend**: Spring Boot
- **Database**: MySQL
- **API Documentation**: Swagger (SpringDoc OpenAPI)
- **Hosting**: AWS Elastic Beanstalk

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd car-management-system
Build the application:
mvn clean package


Run the application:
mvn spring-boot:run
Access the application at http://localhost:8080.

API Documentation
Swagger UI is available at:
http://localhost:8080/swagger-ui.html

Endpoints
Method	Endpoint	Description
GET	/api/cars	Get all cars
GET	/api/cars/{id}	Get car by ID
POST	/api/cars	Add a new car
PUT	/api/cars/{id}	Update car details
DELETE	/api/cars/{id}	Delete a car


Database Configuration
Update the following properties in the application.properties file to connect to your MySQL database:
properties
spring.datasource.url=jdbc:mysql://<hostname>:<port>/<database_name>
spring.datasource.username=<username>
spring.datasource.password=<password>


License
This project is licensed under the MIT License.







