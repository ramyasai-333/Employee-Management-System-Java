package com.employee.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String URL = "jdbc:mysql://localhost:3306/employee_db"; // Replace with your DB name
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection getConnection() {
        try {
            // For JDBC 4+, Class.forName() is not needed
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
            return con;
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }

    // Test connection independently
    public static void main(String[] args) {
        Connection con = DBconnection.getConnection();
        if (con != null) {
            System.out.println("DB connection test successful!");
        }
    }
}
