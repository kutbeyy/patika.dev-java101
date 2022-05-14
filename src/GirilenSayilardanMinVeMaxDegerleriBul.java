import java.util.Scanner;

public class GirilenSayilardanMinVeMaxDegerleriBul {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double num1 = 0, num2 = 0, temp = 0, max = 0, min = 0;
        String input = "q";
        int counter = 1, qNum = 1;


        while (true) {
            System.out.print("1-Enter " + qNum + ".number (For Quit-q): ");
            input = scanner.nextLine();
            if (input.toLowerCase().equals("q")) {
                break;
            } else {
                if (counter == 1) {
                    num1 = Double.parseDouble(input);
                }
                if (counter == 2) {
                    num2 = Double.parseDouble(input);
                }
                if (counter == 3) {
                    if (num1 >= num2) {
                        max = num1;
                        min = num2;
                    }
                    max = num2;
                    min = num1;
                    counter++;
                }
                temp = Double.parseDouble(input);
                if (counter > 3) {
                    if (temp >= max) {
                        max = temp;
                    } else {
                        if (temp <= min) {
                            min = temp;
                        }
                    }
                }
            }
            counter++;
            qNum++;
        }

        System.out.println("Max Num: " + max);
        System.out.println("Min Num: " + min);
    }
}
