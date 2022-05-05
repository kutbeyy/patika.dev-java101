import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
       /* Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise
         ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmayacak...*/

        float math, fizik, kimya, turkce, tarih, muzik; // exam's varaibles

        Scanner examInput = new Scanner(System.in);

        System.out.print("Matemetik Sınav Notu:");
        math = examInput.nextFloat();

        System.out.print("Fizik Sınav Notu:");
        fizik = examInput.nextFloat();

        System.out.print("Kimya Sınav Notu:");
        kimya = examInput.nextFloat();

        System.out.print("Türkçe Sınav Notu:");
        turkce = examInput.nextFloat();

        System.out.print("Tarih Sınav Notu:");
        tarih = examInput.nextFloat();

        System.out.print("Müzik Sınav Notu:");
        muzik = examInput.nextFloat();


        float sumOfExamGrades = math + fizik + kimya + turkce + tarih + muzik;
        float avarageOfExamGrades = sumOfExamGrades / 6f;
        System.out.print("Ortalama:" + avarageOfExamGrades);

        float passGrade = 60f;
        String passStatus = avarageOfExamGrades >= passGrade ? " Ortalama ile Geçtiniz" :" Ortalama ile Kaldınız";
        System.out.println(passStatus);

    }
}
