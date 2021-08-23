package librarySoftware.io;

import librarySoftware.model.Book;
import java.util.Scanner;

public class DataInput {
    /*
    This class will allow to create new objects according to the data entered by a user.
    It should be only one place to perform interaction with the users.
     */
    private Scanner input = new Scanner(System.in); // create an input object to read data from a user as a class's field

    public int inputInt() {
        int number = input.nextInt();
        input.nextLine(); // consume a whitespace from an enter key
        return number;
    }

    public Book readAndCreateBookObject() {
        System.out.println("Title:");
        String titleBook = input.nextLine();
        System.out.println("Author:");
        String authorBook = input.nextLine();
        System.out.println("Publish date:");
        int publishDateBook = inputInt();
        System.out.println("Pages number:");
        int pagesNumberBook = inputInt();
        System.out.println("Publisher:");
        String publisherBook = input.nextLine();
        System.out.println("ISBN:");
        String isbnBook = input.nextLine();
        return new Book(titleBook, authorBook, publishDateBook, pagesNumberBook, publisherBook, isbnBook);
    }

    public void closeScanner() {
        input.close();
    }
}
