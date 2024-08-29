import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // LÖSNING 1: begränsa antalet gissningar
        Random random = new Random();
        int correctNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int tries = 0;

        // lägg till variabel för max antal försök
        // final: nyckelordet final gör att variabeln inte kan ändras efter att den
        // har tilldelats ett värde. det gör MAX_TRIES till en konstant.

        // konstantens syfte: genom att använda en konstant kan vi enkelt ändra det
        // maximala antalet försök på ett ställe, utan att behöva leta efter och
        // ändra värdet på flera ställen i koden. det förbättrar läsbarheten
        // och underhållet av koden
        final int MAX_TRIES = 10;
        // finns framförallt två fördelar:
        //tydlighet: namnet MAX_TRIES gör det omedelbart tydligt vad värdet representerar.
        //underhåll: om vi vill ändra antalet tillåtna försök, görs det enkelt genom att
        // ändra värdet på denna enda plats.

        System.out.println("Välkommen till Gissa Numret!");
        System.out.println("Jag har valt ett nummer mellan 1 och 100.");
        System.out.println("Du har " + MAX_TRIES + " försök att gissa rätt!");

        // lagt till villkor för att kolla så att tries är mindre än max tries också
        while (guess != correctNumber && tries < MAX_TRIES) {
            System.out.print("Ange din gissning: ");
            guess = scanner.nextInt();
            tries++;


            if (guess < correctNumber) {
                System.out.println("För lågt! Försök igen.");
            } else if (guess > correctNumber) {
                System.out.println("För högt! Försök igen.");
            } else {
                System.out.println("Rätt! Du gissade numret på " + tries + " försök.");
            }
        }

        // om guess inte är lika med rätt nummer efter max försök skriv ut:
        if (guess != correctNumber) {
            System.out.println("Tyvärr, du har använt alla " + MAX_TRIES + " försök. Numret var " + correctNumber + ".");
        }

        System.out.println("Tack för att du spelade Gissa Numret!");
    }
}