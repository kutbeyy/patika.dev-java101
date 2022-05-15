import java.util.Scanner;

public class TersUcgenYapimi {
    private static final Scanner scanner = new Scanner(System.in);
    private static int n;

    public static void main(String[] args) {
        System.out.print("Enter Layer Amount: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= ((2 * i) - 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
