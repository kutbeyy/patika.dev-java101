import java.util.Scanner;

public class UcakBiletiFiyatiHesapla {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double totalDistance, lastPrice = 0, perKMPrice = 0.10, discountAmount = 0, temp = 0;
        float lt_12_age = 0.5F, range_12_24_age = 0.9F, gt_65_age = 0.7F, if_tripType2Discount = 0.8F; // discount rates
        byte age, tripType;

        System.out.print("Yolculuk Mesafesi: ");
        totalDistance = input.nextDouble();


        if (totalDistance >= 0) {
            System.out.print("Yaşınız:");
            age = input.nextByte();
            if (age >= 0) {
                System.out.print("1-Tek Yön 2-Gidiş Dönüş (1,2) :");
                tripType = input.nextByte();
                if (tripType == 1 || tripType == 2) {
                    lastPrice = perKMPrice * totalDistance; // normal price
                    temp = lastPrice;
                    if (tripType != 1) {
                        lastPrice *= if_tripType2Discount;
                        discountAmount = (temp - lastPrice);
                    }
                    if (age <= 12) {
                        lastPrice *= lt_12_age;
                        discountAmount = (temp - lastPrice);
                    } else if (age <= 24) {
                        lastPrice *= range_12_24_age;
                        discountAmount = (temp - lastPrice);
                    } else if (age >= 65) {
                        lastPrice *= gt_65_age;
                        discountAmount = (temp - lastPrice);
                    }
                } else {
                    System.out.println("Yolculuk Tipi hatalı Girildi!");
                }
            } else {
                System.out.println("Yaş hatalı Girildi!");
            }
        } else {
            System.out.println("Mesafe Hatalı Girildi!");
        }

        System.out.println("İndirimsiz Normal Fiyat:" + temp);
        System.out.println("İndirim Tutarı:" + discountAmount);
        System.out.println("İndirim Dahil Fiyat:" + lastPrice);

        input.close();
    }
}
