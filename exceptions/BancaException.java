package exceptions;

public class BancaException extends Exception {
    String message;

    public BancaException(String str) {
        super(str);
        this.message = str;
    }

    @Override
    public String toString() {
        return message;
    }
}
