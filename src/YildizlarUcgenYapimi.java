import java.util.Scanner;

public class YildizlarUcgenYapimi {
    private static final Scanner ipt = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int n = ipt.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= ((2 * i) - 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= ((2 * i) - 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        ipt.close();
    }
}
