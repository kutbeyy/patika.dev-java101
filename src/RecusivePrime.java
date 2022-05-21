import java.util.Scanner;

public class RecusivePrime {
    private static final Scanner scan = new Scanner(System.in);

    public static boolean isPrime(int num, int div) {
        if (num == 0 || num == 1) return false;
        if (div == 1) return true;
        if (num % div == 0) return false;
        return isPrime(num, div - 1);

    }


    public static void main(String[] args) {
        System.out.print("Sayı Giriniz: ");
        int num = scan.nextInt();
        int div = (int) Math.sqrt(num);

        if (isPrime(num, div)) System.out.println(num + " sayısı ASALDIR !");
        else System.out.println(num + " sayısı ASAL değildir !");


    }
}
