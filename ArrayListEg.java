/*Write a Java program to create an ArrayList of integers. Perform the following operations:
Add five integer elements to the list.
Remove the third element.
Update the second element with a new value.
Display all the elements using a loop. */


import java.util.ArrayList;

public class ArrayListEg{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(25);
        numbers.add(3);
        numbers.add(42);
        numbers.add(53);

        numbers.remove(2);
        numbers.set(1, 99);
        System.out.println("Elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
