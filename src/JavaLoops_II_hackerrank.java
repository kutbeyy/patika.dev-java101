import java.util.*;
import java.io.*;

public class JavaLoops_II_hackerrank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     /*   int n = 10;
        int a = 0;
        int b = 2;
        int total = a;
        int part1 = 0;
        for (int i = 0; i < n; i++) {
            total += (int) (Math.pow(2, i) * b);
            System.out.print(total + " ");
        }*/


        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = a;
            for (int k = 0; k < n; k++) {
                total += (int) (Math.pow(2, k) * b);
                System.out.print(total + " ");
            }
            System.out.println();
        }
        in.close();

    }
}
