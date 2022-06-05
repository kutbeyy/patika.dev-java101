package ArraysPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFrequency {

    public static int count(int[] arr, int value) {
        int counter = 0;
        for (int elem : arr) {
            if (elem == value) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int temp = arr[0];


        for (int element : arr) {
            if (element != temp || arr[0] == temp) {
                temp = element;
                System.out.println(element + " >> " + count(arr, temp) + "  times in array");
            }
        }


    }
}
