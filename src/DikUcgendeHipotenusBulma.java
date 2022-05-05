import java.util.Scanner;

public class DikUcgendeHipotenusBulma {
    public static void main(String[] args) {


        /*Üçgen Eşitsizliği Teoremi
         * kenar1+kenar2 > kenar3
         * kenar1+kenar3 > kenar2
         * kenar1+kenar3 > kenar2
         *
         * Üsteki koşul ve eşitsizlikleri sağlayan rakamlar ile ancak gerçek bir üçgen oluşturulabir        * */


      /* SORU 1

        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        */


       /* double kenar1, kenar2, kenar3;
        boolean durum1, durum2, durum3;
        String ucgen_mi;

        Scanner kenar = new Scanner(System.in);

        System.out.print("Kenar 1:");
        kenar1 = kenar.nextDouble();

        System.out.print("Kenar 2:");
        kenar2 = kenar.nextDouble();

        kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        // Eşitsilik Teoremi
        durum1 = (kenar1 + kenar2) > kenar3;
        durum2 = (kenar1 + kenar3) > kenar2;
        durum3 = (kenar2 + kenar3) > kenar1;
        ucgen_mi = durum1 && durum2 && durum3 ? "Bu bir gerçek üçgen!" : "Bu bir gerçek üçgen değil!";

        System.out.println(ucgen_mi);
        System.out.println("Hipotenüs Kenar Uzunluğu:" + kenar3);*/




      /*  Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

                𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

        double kenar4, kenar5, kenar6, cevre, alan, u;
        boolean durum4, durum5, durum6;
        String ucgen_mi1;

        Scanner kenarx = new Scanner(System.in);

        System.out.print("Kenar 1:");
        kenar4 = kenarx.nextDouble();

        System.out.print("Kenar 2:");
        kenar5 = kenarx.nextDouble();

        System.out.print("Kenar 3:");
        kenar6 = kenarx.nextDouble();

        // Eşitsilik Teoremi
        durum4 = (kenar4 + kenar5) > kenar6;
        durum5 = (kenar4 + kenar6) > kenar5;
        durum6 = (kenar5 + kenar6) > kenar4;
        ucgen_mi1 = durum4 && durum5 && durum6 ? "Bu bir gerçek üçgen!" : "Bu bir gerçek üçgen değil!";

        cevre = kenar4 + kenar5 + kenar6;
        System.out.println(ucgen_mi1);
        System.out.println("Üçgenin Çevresi:" + cevre);

        u = cevre / 2;
        alan = Math.sqrt((u) * (u - kenar4) * (u - kenar5) * (u - kenar6));
        System.out.println("Üçgenin Alanı:" + alan);

    }
}
