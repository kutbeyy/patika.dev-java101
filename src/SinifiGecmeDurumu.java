import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        // lecture notes
        float math, physics, chemistry, music, avarage, passGrade = 55f;
        boolean mathRange, pyhsicsRange, chemistryRange, musicRange;
        byte generic;

        Scanner inputGrade = new Scanner(System.in);

        System.out.print("Matematik Notu:");
        math = inputGrade.nextFloat();

        System.out.print("Fizik Notu:");
        physics = inputGrade.nextFloat();

        System.out.print("Kimya Notu:");
        chemistry = inputGrade.nextFloat();

        System.out.print("Müzik Notu:");
        music = inputGrade.nextFloat();

        mathRange = math <= 100f && math >= 0f;
        pyhsicsRange = physics <= 100f && physics >= 0f;
        chemistryRange = chemistry <= 100f && chemistry >= 0f;
        musicRange = music <= 100f && music >= 0f;

        generic = (byte) ((mathRange && pyhsicsRange && chemistryRange && musicRange) ? 1 : 0);

        switch (generic) {
            case 1 -> {
                avarage = (math + physics + chemistry + music) / 4f;
                if (avarage >= passGrade) {
                    System.out.println(avarage + " Ortalama ile geçtiniz!");
                } else {
                    System.out.println(avarage + " Ortalama ile Kaldınız!");
                }
            }
            case 0 -> System.out.println("Girilen Veriler Hatalı Ortalama Hesaplanamadı!");
            
        }

    }
}
