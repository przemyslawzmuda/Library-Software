package librarySoftware.model;

public class Book extends PublicationModel {
    // This class is a template for creating new book in the future.

    // class's fields
    private String author;
    private int pagesNumber;
    private String isbn;

    /*
    Constructor allows me to create new instances of the Book type.
    If there are more than one constructors in the same class - overloaded constructors.
    Overloaded constructors (assumptions):
    - different numbers of the parameters;
    - in the case fo the same number of the parameters, the types should be different.
    A keyword 'this' allows me to refer to the class's components.
     */

    // constructors
    // overloaded constructor
    public Book(String title, String author, int publishDate, int pagesNumber, String publisher, String isbn) {
        this(title, author, publishDate, pagesNumber, publisher);
        this.isbn = isbn; // class's field = parameter
    }

    // overloaded constructor
    public Book(String title, String author, int publishDate, int pagesNumber, String publisher) {
        this(title, author, publishDate, pagesNumber);
        this.setPublisher(publisher);
    }

    // overloaded constructor
    public Book(String title, String author, int publishDate, int pagesNumber) {
        this(title, author, publishDate);
        this.pagesNumber = pagesNumber;
    }

    // Default constructor - the information below are mandatory
    public Book(String title, String author, int publishDate) {
        this.setTitle(title);
        this.author = author;
        this.setPublishYear(publishDate);
    }

    // access specifications
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // methods
    public void printBookInformations() {
        String information = getTitle() + "; " + author + "; " + getPublishYear();
        if (pagesNumber != 0)
            information += "; " + pagesNumber;
        if (getPublisher() != null)
            information += "; " + getPublisher();
        if (isbn != null)
            information += "; " + isbn;
        System.out.println(information);
    }
}
