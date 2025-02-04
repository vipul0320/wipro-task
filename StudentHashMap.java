/*Write a Java program to implement a HashMap that stores student roll numbers (Integer) as keys 
and their names (String) as values. Perform the following operations:
Insert five student records.
Retrieve and display the name of a student using a specific roll number.
Remove a student entry using a roll number.
Display all student records. */


import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(2, "B");
        students.put(3, "C");
        students.put(4, "D");
        students.put(5, "E");

        int rollNo = 3;
        if (students.containsKey(rollNo)) {
            System.out.println("Student with Roll Number " + rollNo + ": " + students.get(rollNo));
        } else {
            System.out.println("Student with Roll Number " + rollNo+ " not found.");
        }

        int rollNumberToRemove = 2;
        students.remove(rollNumberToRemove);
        System.out.println("Student with Roll Number " + rollNumberToRemove + " removed.");

        System.out.println("All Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
