import java.util.Scanner;

public class HarmonikSayilar {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        double total = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            total += (1D / i);
        }
        System.out.println("Total: " + total);

        input.close();
    }
}
