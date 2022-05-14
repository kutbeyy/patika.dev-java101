import java.util.Scanner;

public class GirilenSayilardanMinVeMaxDegerleriBul {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = 0, num2 = 0, temp = 0, max = 0, min = 0;
        String input = "q";
        int counter = 1, qNum = 1;


        while (true) {
            System.out.print("1-Enter " + counter + ".number (For Quit-q): ");
            input = scanner.nextLine();
            if (input.toLowerCase().equals("q")) {
                break;
            } else {
                temp = Double.parseDouble(input);
                if (counter == 1) {
                    max = temp;
                    min = temp;
                }
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }
            counter++;
        }

        System.out.println("Max Num: " + max);
        System.out.println("Min Num: " + min);
    }
}
