import java.util.Scanner;

public class CinZodyagiHesaplama {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int birtYear = 0;
        String ChineseZodiac = null;

        System.out.print("Doğum Yılınızı Giriniz:");
        birtYear = input.nextInt();

        byte status = (byte) (birtYear % 12);

        switch (status) {
            case 0 -> ChineseZodiac = "Maymun";
            case 1 -> ChineseZodiac = "Horoz";
            case 3 -> ChineseZodiac = "Domuz";
            case 4 -> ChineseZodiac = "Fare";
            case 5 -> ChineseZodiac = "Öküz";
            case 6 -> ChineseZodiac = "Kaplan";
            case 7 -> ChineseZodiac = "Tavşan";
            case 8 -> ChineseZodiac = "Ejderha";
            case 9 -> ChineseZodiac = "Yılan";
            case 10 -> ChineseZodiac = "At";
            case 11 -> ChineseZodiac = "Koyun";
            default -> System.out.println("Hatalı Veri Girildi!");
        }

       
        System.out.println("Çin Zodyağı Burcunuz : " + ChineseZodiac);

    }
}
