import java.util.Scanner;

public class ManavKasaProgrami {
   /* Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL*/

    public static void main(String[] args) {
        float pearPrice = 2.14f, applePrice = 3.67f, tomatoPrice = 1.11f, bananaPrice = 0.95f, eggplantPrice = 5f, totalPrice = 0f;
        float pearAmount, appleAmount, tomatoAmount, bananaAmount, eggplantAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut ?:");
        pearAmount = input.nextFloat();
        totalPrice += (pearAmount * pearPrice);

        System.out.print("Kaç Kilo Elma ?:");
        appleAmount = input.nextFloat();
        totalPrice += (appleAmount * applePrice);


        System.out.print("Kaç Kilo Domates ?:");
        tomatoAmount = input.nextFloat();
        totalPrice += (tomatoAmount * tomatoPrice);


        System.out.print("Kaç Kilo Muz ?:");
        bananaAmount = input.nextFloat();
        totalPrice += (bananaAmount * bananaPrice);


        System.out.print("Kaç Kilo Patlıcan ?:");
        eggplantAmount = input.nextFloat();
        totalPrice += (eggplantAmount * eggplantPrice);

        System.out.println("Toplam Ödenecek Tutar:" + totalPrice);

    }

}
