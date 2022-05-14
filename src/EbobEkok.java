public class EbobEkok {
    public static void main(String[] args) {


        int number1 = 18, number2 = 24;

        // 18 ve 24 sayılarının en büyük ortak bölenini bulalım.
        // bu iki sayının en büyük ortak böleni(ebob), küçük olan sayıyı aşamaz.

        // Tersten gelme (Ebob için) // sayılar aralarında asal değilse daha az maliyetlidir
        int minNumber = Math.min(number1, number2); //Alternative>> number1 < number2 ? number1 : number2;

        int divide = minNumber;

        int gcd = 1, lcf, multi = number1 * number2;
        while (true) {
            if (number1 % divide == 0 && number2 % divide == 0) {
                gcd = divide;
                break;
            }
            divide--;
        }

        lcf = multi / gcd;

        System.out.println("EKOK(LCF):" + lcf);
        System.out.println("EBOB(GCD): " + gcd);







     /*   int ebob1 = 1;
        for (int i = minNumber; i >= 1; i--) {
            boolean condition = number1 % i == 0 && number2 % i == 0;
            if (condition) {
                ebob1 = i;
                System.out.println("EBOB(GCD): " + i);
                break;
            }
        }

        // Baştan Gitme (Ebob için) //
        int ebob = 1;
        for (int i = 1; i <= minNumber; i++) {
            boolean condition = number1 % i == 0 && number2 % i == 0;
            if (condition) ebob = i;
        }
        System.out.println("EBOB(GCD): " + ebob);


        // Ekok için en kötü senaryo sayılar aralarında asal ise çarpımları en küçük ortak katı olur  (Worst case senaryo)

        for (int i = 1; i <= number1 * number2; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.println("EKOK(LCF): " + i);
                break;
            }
        }


        // a ve b pozitif tam sayıları için, a * b = EBOB (a,b) * EKOK (a,b) GENEL KURAL

        System.out.println("EKOK(LCF): " + (number1 * number2) / ebob1);*/

    }


}
