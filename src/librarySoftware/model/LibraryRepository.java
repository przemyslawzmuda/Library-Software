package librarySoftware.model;

public class LibraryRepository {
    /*
    Template of the repository to store books in the library.
     */
    private final int maxBooks = 2000; // variable to limit number of the books in the booksArray
    private Book[] booksArray = new Book[maxBooks];

    private int booksNumber = 0;
    // make the function public to be able to call that method in the another package
    public void addBookIntoLibrary(Book book) {
        if (booksNumber < maxBooks) {
            booksArray[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("The maximum number of the books has been reached.");
        }
    }

    // no parameter passed to the function below because I operate in the same class
    public void printBooksFromLibrary() {
        if (booksNumber == 0)
            System.out.println("No available books in the library.");
        for (int i = 0; i < booksNumber; i++) { // limit is a booksNumber - avoid display the null values
            booksArray[i].printBookInformations();
        }
    }
}
