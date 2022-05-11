import java.util.Scanner;

public class ArmstrongSayilariBul {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int number, temp, lastDigit, total = 0, sumDigitsNumber = 0;


        System.out.print("Enter a number: ");
        number = temp = scan.nextInt(); // number sayısını temp değişkeninde yedekliyoruz

        int digitNumber = (int) (Math.floor(Math.log10(number)) + 1); // exponent(üs) > sayı kaç haneli

        for (int i = 1; i <= digitNumber; i++) {
            lastDigit = number % 10; // last digit || Sayının son hanesi
            sumDigitsNumber += lastDigit; // sum of the digits of a number. || bir sayının rakamları toplamı.
            total += (int) Math.pow(lastDigit, digitNumber);
            number /= 10; // sayıyı 10'a bölerek son haneyi buluyoruz
        }

        if (temp == total) {
            System.out.println("Number is Armstrong Number");
            System.out.println("Sayının rakamları toplamı: " + sumDigitsNumber);

        } else {
            System.out.println("Number isn't Armstrong Number");
            System.out.println("Sayının rakamları toplamı: " + sumDigitsNumber);
        }



        scan.close();
    }

}
