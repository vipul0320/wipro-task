/*Create a class hierarchy for a Library System. Implement a base class Item with properties like title, 
author, and publicationYear. Derive two classes, Book and Magazine, from the Item class. 
Each derived class should have additional properties such as genre for books and issueNumber for magazines. 
Write methods in each class to display their details. Demonstrate the use of inheritance by creating objects 
of both classes and calling their respective methods. */

class Item {
    String title;
    String author;
    int publicationYear;

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}


class Book extends Item {
    String genre;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends Item {
    int issueNumber;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Programming";
        book.author = "ABC";
        book.publicationYear = 2025;
        book.genre = "Educational";

        Magazine magazine = new Magazine();
        magazine.title = "Cricket ";
        magazine.author = "XYZ";
        magazine.publicationYear = 2025;
        magazine.issueNumber = 45;

        System.out.println("Book Details");
        book.displayDetails();

        System.out.println("\n Magazine Details");
        magazine.displayDetails();
    }
}
