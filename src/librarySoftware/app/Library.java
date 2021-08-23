package librarySoftware.app;

import librarySoftware.model.Book;

public class Library {
    // This class will store information about books according to the Book template.
    public static void main(String[] args) {
        final String appName = "Library v0.7";

        Book[] booksArray = new Book[2000];

        booksArray[0] = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 1997, 330,
                "Historia", "dbsjcbd2342");
        booksArray[1] = new Book("Potop", "Henryk Sienkiewicz", 2004);
        System.out.println(appName);
        System.out.println("Books available in the Library:");
        booksArray[0].printBookInformations();
        booksArray[1].printBookInformations();

    }
}
