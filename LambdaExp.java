/*Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse 
alphabetical order. Then, implement a functional interface StringProcessor with a method process(String str) 
that takes a string and returns its uppercase version. Use this functional interface in conjunction with a 
lambda expression to process a list of strings and print their uppercase forms.
 
Hint: Use List.sort(), lambda expressions, and String::toUpperCase */

import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaExp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("cricket", "football", "tennis", "basketball", "golf");

        names.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted in Reverse Alphabetical Order:");
        names.forEach(System.out::println);
        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();

        System.out.println("\nUppercase Versions:");
        names.forEach(name -> System.out.println(toUpperCaseProcessor.process(name)));
    }
}
