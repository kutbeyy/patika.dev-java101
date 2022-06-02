package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDegerBul {

    public static final Scanner scnan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i = 1; i < list.length; i++) { // for bu şekilde kullanmak daha iyi forEach kullanırsak ilk
            // elemana ekstra kendisi karşılaştırma yapmış oluruz
            if (list[i] > max) max = list[i];
            if (list[i] < min) min = list[i];
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);


        /*Ödev
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.*/

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Enter a number:");
        int input = scnan.nextInt();

        int[] copyArr = Arrays.copyOf(arr, arr.length); // orjinal arrayi bozmamak için kopyaladık.
        Arrays.sort(copyArr);
        System.out.println(Arrays.toString(copyArr));
        for (int i = 0; i < copyArr.length; i++) {
            if (copyArr[i] > input) {
                System.out.print("Girilen sayıdan küçük en yakın sayı :");
                System.out.println(copyArr[i]);

                System.out.print("Girilen sayıdan büyük en yakın sayı :");
                System.out.println(copyArr[i - 1]);
                break;
            }
        }


    }
}
