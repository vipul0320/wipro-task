 // Q2 Write a java program by creating a custom exception of your own 

public class ExceptionWithoutClass {
    public static void main(String[] args) {
        try {
            checkNumber(-5); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    public static void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed!");
        } else {
            System.out.println("Valid number: " + num);
        }
    }
}
