/*Write a Java program to create a HashSet of strings. Perform the following operations:
Add five city names to the set, ensuring at least one duplicate entry.
Display the elements to show that duplicates are not allowed.
Check if a particular city exists in the set.
Remove a city and display the updated set. */


import java.util.HashSet;

public class HashSetCity{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Kota");
        cities.add("Kolkata");
        cities.add("Noida");
        cities.add("Delhi");

        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        String cityToCheck = "Mumbai";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the HashSet.");
        } else {
            System.out.println(cityToCheck + " does not exist in the HashSet.");
        }

        cities.remove("Kolkata");
        System.out.println("Updated Cities after removing 'Kolkata':");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
