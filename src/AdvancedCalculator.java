import java.util.Scanner;

public class AdvancedCalculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        double res = 0;
        if (num2 == 0) {
            System.out.println("\ndivisor number cannot be zero");
        } else {
            res = num1 / num2;
        }
        return res;
    }

    public static double pow(double base, double exp) {
        double res = 1;
        for (int i = 1; i <= exp; i++) {
            res *= base;
        }
        return res;
    }

    public static double fact(double num1) {
        double res = 1;
        for (int i = 1; i <= num1; i++) {
            res *= i;
        }
        return res;
    }

    public static double mod(double num1, double num2) {
        double res = 0;
        if (num2 == 0) {
            System.out.println("\ndivisor number cannot be zero");
        } else {
            res = num1 % num2;
        }
        return res;
    }

    public static void showMenu() {
        System.out.print("""
                1- Toplama
                2- Çıkarma
                3- Çarpma
                4- Bölme
                5- Üslü Sayı
                6- Faktoriyel
                7- Mod
                0- Çıkış
                """);
    }

    public static int menuSelect() {
        showMenu();
        System.out.print("İşlem Seçiniz:");
        return scanner.nextInt();
    }


    public static Double wantNumber() {
        System.out.print("Enter a num:");
        return scanner.nextDouble();
    }

    public static void showResult(String result) {
        System.out.println("\nSonuç: " + result + "\n");
    }

    public static void main(String[] args) {
        infinitloop:
        while (true) {
            double result;
            int option = menuSelect();
            switch (option) {
                case 0:
                    break infinitloop;
                case 1:
                    result = sum(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 2:
                    result = minus(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 3:
                    result = product(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 4:
                    result = divide(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 5:
                    result = pow(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 6:
                    result = fact(wantNumber());
                    showResult(String.valueOf(result));
                    break;
                case 7:
                    result = mod(wantNumber(), wantNumber());
                    showResult(String.valueOf(result));
                    break;
            }
        }
    }
}
