package exceptions;

public class NumberLessThanZeroException extends RuntimeException {
    // Se estendo RuntimeException sto creando una UNCHECKED EXCEPTION
    public NumberLessThanZeroException(double number) {
        super("Il numero inserito: " + number + " è minore di zero!");
    }
}
