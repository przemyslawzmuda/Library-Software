public class Library {
    // This class will store information about books according to the Book template.
    public static void main(String[] args) {
        final String appName = "Library v0.3";

        System.out.println(appName);
        System.out.println("Books available in the Library:");
        Book book_1 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", 1997, 330,
                "Historia", "dbsjcbd2342");
        book_1.printBookInformation();

    }
}
