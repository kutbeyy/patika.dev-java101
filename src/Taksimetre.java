import java.util.Scanner;

public class Taksimetre {
   /* Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/


    public static void main(String[] args) {
        double birimUcret = 2.20D, mesafe, acilisUcreti = 10D, toplamUcret;

        System.out.print("Mesafe Giriniz (KM):");
        mesafe = new Scanner(System.in).nextDouble();

        toplamUcret = birimUcret * mesafe;
        toplamUcret += acilisUcreti;
        toplamUcret = toplamUcret <= 20 ? 20 : toplamUcret;

        System.out.println("Toplam Tutar:" + toplamUcret + " TL");


    }
}
