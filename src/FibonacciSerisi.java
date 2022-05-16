import java.util.Scanner;

public class FibonacciSerisi {
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Enter Length of Fibonacci Sequence: ");
        int length = sc.nextInt();
        long a = 0, c = 0;
        long b = 1;
        for (int i = 1; i <= length; i++) {
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }


    }
}
