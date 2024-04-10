package uml;

import java.util.Scanner;

public class Company {

  private String name;
  private Employee[] employees;
  
  
  //list new arraylist

  public Company(String name, int employeeCount) {
    this.name = name;
    this.employees = new Employee[employeeCount];
  }

  public void addEmployee(Employee employee, int index) {
    if (index >= 0 && index < employees.length) {
      employees[index] = employee;
    } else {
      System.out.println("Invalid employee index!");
    }
  }

  public void removeEmployee(int index) {
    if (index >= 0 && index < employees.length && employees[index] != null) {
      employees[index] = null;
      System.out.println("Employee removed successfully.");
    } else {
      System.out.println("Invalid employee index or employee not found!");
    }
  }

  public void printEmployees() {
    for (Employee employee : employees) {
      if (employee != null) {
        System.out.println(employee.introduce());
      }
    }
  }

  public static void main(String[] args) {
    Employee emp1 = new Employee("John Doe", 30, "Engineering", "Software Engineer");
    Employee emp2 = new Employee("Jane Smith", 25, "Marketing", "Marketing Manager");

    Company acmeCorp = new Company("Acme Corp", 2);
    acmeCorp.addEmployee(emp1, 0);
    acmeCorp.addEmployee(emp2, 1);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Acme Corp Employee Management System!");
    System.out.println("Enter 1 to view employee information:");
    System.out.println("Enter 2 to move an employee to another company:");

    int choice = scanner.nextInt();

    if (choice == 1) {
      System.out.println("Acme Corp Employees:");
      acmeCorp.printEmployees();
    } else if (choice == 2) {
      System.out.println("Enter the index of the employee to move (0 or 1):");
      int employeeIndex = scanner.nextInt();
      System.out.println("Enter the name of the new company:");
      String newCompanyName = scanner.nextLine();  

      if (employeeIndex >= 0 && employeeIndex < acmeCorp.employees.length && acmeCorp.employees[employeeIndex] != null) {
        Employee employeeToMove = acmeCorp.employees[employeeIndex];
        acmeCorp.removeEmployee(employeeIndex);
        System.out.println("Employee successfully removed from " + acmeCorp.name + ".");
        System.out.println("Employee moved to " + newCompanyName + ".");
      } else {
        System.out.println("Invalid employee index or employee not found!");
      }
    } else {
      System.out.println("Invalid choice!");
    }

    scanner.close();
  }
}

