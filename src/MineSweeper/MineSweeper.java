package MineSweeper;

import java.util.*;


public class MineSweeper {
    private static final Scanner scanner = new Scanner(System.in);
    private final int satirAdedi;
    private final int sutunAdedi;
    private final int mayinMiktari;
    public int[][] mayinKoor;

    private final String[][] mayinTarlasi;

    MineSweeper(int satirAdedi, int sutunAdedi) {
        this.satirAdedi = satirAdedi;
        this.sutunAdedi = sutunAdedi;
        this.mayinTarlasi = new String[satirAdedi][sutunAdedi];
        this.mayinMiktari = (satirAdedi * sutunAdedi) / 4;
        this.mayinKoor = this.mayinKordinatlari();
        this.mayinTarlasi();

    }

    private int[] mayinKoordinatiUret() {
        Random rnd = new Random();
        int x = rnd.nextInt(0, this.satirAdedi);
        int y = rnd.nextInt(0, this.sutunAdedi);
        return new int[]{x, y};

    }

    private int[][] mayinKordinatlari() {
        int[][] mayinKordinatlari = new int[this.mayinMiktari][];
        for (int i = 0; i < mayinKordinatlari.length; i++) {
            int[] x = this.mayinKoordinatiUret();
            if (!this.UniqeMayinKordinati(mayinKordinatlari, x)) mayinKordinatlari[i] = x;
            else i -= 1;
        }
        return mayinKordinatlari;
    }

    private boolean UniqeMayinKordinati(int[][] arr, int[] a) {
        for (int[] ints : arr) {
            if (Arrays.equals(ints, a)) return true;
        }
        return false;
    }

    private int girilenKonumunEtrafindakiToplamMayin(int x, int y) {
        int toplamMayin = 0;
        int[][] girilenKonumunEtrafi = {{x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1}, {x, y - 1}, {x, y + 1}, {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1},};

        for (int[] ints : girilenKonumunEtrafi) {
            if (this.control(ints)) {
                toplamMayin += 1;
            }
        }
        return toplamMayin;
    }

    private boolean control(int[] arr) {
        for (int[] ints : this.mayinKoor) {
            if (Arrays.equals(arr, ints)) {
                return true;
            }
        }
        return false;
    }

    private void mayinTarlasi() {
        for (int i = 0; i < this.mayinTarlasi.length; i++) {
            for (int j = 0; j < this.mayinTarlasi[0].length; j++) {
                this.mayinTarlasi[i][j] = " - ";
            }
        }
    }

    private void mayinTarlasiGoster() {
        for (String[] row : this.mayinTarlasi) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public void run() {
        int typ = (this.satirAdedi * this.sutunAdedi) - this.mayinMiktari;

        while (typ > 0) {
            this.mayinTarlasiGoster();
            System.out.print("Satır Num(0->):");
            int x = scanner.nextInt();
            System.out.print("Sütun Num(0->):");
            int y = scanner.nextInt();
            int[] kordinatlar = {x, y};
            if (x < 0 || y < 0 || x > this.satirAdedi - 1 || y > this.sutunAdedi - 1) {
                System.out.println("Hatalı Konum Girdiniz!");
                continue;

            }
            if (this.control(kordinatlar)) {
                System.out.println("Mayına Bastınız!");
                break;
            } else {
                this.mayinTarlasi[x][y] = " " + girilenKonumunEtrafindakiToplamMayin(x, y) + " ";
            }
            typ--;
            if (typ == 0) {
                System.out.println("*".repeat(5) + " Kazandınız! " + "*".repeat(5));
                this.mayinTarlasiGoster();
            }

        }
    }
}
