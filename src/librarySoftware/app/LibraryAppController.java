package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;
import librarySoftware.model.LibraryRepository;
import librarySoftware.model.Magazine;

class LibraryAppController {
    /*
    Class which connects all functionality of the entire Library software.
     */
    private final static int EXIT = 0;
    private final static int INSERT_BOOK = 1;
    private final static int INSERT_MAGAZINE = 2;
    private final static int PRINT_BOOKS_FROM_LIBRARY = 3;
    private final static int PRINT_MAGAZINES_FROM_LIBRARY = 4;

    // create object class's field to store Books in the library
    private DataInput dataInput = new DataInput();
    // create object class's field to read in data from the users
    private LibraryRepository libraryRepository = new LibraryRepository();

    // display functionality of the Library-Software
    public void mainLibraryController() {
        int userChoice;
        do {
            displayUserOptions();
            userChoice = dataInput.inputInt();
            switch (userChoice) {
                case EXIT:
                    closeApp();
                    break;
                case INSERT_BOOK:
                    insertBookToLibrary();
                    break;
                case INSERT_MAGAZINE:
                    insertMagazineToLibrary();
                    break;
                case PRINT_BOOKS_FROM_LIBRARY:
                    printAllBooksFromLibrary();
                    break;
                case PRINT_MAGAZINES_FROM_LIBRARY:
                    printAllMagazinesFromLibrary();
                    break;
                default:
                    System.out.println("The option has not been chosen correctly.");
            }
        } while (userChoice != EXIT);
    }

    private void closeApp() {
        System.out.println("Closing app...");
        dataInput.closeScanner();
    }

    private void insertBookToLibrary() {
        Book book = dataInput.readAndCreateBookObject();
        libraryRepository.addBookIntoLibrary(book);
    }

    private void printAllBooksFromLibrary() {
        libraryRepository.printBooksFromLibrary();
    }

    private void insertMagazineToLibrary() {
        Magazine magazine = dataInput.readAndCreateMagazineObject();
        libraryRepository.addMagazineIntoLibrary(magazine);
    }

    private void printAllMagazinesFromLibrary() {libraryRepository.printMagazinesFromLibrary();}

    private void displayUserOptions() {
        System.out.println("Choose option:");
        System.out.println("0 - Exit.");
        System.out.println("1 - Add a new book.");
        System.out.println("2 - Add a new magazine.");
        System.out.println("3 - Display available books.");
        System.out.println("4 - Display available magazines.");
    }
}
