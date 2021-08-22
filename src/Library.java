public class Library {
    // This class will store information about books according to the Book template.
    public static void main(String[] args) {
        final String appName = "Library v0.2";

        Book book_1 = new Book();
        book_1.title = "";
        book_1.author = "";
        book_1.publishDate = 0;
        book_1.pagesNumber = 0;
        book_1.publisher = "";
        book_1.isbn = "";

        System.out.println(appName);
        System.out.println("Books available in the Library:");
        System.out.println(book_1.title);
        System.out.println(book_1.author);
        System.out.println(book_1.publishDate);
        System.out.println(book_1.pagesNumber);
        System.out.println(book_1.isbn);
    }
}
