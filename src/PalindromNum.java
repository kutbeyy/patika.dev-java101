import java.util.Scanner;

public class PalindromNum {
    private static final Scanner sc = new Scanner(System.in);

    public static boolean isPalindrom(int num) {
        int temp = num;
        int lastDigit, reverseNum = 0;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            temp /= 10;
        }
        return num == reverseNum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrom(num)) System.out.println(num + " is palindrom!");
        else System.out.println(num + " is not palindrom!");


    }
}
