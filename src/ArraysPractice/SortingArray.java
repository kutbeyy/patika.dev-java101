package ArraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter array lenght:");
        int arrLen = scn.nextInt();
        double[] arr = new double[arrLen];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element:");
            arr[i] = scn.nextDouble();
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        scn.close();
    }


}
