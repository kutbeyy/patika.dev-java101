import java.util.Scanner;

public class UsluSayilarGeneric {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double base, result = 1;
        int exponent;

        System.out.print("Enter base number: ");
        base = scanner.nextDouble();


        System.out.print("Enter exponent number: ");
        exponent = scanner.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        if (base == 0 && exponent == 0) {
            System.out.println("Undefinable");
        } else if (base != 0 ||  exponent >= 0) {
            System.out.println(result);
        }



        scanner.close();
    }
}
