package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;

public class LibraryAppStarter {
    private static final String APP_NAME = "Library v1.1";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryAppController libraryAppController = new LibraryAppController();
        libraryAppController.mainLibraryController();
    }
}
