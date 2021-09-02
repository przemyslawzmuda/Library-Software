package librarySoftware.exception;

public class NoSuchOptionException extends Exception {
    // define as a controlled exception (inherited from Exception class) - extortion to tackle

    public NoSuchOptionException(String message) {
        super(message);
    }
}
