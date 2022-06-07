package ArraysPractice;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] matrisA = {
                {1, 2, 3},
                {4, 5, 6}
        };


        for (int[] e : transpoz(matrisA)) {
            for (int x : e) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public static int[][] transpoz(int[][] arr) {
        int[][] transpoz = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpoz[j][i] = arr[i][j];
            }
        }
        return transpoz;
    }
}
