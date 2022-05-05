import java.util.Scanner;

public class VucutKitleIndeksiHesapla {

/*    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
    kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)*/

    public static void main(String[] args) {

        float height, weight, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuz(M):");
        height = input.nextFloat();

        System.out.print("Kilonuz(KG):");
        weight = input.nextFloat();

        bodyMassIndex = weight / (height * height);

        System.out.println("Vucut Kitle İndeksiniz:" + bodyMassIndex);
    }
}
