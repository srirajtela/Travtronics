# E-commerce Backend Development Assignment

## Objectives

This assignment involves developing a backend for an E-commerce platform using Java Spring Boot. The following objectives are set for this project:

### Framework

- Use **Java Spring Boot** as the core framework for backend development.
- Ensure modularity and scalability of the codebase.

### In-Memory Database

- Utilize an **H2 in-memory database** for storing and retrieving data.
- Pre-configure the database with necessary tables and data.
- Implement database operations efficiently.

### Role-Based Access Control

- Implement **JWT-based authentication** and role-based access for user and admin logins.
- Expose APIs that allow:
  - **Users** to log in and interact with the platform.
  - **Admins** to manage inventory and view platform-wide information.

### CRUD Operations on Product and Inventory

- Build APIs for **Create, Read, Update, and Delete (CRUD)** operations on products and inventory.
- Ensure proper validation, error handling, and concurrency management for stock updates.

### Paginated Product Search API

- Provide a **paginated API** that allows users to search for products based on name, category, or other criteria.
- Ensure the pagination logic is efficient and customizable (e.g., page size, sorting).

### CRUD Operations on Cart

- Develop APIs for users to manage their shopping cart, including:
  - **Add items** to the cart.
  - **Remove items** from the cart.
  - **Update cart item quantities**.
  - **View the current cart status**.

### Order Placement

- Expose an API to **place an order** based on the items in the user's cart.
- Implement proper concurrency handling using locks or synchronization to manage potential conflicts (e.g., multiple users ordering the same limited-stock item).


## Technology Stack

- **Java** 17
- **Spring Boot** 3.x
- **Spring Security**
- **Spring Data JPA**
- **H2 Database**
- **JWT** (JSON Web Tokens)







### Prerequisites

- **Java Development Kit (JDK)** 17 or later
- **Maven** 3.6+
- **Git**

### 1. Clone the Repository

```bash
git clone <repository-link>
cd <repository-directory>

````

### 2.Build the Project

To build the project and download the required dependencies, use Maven:

```bash
mvn clean install
````
- The application will start at http://localhost:8080.

### 3.Access the H2 Database Console
The H2 console can be accessed at http://localhost:8080/h2-console.

- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: password


### 4.API Endpoints
**Authentication APIs**

