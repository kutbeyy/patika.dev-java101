package ArraysPractice;

import java.util.Arrays;

public class DuplicatedNumbers {

    public static boolean isContains(int[] arr, int value) {
        // Bir array ve bir value alır value arrayde varsa true,yoksa false döner
        for (int j : arr) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }

    static int[] findDublicate(int[] arr) {
        int[] duplicateNumbs = new int[arr.length];
        int indis = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!isContains(duplicateNumbs, arr[j]) && (i != j) && (arr[i] == arr[j])) {
                    duplicateNumbs[indis++] = arr[i];
                    break;
                }
            }
        }
        return duplicateNumbs;
    }


    static int[] findDublicate(int[] arr, char evenOrOdd) {
        int[] duplicateEvenNumbs = new int[arr.length];
        int[] duplicateOddNumbs = new int[arr.length];
        int indis1 = 0;
        int indis2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (arr[i] % 2 == 0 && !isContains(duplicateEvenNumbs, arr[i])) {
                        duplicateEvenNumbs[indis1++] = arr[i];
                    }
                    if (arr[i] % 2 != 0 && !isContains(duplicateOddNumbs, arr[i])) {
                        duplicateOddNumbs[indis2++] = arr[i];
                    }
                }
            }
        }

        if (evenOrOdd == 'e' || evenOrOdd == 'E') {
            return duplicateEvenNumbs;
        }
        if (evenOrOdd == 'o' || evenOrOdd == 'O') {
            return duplicateOddNumbs;
        }
        return null;
    }


    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 3, 4, 5, 6, 21, 2, 1, 11, 22, 22, 3};

        System.out.println(Arrays.toString(findDublicate(arr)));
        System.out.println(Arrays.toString(findDublicate(arr, 'e')));
        System.out.println(Arrays.toString(findDublicate(arr, 'o')));
        System.out.println(Arrays.toString(findDublicate(arr, 'k')));

    }
}
