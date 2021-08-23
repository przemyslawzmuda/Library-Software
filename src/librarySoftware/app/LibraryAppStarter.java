package librarySoftware.app;

import librarySoftware.io.DataInput;
import librarySoftware.model.Book;

public class LibraryAppStarter {
    public static void main(String[] args) {
        final String appName = "Library v0.9";
        System.out.println(appName);
        LibraryAppController libraryAppController = new LibraryAppController();
        libraryAppController.mainLibraryController();
    }
}
