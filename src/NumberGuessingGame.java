import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private final static Scanner scanner = new Scanner(System.in);

    public static void printRemainingRight(int right, int incorrect) {
        System.out.println("Kalan Hak: " + (right - incorrect));
    }

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(100);

        int incorrect = 0, right = 5;
        int[] incorrectGuesses = new int[right];
        int guess;
        boolean isWin = false;
        boolean isFailedAttempt = false;

        System.out.println(randomNum);
        System.out.println("*".repeat(10));
        while (incorrect < right) {
            System.out.print("Tahmin(from 0 to 100):");
            guess = scanner.nextInt();
            if (guess < 0 || guess > 100) {
                System.out.println("Sayı 0-100 arasında olmalıdır!\nBir defa hatalı deneme hakkınızı kullandınız!");
                if (isFailedAttempt) {
                    incorrect++;
                    printRemainingRight(right, incorrect);
                } else {
                    isFailedAttempt = true;
                    printRemainingRight(right, incorrect);
                }
                continue;
            }
            if (guess == randomNum) {
                isWin = true;
                System.out.println("Tebrikler Kazandınız!");
                break;
            } else {
                if (guess > randomNum) {
                    System.out.println("Tahminin biraz büyük!");
                } else {
                    System.out.println("Tahminin biraz küçük!");
                }
                incorrectGuesses[incorrect++] = guess;
                printRemainingRight(right, incorrect);
            }

        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.print("Yanlış tahminler: ");
            System.out.println(Arrays.toString(incorrectGuesses));
        }

    }
}
