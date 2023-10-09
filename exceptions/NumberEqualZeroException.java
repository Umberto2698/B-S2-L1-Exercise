package exceptions;

public class NumberEqualZeroException extends RuntimeException {
    // Se estendo RuntimeException sto creando una UNCHECKED EXCEPTION
    public NumberEqualZeroException(double number) {
        super("Non puoi aver effettuato un viaggio in macchina utilizzando " + (int) number + " litri.");
    }
}