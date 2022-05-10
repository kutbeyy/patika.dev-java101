import java.util.Scanner;

public class TekSayilarinToplaminiBul {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

   /*     int inputNum, total = 0;
        StringBuilder exp = new StringBuilder("");

        do {
            System.out.print("Enter an Number:");
            inputNum = input.nextInt();
            if (inputNum % 2 == 1) {
                total += inputNum;
                exp.append(inputNum).append(" +");
            }

        } while (inputNum >= 0);

        exp = new StringBuilder(exp.substring(0, exp.length() - 1) + ": " + total);
        System.out.println(exp);*/


     /*   Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
        değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/


        int inputNum, total = 0;
        StringBuilder exp = new StringBuilder("");

        do {
            System.out.print("Enter an Number:");
            inputNum = input.nextInt();
            if (inputNum % 4 == 0) {
                total += inputNum;
                exp.append(inputNum).append(" +");
            }

        } while (inputNum % 2 == 0);

        exp = new StringBuilder(exp.substring(0, exp.length() - 1) + ": " + total);
        System.out.println(exp);

    }
}
