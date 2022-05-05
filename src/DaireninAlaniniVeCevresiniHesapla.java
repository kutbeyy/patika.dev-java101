import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesapla {


    public static void main(String[] args) {

    /*    Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

                Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;*/

        double circleArea, circlePerimeter, circleRadius;

        System.out.print("Dairenin Yarıçapını Giriniz:");
        circleRadius = new Scanner(System.in).nextDouble();

        circlePerimeter = 2 * Math.PI * circleRadius;
        circleArea = Math.PI * (circleRadius * circleRadius);

        System.out.println("Dairenin Alanı:" + circleArea);
        System.out.println("Dairenin Çevresi:" + circlePerimeter);






   /*     Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360

                */

        double circleSliceArea, circleRadius1, circleAngle;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz:");
        circleRadius1 = input.nextDouble();

        System.out.print("Alanı Bulunucak Dilimin Açısını Giriniz:");
        circleAngle = input.nextDouble();


        circleSliceArea = (Math.PI * Math.pow(circleRadius1, 2) * circleAngle) / 360D;

        System.out.println("Daire Diliminin Alanı:" + circleSliceArea);
    }
}
