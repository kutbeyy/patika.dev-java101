import java.util.Scanner;

public class UsluSayilar {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*System.out.print("Enter an Number:");
        int inputNum = scan.nextInt();

      /*  for (int i = 1; i < inputNum; i *= 2) {
            System.out.print(i + ",");
        }*/


        /*Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

    /*    for (int i = 1; i < inputNum; i *= 5) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 1; i < inputNum; i *= 4) {
            System.out.print(i + ",");
        }*/
        System.out.print("Enter an Number:");
        int input = scan.nextInt();
        boolean st = true;


        for (int i = 1, j = 1; i < input || j < input; i *= 4, j *= 5) {

            if (i < input) {
                System.out.print(i + ",");
            }
            if (j < input) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
