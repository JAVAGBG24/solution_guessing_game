import java.util.Random;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        // LÖSNING 3: Låt spelaren spela flera omgångar utan att starta om programmet.
        // fråga användaren efter varje omgång om de vill spela igen.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
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

            System.out.print("Vill du spela igen? (ja/nej): ");
            String answer = scanner.next();
            playAgain = answer.equalsIgnoreCase("ja");
        }
        System.out.println("Tack för att du spelade Gissa Numret!");
    }
}
