import java.util.Scanner;

public class ArtikYilHesaplama {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int year;
        byte divisionByFour;

        System.out.print("Enter the Year:");
        year = input.nextInt();

        divisionByFour = (byte) (year % 4 == 0 ? 1 : 0);

        switch (divisionByFour) {
            case 0:
                System.out.println(year + " is not a leap year!");
                break;
            case 1:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year!");
                    } else {
                        System.out.println(year + " is not a leap year!");
                    }
                } else {
                    System.out.println(year + " is a leap year!");
                }
                break;
        }


    }
}
