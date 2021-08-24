package librarySoftware.model;

public class LibraryRepository {
    /*
    Template of the repository to store books in the library.
     */
    private final static int MAX_PUBLICATIONS_IN_LIBRARY = 4000; // variable to limit the number of the publications
    private int publicationsNumber = 0;
    private PublicationModel[] publicationsInLibraryArray = new PublicationModel[MAX_PUBLICATIONS_IN_LIBRARY];

    // make the function public to be able to call that method in the another package
    public void addBookIntoLibrary(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS_IN_LIBRARY) {
            publicationsInLibraryArray[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("The maximum number of the books has been reached.");
        }
    }

    // no parameter passed to the function below because I operate in the same class
    public void printBooksFromLibrary() {
        int booksNumber = 0;
        for (int i = 0; i < publicationsNumber; i++) { // limit is a booksNumber - avoid display the null values
            if (publicationsInLibraryArray[i] instanceof Book) {
                // can not call printBookInformations() on publicationsInLibraryArray[i] - I use reference type of PublicationModel
                // call only methods which are defined in the type of the reference - add a signature into the superior class
                // publicationsInLibraryArray[i].printBookInformations();
                publicationsInLibraryArray[i].printBookInformations();
                booksNumber++;
            }
        }
        if (booksNumber == 0)
            System.out.println("No available books in the library.");
    }

    public void addMagazineIntoLibrary(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS_IN_LIBRARY) {
            publicationsInLibraryArray[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("The maximum number of the magazines has been reached.");
        }
    }

    public void printMagazinesFromLibrary() {
        int magazinesNumber = 0;
        for (int i = 0; i < publicationsNumber; i++) { // limit is a publicationsNumber - avoid display the null values
            if (publicationsInLibraryArray[i] instanceof Magazine) {
                publicationsInLibraryArray[i].printMagazineInformations();
                magazinesNumber++;
            }
        }
        if (publicationsNumber == 0)
            System.out.println("No available magazines in the library.");
    }
}
