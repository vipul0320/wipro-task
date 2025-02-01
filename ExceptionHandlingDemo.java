
/* Q1 - write a program that shows the implementation of null pointer exception &array index out of 
      bound exception using try catch finally blocks */


public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());

            int[] numbers = {2,3,4,6};
            System.out.println(numbers[5]);

        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("Finally block executed. Program cleanup done.");
        }

        System.out.println("Program continues execution");
    }
}
