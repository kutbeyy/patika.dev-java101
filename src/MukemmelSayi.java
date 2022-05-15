import java.util.Scanner;

public class MukemmelSayi {
/*    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları
    (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is a Perfect Number!");
        } else {
            System.out.println(number + " is not a Perfect Number!");
        }
    }
}
