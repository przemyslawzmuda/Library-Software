package librarySoftware.io;

import librarySoftware.model.Book;
import librarySoftware.model.Magazine;
import java.util.Scanner;

public class DataInput {
    /*
    This class will allow to create new objects according to the data entered by a user.
    It should be only one place to perform interaction with the users.
     */

    private Scanner input = new Scanner(System.in); // create an input object to read data from a user as a class's field

    // create a small number of objects as you can
    private ConsolePrinter printer; // don't create the new object of the ConsolePrinter
    // use dependency injection - the object DataInput depends on the ConsolePrinterObject

    // pass injection through the constructor
    public DataInput(ConsolePrinter printer) {
        this.printer = printer;
    }

    public int inputInt() {
        try { // not Int? - throw InputMismatchException, I can catch that in the another place
            return input.nextInt();
        } finally {
            input.nextLine(); // consume a whitespace from an enter key always
        }
    }

    /*
    Use ctrl (cmd) +shift+f to find a text content
    Use cmd + r to change the text content
     */

    public Book readAndCreateBookObject() {
        printer.printLine("Title:");
        String titleBook = input.nextLine();
        printer.printLine("Author:");
        String authorBook = input.nextLine();
        printer.printLine("Publish year:");
        int publishYearBook = inputInt();
        printer.printLine("Pages number:");
        int pagesNumberBook = inputInt();
        printer.printLine("Publisher:");
        String publisherBook = input.nextLine();
        printer.printLine("ISBN:");
        String isbnBook = input.nextLine();
        return new Book(titleBook, authorBook, publisherBook, publishYearBook, pagesNumberBook, isbnBook);
    }

    public Magazine readAndCreateMagazineObject() {
        printer.printLine("Title:");
        String titleMagazine = input.nextLine();
        printer.printLine("Publisher:");
        String publisher = input.nextLine();
        printer.printLine("Publish Year:");
        int year = inputInt();
        printer.printLine("Publish month:");
        int month = inputInt();
        printer.printLine("Publish day:");
        int day = inputInt();
        printer.printLine("Magazine language:");
        String language = input.nextLine();
        return new Magazine(titleMagazine, publisher, year, month, day, language);
    }

    public void closeScanner() {
        input.close();
    }
}
