import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
     /*   Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
        float airHeat;

        System.out.print("Hava Sıcaklığını Giriniz:");
        airHeat = new Scanner(System.in).nextFloat();


        if (airHeat <= 5) {
            System.out.println("Kayak Yapılabilir!");
        } else if (airHeat > 5 && airHeat <= 25) {
            if (airHeat <= 15) {
                System.out.println("Sinemaya Gidilebilir!");
            }
            if (airHeat >= 10 && airHeat < 25) {
                System.out.println("Pikniğe Gidilebilir!");

            }
        } else {
            System.out.println("Yüzmeye Gidilebilir!");
        }


    }
}
