/* Design an Employee Management System where you create an abstract class Employee with abstract methods 
like calculateSalary() and displayDetails(). Create two derived classes, FullTimeEmployee and 
PartTimeEmployee, and implement the abstract methods. For FullTimeEmployee, calculate salary as a fixed 
monthly rate, and for PartTimeEmployee, calculate salary based on hourly rates. Demonstrate polymorphism 
by creating an array of Employee objects and calculating/displaying salaries using overridden methods.*/

abstract class Employee {
    public abstract double calculateSalary();

    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary*12;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.println("Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        
        employees[0] = new FullTimeEmployee("Alice", 50000);
        employees[1] = new PartTimeEmployee("Bob", 20, 120);


        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
