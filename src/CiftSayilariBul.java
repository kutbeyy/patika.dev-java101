import java.util.Scanner;

public class CiftSayilariBul {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Number:");
        int inputNum, total = 0, lenght = 0;
        double avarage;

        inputNum = scanner.nextInt();
     /*   for (int i = 0; i < inputNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/


      /*  Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan
        programı yazınız*/

        for (int i = 0; i < inputNum; i++) {

            if ((i % 12 == 0)) {

                total += i;
                lenght++;
                System.out.print(i + ",");
            }

        }
        System.out.println();
        avarage = (total / lenght);
        System.out.println("Ortalama:" + avarage);

    }
}
