package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;
import librarySoftware.model.LibraryRepository;

class LibraryAppController {
    /*
    Class which connects all functionality of the entire Library software.
     */
    private final int exit = 0;
    private final int insertBook = 1;
    private final int printBooksFromLibrary = 2;
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
                case exit:
                    closeApp();
                    break;
                case insertBook:
                    insertBookToLibrary();
                    break;
                case printBooksFromLibrary:
                    printAllBooksFromLibrary();
                    break;
                default:
                    System.out.println("The option has not been chosen correctly.");
            }
        } while (userChoice != exit);
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

    private void displayUserOptions() {
        System.out.println("Choose option:");
        System.out.println("0 - Exit.");
        System.out.println("1 - Add a new book.");
        System.out.println("2 - Display available books.");
    }
}
