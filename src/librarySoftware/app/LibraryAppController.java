package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;
import librarySoftware.model.LibraryRepository;
import librarySoftware.model.Magazine;

class LibraryAppController {
    /*
    Class which connects all functionality of the entire Library software.
     */


    // create object class's field to store Books in the library
    private DataInput dataInput = new DataInput();
    // create object class's field to read in data from the users
    private LibraryRepository libraryRepository = new LibraryRepository();

    // display functionality of the Library-Software
    public void mainLibraryController() {
        Option userChoice;
        do {
            displayUserOptions();
            // convert value from the user to value of the Option enum type
            userChoice = Option.createFromInt(dataInput.inputInt());
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
        } while (userChoice != Option.EXIT);
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
        // take all options from the Option enum type
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }
}
