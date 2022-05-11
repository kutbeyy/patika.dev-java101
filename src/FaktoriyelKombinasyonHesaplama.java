import java.util.Scanner;

public class FaktoriyelKombinasyonHesaplama {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

 /*       int input, multiplication = 1;

        System.out.print("Enter a Number: ");
        input = scn.nextInt();

        for (int i = 1; i <= input; i++) {
            multiplication *= i;

        }
        System.out.println(input + " factoriyal = " + multiplication);*/


/*        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)*/


        int n, r;
        long multi = 1, tulti = 1;


        System.out.println("Calculate Combination >> C(n,r)");
        System.out.print("Enter n value:");
        n = scn.nextInt();
        System.out.println();
        System.out.print("Enter r value:");
        r = scn.nextInt();

        int start = Math.max(n - r, r) + 1;
        int end = Math.min(n - r, r);


        if (r <= 0) {
            System.out.println("C" + "(" + n + "," + r + ") : " + 1);
        } else {
            for (int i = start; i <= n; i++) {
                multi *= i;
            }
            for (int i = 1; i <= end; i++) {
                tulti *= i;
            }
            System.out.println("C" + "(" + n + "," + r + ") : " + (multi / tulti));
        }

    }
}
