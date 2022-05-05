import java.util.Scanner;

public class KDVTutarıHesapla {
    public static void main(String[] args) {

   /*     KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)*/

        double price, priceWithKDV, KDVamount, KDVrate = 1.18f;

        Scanner priceInput = new Scanner(System.in);
        System.out.print("Fiyat Giriniz(KDV Hariç):");
        price = priceInput.nextFloat();

        priceWithKDV = price * KDVrate;
        KDVamount = priceWithKDV - price;
        System.out.println("KDV'li Fiyat:" + priceWithKDV + " KDV miktarı:" + KDVamount);

        // Ödev
       /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        double price1, price1WithKDV, KDVamount1, KDVrate1;
        boolean KDVstatus;
        
        Scanner price1Input = new Scanner(System.in);
        System.out.print("Fiyat Giriniz(KDV Hariç):");
        price1 = price1Input.nextDouble();

        KDVstatus = (price1 >= 0d) && (price1 < 1000d);
        KDVrate1 = KDVstatus ? 1.18d : 1.08d;

        price1WithKDV = price1 * KDVrate1;
        KDVamount1 = price1WithKDV - price1;

        System.out.println("KDV Oranı:" + KDVrate1);
        System.out.println("KDV'li Tutar:" + price1WithKDV);
        System.out.println("KDV Miktarı:" + KDVamount1);


    }
}
