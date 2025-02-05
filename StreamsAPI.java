/*You said:
Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to:
 
Filter employees who are older than 30.
Find the average salary of employees who meet the age condition.
Collect the names of these employees into a List.
Print the list of employee names and the average salary.
Hint: Use filter(), map(), collect(), and average() methods from Streams */

import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class StreamsAPI {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("John", 28, 50000),
            new Employee("Alice", 35, 70000),
            new Employee("Bob", 32, 65000),
            new Employee("Diana", 29, 48000),
            new Employee("Eve", 40, 80000)
        );

        List<String> namesOver30 = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        double averageSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Employees older than 30:");
        namesOver30.forEach(System.out::println);

        System.out.println("\nAverage Salary of Employees older than 30: " + averageSalary);
    }
}
