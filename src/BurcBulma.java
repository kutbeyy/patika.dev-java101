import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        byte birthMonth, birthDay;
        String burc = null;
        boolean is31Months, is30Months, is29Feb, range1_30, range1_31, range1_29;


        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz?:");
        birthMonth = input.nextByte();
        System.out.print("Doğum gününüz?:");
        birthDay = input.nextByte();


        is30Months = (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 10);
        range1_30 = is30Months && (birthDay >= 1 && birthDay <= 30);

        is31Months = (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 11 || birthMonth == 12);
        range1_31 = is31Months && (birthDay >= 1 && birthDay <= 31);

        is29Feb = birthMonth == 2;
        range1_29 = is29Feb && (birthDay >= 1 && birthDay <= 29);

        if (birthMonth == 1) {
            if (birthDay <= 21) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (birthMonth == 2) {
            if (birthDay <= 19) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (birthMonth == 3) {
            if (birthDay <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (birthMonth == 4) {
            if (birthDay <= 20) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (birthMonth == 5) {
            if (birthDay <= 21) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (birthMonth == 6) {
            if (birthDay <= 22) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (birthMonth == 7) {
            if (birthDay <= 22) {
                burc = "İkizler";
            } else {
                burc = "Aslan";
            }
        } else if (birthMonth == 8) {
            if (birthDay <= 22) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (birthMonth == 9) {
            if (birthDay <= 22) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (birthMonth == 10) {
            if (birthDay <= 22) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (birthMonth == 11) {
            if (birthDay <= 19) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else if (birthMonth == 12) {
            if (birthDay <= 21) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        }

        if (is29Feb || is30Months || is31Months) {

            if (range1_29) {
                System.out.println("Burcunuz: " + burc);
            } else if (range1_30) {
                System.out.println("Burcunuz: " + burc);
            } else if (range1_31) {
                System.out.println("Burcunuz: " + burc);
            } else {
                System.out.println("Hatalı Gün Girdiniz!");
            }

        } else {
            System.out.println("Hatalı Ay Girdiniz!");
        }


    }
}
