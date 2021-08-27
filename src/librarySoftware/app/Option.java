package librarySoftware.app;

enum Option {
    // if no default constructor, pass the parameters
    EXIT(0, "Exit."),
    INSERT_BOOK(1, "Add a new magazine."),
    INSERT_MAGAZINE(2, "Add a new magazine."),
    PRINT_BOOKS_FROM_LIBRARY(3, "Display available books."),
    PRINT_MAGAZINES_FROM_LIBRARY(4, "Display available magazines.");

    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    // add getter in order to read the values of the value and description fields
    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    // override toString() method to display available options
    @Override
    public String toString() {
        return value + " - " + description;
    }

    // create a static method - no need to create a new object to call that method ex.: (Option.createFromInt())
    // convert value from the user to value of the Option enum type
    static Option createFromInt(int option) {
        return Option.values()[option]; // returns an array with the all values in the corresponding enum type
    }
}