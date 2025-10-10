package com.employee.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    // Add a new employee
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employees(name, age, department, salary) VALUES (?, ?, ?, ?)";
        
        Connection con = DBconnection.getConnection();
        if (con == null) {
            System.out.println("Cannot add employee: DB connection is null");
            return;
        }

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getName());
            ps.setInt(2, emp.getAge());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());
            
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee added successfully!");
            } else {
                System.out.println("Failed to add employee!");
            }
        } catch (SQLException e) {
            System.out.println("SQL Error while adding employee:");
            e.printStackTrace();
        }
    }

    // View all employees
    public void viewAllEmployees() {
        String sql = "SELECT * FROM employees";

        Connection con = DBconnection.getConnection();
        if (con == null) {
            System.out.println("Cannot view employees: DB connection is null");
            return;
        }

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("ID | Name | Age | Department | Salary");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            System.out.println("SQL Error while fetching employees:");
            e.printStackTrace();
        }
    }

    // Update employee salary
    public void updateSalary(int id, double newSalary) {
        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        Connection con = DBconnection.getConnection();
        if (con == null) {
            System.out.println("Cannot update salary: DB connection is null");
            return;
        }

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Salary updated successfully!");
            } else {
                System.out.println("No employee found with ID " + id);
            }

        } catch (SQLException e) {
            System.out.println("SQL Error while updating salary:");
            e.printStackTrace();
        }
    }

    // Delete employee
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";

        Connection con = DBconnection.getConnection();
        if (con == null) {
            System.out.println("Cannot delete employee: DB connection is null");
            return;
        }

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("No employee found with ID " + id);
            }

        } catch (SQLException e) {
            System.out.println("SQL Error while deleting employee:");
            e.printStackTrace();
        }
    }
}
