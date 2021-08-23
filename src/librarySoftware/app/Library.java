package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;

public class Library {
    // This class will store information about books according to the Book template.
    public static void main(String[] args) {
        final String appName = "Library v0.8";

        Book[] booksArray = new Book[2000];
        DataInput dataInput = new DataInput();

        System.out.println(appName);
        System.out.println("Enter the first a new book:");
        booksArray[0] = dataInput.readAndCreateBookObject();
        System.out.println("Enter the second a new book:");
        booksArray[1] = dataInput.readAndCreateBookObject();
        dataInput.closeScanner();

        System.out.println("Books available in the library:");
        booksArray[0].printBookInformations();
        booksArray[1].printBookInformations();


    }
}
