import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double num1, num2;
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçim:");
        selection = input.nextInt();

        System.out.print("Sayı 1:");
        num1 = input.nextDouble();

        System.out.print("Sayı 2:");
        num2 = input.nextDouble();

        switch (selection) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı Veri Girildi veya Yanlış Seçim Yapıldı!!");
        }


    }
}
