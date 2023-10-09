import java.util.Arrays;
import java.util.Scanner;

public class Numero1 {
    public static void main(String[] args) {
        int[] randomNumber = new int[5];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(randomNumber));
        try (Scanner input = new Scanner(System.in)) {
            int newNumber;
            do {
                System.out.println("Inserisci un numero intero. Inserisci 0 per terminare il programma.");
                newNumber = Integer.parseInt(input.nextLine());
                if (newNumber == 0) {
                    input.close();
                } else {
                    System.out.println("Adesso inserisci un numero intero per indicarmi in quale posizione vuoi inserire " + newNumber + ".");
                    int position = Integer.parseInt(input.nextLine());
                    randomNumber[position] = newNumber;
                    System.out.println(Arrays.toString(randomNumber));
                }
            } while (newNumber != 0);
        } catch (NumberFormatException ex) {
            System.err.println("Hai inserito un valore non numerico");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("La posizione scelta è fuori scala");
        } catch (Exception ex) {
            System.err.println("Problema generico");
        }
    }
}
