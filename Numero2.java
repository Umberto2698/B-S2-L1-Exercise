import exceptions.NumberEqualZeroException;
import exceptions.NumberLessThanZeroException;

import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        try {
            System.out.println("Inserisci i km percorsi.");
            double km = Double.parseDouble(input.nextLine());
            if (km < 0) throw new NumberLessThanZeroException(km);
            System.out.println("Inserisci i litri utilizzati.");
            double litri = Double.parseDouble(input.nextLine());
            if (litri < 0) throw new NumberLessThanZeroException(litri);
            if (litri == 0) throw new NumberEqualZeroException(litri);
            double kmSuLitri = km / litri;
            System.out.println(kmSuLitri);
        } catch (NumberFormatException ex) {
            System.err.println("Hai inserito un valore non numerico");
        } finally {
            input.close();
        }
    }
}
