import java.util.Scanner;

public class RecusiveExponential {
    private static final Scanner sc = new Scanner(System.in);
    static int result = 1;

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter base num:");
        int base = sc.nextInt();
        System.out.print("Enter exp num:");
        int exp = sc.nextInt();

        int result = power(base, exp);
        System.out.println("Sonuç: " + result);

        sc.close();
    }
}
