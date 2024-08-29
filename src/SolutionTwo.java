import java.util.Random;
import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        // LÖSNING 2: lägg till svårighetsgrad
        //låt användaren välja mellan tre svårighetsgrader:
        //Lätt: 1–50
        //Medel: 1–100
        //Svår: 1–200

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Välj svårighetsgrad:");
        System.out.println("1. Lätt (1-50)");
        System.out.println("2. Medel (1-100)");
        System.out.println("3. Svår (1-200)");
        System.out.print("Ange ditt val: ");
        int mode = scanner.nextInt();

        int maxNumber = 100;
        // standard max nr

        if (mode == 1) {
            maxNumber = 50;
        } else if (mode == 2) {
            maxNumber = 100;
        } else if (mode == 3) {
            maxNumber = 200;
        } else {
            System.out.println("Ogiltigt val. Standardinställning (1-100) används.");
        }

        int correctNumber = random.nextInt(maxNumber) + 1;
        int guess = 0;
        int tries = 0;

        System.out.println("Jag har valt ett nummer mellan 1 och " + maxNumber + ". Gissa vilket!");

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
        System.out.println("Tack för att du spelade Gissa Numret!");
    }
}
