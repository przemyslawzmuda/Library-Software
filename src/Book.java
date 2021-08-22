class Book {
    // This class is a template for creating new book in the future.
    String title;
    String author;
    int publishDate;
    int pagesNumber;
    String publisher;
    String isbn;

    // Constructor allows me to create new instances of the Book type.
    Book(String title, String author, int publishDate, int pagesNumber, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.pagesNumber = pagesNumber;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    void printBookInformation() {
        String information = title + "; " + author + "; " + publishDate + "; " + pagesNumber
                + "; " + publisher + "; " + isbn + ".";
        System.out.println(information);
    }
}
