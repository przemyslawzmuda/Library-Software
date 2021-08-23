package librarySoftware.model;

public class LibraryRepository {
    /*
    Template of the repository to store books in the library.
     */
    private final static int MAX_BOOKS = 2000; // variable to limit number of the books in the booksArray
    private final static int MAX_MAGAZINES = 2000;
    private Book[] booksArray = new Book[MAX_BOOKS];
    private Magazine[] magazinesArray = new Magazine[MAX_MAGAZINES];

    private int booksNumber = 0;
    private int magazinesNumber = 0;

    // make the function public to be able to call that method in the another package
    public void addBookIntoLibrary(Book book) {
        if (booksNumber < MAX_BOOKS) {
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

    public void addMagazineIntoLibrary(Magazine magazine) {
        if (booksNumber < MAX_MAGAZINES) {
            magazinesArray[magazinesNumber] = magazine;
            magazinesNumber++;
        } else {
            System.out.println("The maximum number of the magazines has been reached.");
        }
    }

    public void printMagazinesFromLibrary() {
        if (magazinesNumber == 0)
            System.out.println("No available magazines in the library.");
        for (int i = 0; i < magazinesNumber; i++) { // limit is a magazinesNumber - avoid display the null values
            magazinesArray[i].printMagazineInformations();
        }
    }
}
