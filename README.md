# EmployeeCRUD

A simple Java project to perform CRUD operations on employees using MySQL database.

## Features
- Add employee
- View all employees
- Update employee salary
- Delete employee

## Tech Stack
- Java
- MySQL
- JDBC

## Setup
1. **Clone the repository**:
 git clone git@github.com:ramyasai-333/EmployeeCRUD.git

2.**Set environment variables for database credentials**:

  setx DB_USER "your_db_user"
  setx DB_PASSWORD "your_db_password"

  Replace your_db_user and your_db_password with your MySQL credentials.

3.**Make sure MySQL is running and your database is created**.
  -> Create a database called employee_db (or whatever your project uses).
  -> Ensure your tables match the project’s schema.

4.**Run the project**:
  -> Open in your IDE (Eclipse/IntelliJ/VS Code) and run Main.java
  -> Or compile & run from terminal:

javac -cp ".;lib/mysql-connector-java-<version>.jar" src/*.java
java -cp ".;lib/mysql-connector-java-<version>.jar;src" com.employee.crud.Main

Replace 8.0.31 with your MySQL connector version if different.
## Usage

Follow the menu in the terminal to add, view, update, or delete employees.

## Author
Ramya Sai Tirumalasetty
