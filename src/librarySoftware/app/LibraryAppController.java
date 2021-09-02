package librarySoftware.app;

import librarySoftware.exception.NoSuchOptionException;
import librarySoftware.io.ConsolePrinter;
import librarySoftware.io.DataInput;
import librarySoftware.model.Book;
import librarySoftware.model.LibraryRepository;
import librarySoftware.model.Magazine;
import librarySoftware.model.PublicationModel;

import java.util.InputMismatchException;

class LibraryAppController {
    /*
    Class which connects all functionality of the entire Library software.
     */

    private ConsolePrinter printer = new ConsolePrinter();
    // create object class's field to store Books in the library
    private DataInput dataInput = new DataInput(printer); // inject dependency to the DataInput
    // create object class's field to read in data from the users
    private LibraryRepository libraryRepository = new LibraryRepository();

    // display functionality of the Library-Software
    public void mainLibraryController() {
        Option userChoice;
        do {
            displayUserOptions();

            // convert value from the user to value of the Option enum type
            userChoice = getUserChoice();

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
                    printer.printLine("The option has not been chosen correctly.");
            }
        } while (userChoice != Option.EXIT);
    }

    private void closeApp() {
        printer.printLine("Closing app...");
        dataInput.closeScanner();
    }

    private void insertBookToLibrary() {
        try {
            Book book = dataInput.readAndCreateBookObject();
            libraryRepository.addBookIntoLibrary(book);
        } catch (InputMismatchException err) {
            printer.printLine("Unable to add a new Book into the library due to incorrect data inputs.");
        } catch (ArrayIndexOutOfBoundsException err) {
            printer.printLine("The limit of the library capacity has been gained. - Unable to add a new Book.");
        }
    }

    private void printAllBooksFromLibrary() {
        PublicationModel[] allPublications = libraryRepository.getPublicationsInLibraryArray();
        printer.printBooksFromLibrary(allPublications);
    }

    private void insertMagazineToLibrary() {
        try {
            Magazine magazine = dataInput.readAndCreateMagazineObject();
            libraryRepository.addMagazineIntoLibrary(magazine);
        } catch (InputMismatchException err) {
            printer.printLine("Unable to add a new Book into the library due to incorrect data inputs.");
        } catch (ArrayIndexOutOfBoundsException err) {
            printer.printLine("The limit of the library capacity has been gained. - Unable to add a new Book.");
        }
    }

    private void printAllMagazinesFromLibrary() {
        PublicationModel[] allPublications = libraryRepository.getPublicationsInLibraryArray();
        printer.printMagazinesFromLibrary(allPublications);
    }

    private void displayUserOptions() {
        printer.printLine("Choose option:");
        // take all options from the Option enum type
        for (Option value : Option.values()) {
            // in order to use printLine() method, call toString() method on the object
            printer.printLine(value.toString());
        }
    }

    private Option getUserChoice() {
        Option option = null;
        while (true) {
            try {
                option = Option.createFromInt(dataInput.inputInt());
                break;
            } catch (NoSuchOptionException err) {
                printer.printLine(err.getMessage());
            } catch (InputMismatchException err) {
                printer.printLine("The entered value is not Integer, try again.");
            }
        }
        return option;
    }
}
