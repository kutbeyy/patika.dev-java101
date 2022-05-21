import java.util.Scanner;

public class RecusiveDesing {
    private static final Scanner scan = new Scanner(System.in);

    public static void pattern(int num, int value, int temp) {
        System.out.print(num + " ");
        if (num <= 0) {
            value = -1 * value;
        }
        if (num == temp && value <= 0) {
            return;
        }
        pattern(num - value, value, temp);


    }

    public static void main(String[] args) {
        System.out.print("N sayısı: ");
        int num = scan.nextInt();

        System.out.print("Azalış deseni: ");
        int value = scan.nextInt();


        pattern(num, value, num);


    }
}
