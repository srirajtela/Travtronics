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
## Authentication APIs

### Login

- `POST /api/auth/login`
- Use this point to authenticate users and admins using JWT.


## Product and Inventory Management APIs

### Create Product

-  `POST /api/products`
-  Use this point to create a new product.

### Get Product by ID

-  `GET /api/products/{id}`
-  Use this point to retrieve a product by its ID.

### Update Product

-  `PUT /api/products/{id}`
-  Use this point to update an existing product by its ID.

### Delete Product

-  `DELETE /api/products/{id}`
-  Use this point to delete a product by its ID.

### Paginated Product Search API

-  `GET /api/products/search`
  - `name` (optional): The name of the product to search for.
  - `page` (optional): The page number for pagination.
  - `size` (optional): The number of items per page.
  - `sortBy` (optional): The field by which to sort the results.
- GET /api/products/search?name=example&page=1&size=20&sortBy=name
- Use this point to search for products with pagination and sorting options.



## Cart Management APIs

### Add Item to Cart

- `POST /api/cart`
- Use this point to add an item to the cart.

### Remove Item from Cart

-  `DELETE /api/cart/{itemId}`
-  Use this point to remove an item from the cart by its ID.

### Update Cart Item Quantity

-  `PUT /api/cart/{itemId}`
-  Use this point to update the quantity of a cart item by its ID.

### View Cart Status

-  `GET /api/cart`
-  Use this point to retrieve the current status of the cart.



## Order Placement API

### Place Order

-  `POST /api/orders`
-  Use this point to place a new order.



## Configuration Files

- **`src/main/resources/application.properties`**:

## Transaction Management

The application uses Spring's `@Transactional` annotation to manage database transactions and ensure data consistency.


