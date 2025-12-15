# Employee Management System (Java)

A console-based Java application developed to understand and implement
CRUD (Create, Read, Update, Delete) operations on employee data using
JDBC and a MySQL database.

This project focuses on backend fundamentals such as database connectivity,
SQL operations, and clean code structure.

---

## Features
- Add new employee records
- View all employees
- Update employee salary
- Delete employee details
- Menu-driven console interaction

---

## Tech Stack
- Java
- JDBC
- MySQL

---

## Project Structure
- Model class for employee data
- DAO layer for database operations
- Utility class for database connection
- Main class to handle user interaction

---

## Setup Instructions

### 1️⃣ Clone the repository
```bash
git clone https://github.com/ramyasai-333/Employee-Management-System-Java.git
```
### 2️⃣ Configure database credentials
Set your MySQL credentials as environment variables:
```bash
setx DB_USER "your_db_user" 
setx DB_PASSWORD "your_db_password"
```
Replace your_db_user and your_db_password with your MySQL username and password.

### 3️⃣ Database setup
- Ensure MySQL is running
- Create a database (for example: `employee_db`)
- Create the required employee table based on the project schema

### 4️⃣ Run the application

### Using an IDE
- Open the project in Eclipse / IntelliJ / VS Code
- Run the `Main.java` file

### Using terminal
```bash
javac -cp ".;lib/mysql-connector-java-<version>.jar" src/*.java
java -cp ".;lib/mysql-connector-java-<version>.jar;src" com.company.ems.Main
```
Replace <version> with your MySQL Connector/J version (for example, 8.0.31).

### Usage
Run the application and follow the menu displayed in the terminal to:

- Add employees
- View employee details
- Update salary
- Delete employee records

### What I Learned
- JDBC connection handling
- CRUD operations using SQL
- DAO design pattern
- Exception handling in Java
- Structuring a backend Java project

### Note
This project was developed as part of learning Java backend development,
using reference materials and documentation to understand JDBC and database operations.

### Author
Ramya Sai Tirumalasetty
