class Book {
    // This class is a template for creating new book in the future.
    String title;
    String author;
    int publishDate;
    int pagesNumber;
    String publisher;
    String isbn;

    /*
    Constructor allows me to create new instances of the Book type.
    If there are more than one constructors in the same class - overloaded constructors.
    Overloaded constructors (assumptions):
    - different numbers of the parameters;
    - in the case fo the same number of the parameters, the types should be different.
    A keyword 'this' allows me to refer to the class's components.
     */

    // overloaded constructor
    public Book(String title, String author, int publishDate, int pagesNumber, String publisher, String isbn) {
        this(title, author, publishDate, pagesNumber, publisher);
        this.isbn = isbn; // class's field = parameter
    }

    // overloaded constructor
    Book(String title, String author, int publishDate, int pagesNumber, String publisher) {
        this(title, author, publishDate, pagesNumber);
        this.publisher = publisher;
    }

    // overloaded constructor
    public Book(String title, String author, int publishDate, int pagesNumber) {
        this(title, author, publishDate);
        this.pagesNumber = pagesNumber;
    }

    // Default constructor - the information below are mandatory
    public Book(String title, String author, int publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    void printBookInformations() {
        String information = title + "; " + author + "; " + publishDate + "; " + pagesNumber
                + "; " + publisher + "; " + isbn + ".";
        System.out.println(information);
    }
}
