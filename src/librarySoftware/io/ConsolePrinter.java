package librarySoftware.io;

import librarySoftware.model.Book;
import librarySoftware.model.Magazine;
import librarySoftware.model.PublicationModel;

public class ConsolePrinter {
    /*
    Presents data to users.
     */

    public void printBooksFromLibrary(PublicationModel[] publicationsInLibraryArray) {
        int booksNumber = 0;
        for (PublicationModel publication : publicationsInLibraryArray) {
            if (publication instanceof Book) {
                System.out.println(publication);
                booksNumber++;
            }
        }
        if (booksNumber == 0)
            printLine("No available books in the library.");
    }

    public void printMagazinesFromLibrary(PublicationModel[] publicationsInLibraryArray) {
        int magazinesNumber = 0;
        for (PublicationModel publication : publicationsInLibraryArray) {
            if (publication instanceof Magazine) {
                System.out.println(publication);
                magazinesNumber++;
            }
        }
        if (magazinesNumber == 0)
            printLine("No available magazines in the library.");
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}
