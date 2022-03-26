package sk.stuba.fei.uim.oop.zvierata;

public class NotMackaException extends Exception{
    public NotMackaException() {
    }

    public NotMackaException(String message) {
        super(message);
    }

    public NotMackaException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotMackaException(Throwable cause) {
        super(cause);
    }
}
