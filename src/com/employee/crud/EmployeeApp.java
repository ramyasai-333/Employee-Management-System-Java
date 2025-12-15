package com.employee.management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    Employee emp = new Employee(name, age, dept, salary);
                    dao.addEmployee(emp);
                    break;

                case 2:
                    dao.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update salary: ");
                    int idToUpdate = sc.nextInt();
                    System.out.print("Enter new Salary: ");
                    double newSalary = sc.nextDouble();
                    sc.nextLine();

                    dao.updateSalary(idToUpdate, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int idToDelete = sc.nextInt();
                    sc.nextLine();

                    dao.deleteEmployee(idToDelete);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
