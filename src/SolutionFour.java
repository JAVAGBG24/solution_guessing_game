import java.util.Random;
import java.util.Scanner;

public class SolutionFour {
    public static void main(String[] args) {
        // LÖSNING 4: Spara high score!
        // spara spelarens rekord mellan spelomgångar.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playagain = true;
        int bestResult = 0;
        // initierar bestResult till 0 från start
        // den här lösningen förutsätter att spelare kan spela igen om  man vill

        while (playagain) {
            int correctNumber = random.nextInt(100) + 1;
            int guess = 0;
            int tries = 0;

            System.out.println("Jag har valt ett nummer mellan 1 och 100. Gissa vilket!");

            while (guess != correctNumber) {
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

            // kontrollera och uppdatera bästa resultatet
            if (tries > bestResult) {
                // om tries är högre än bestResult (0 från start) sätts bestResult till samma värde som tries
                bestResult = tries;
                System.out.println("Grattis! Du har satt ett nytt rekord med " + tries + " försök!");
            } else {
                System.out.println("Ditt bästa resultat är fortfarande " + bestResult + " försök.");
            }

            System.out.print("Vill du spela igen? (ja/nej): ");
            String answer = scanner.next();
            playagain = answer.equalsIgnoreCase("ja");
        }

        System.out.println("Tack för att du spelade Gissa Numret!");
    }
}
