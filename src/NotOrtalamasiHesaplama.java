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

        Scanner examMathInput = new Scanner(System.in);
        System.out.print("Matemetik Sınav Notu:");
        math = examMathInput.nextFloat();


        Scanner examFizikInput = new Scanner(System.in);
        System.out.print("Fizik Sınav Notu:");
        fizik = examFizikInput.nextFloat();


        Scanner examKimyaInput = new Scanner(System.in);
        System.out.print("Kimya Sınav Notu:");
        kimya = examKimyaInput.nextFloat();


        Scanner examTurkceInput = new Scanner(System.in);
        System.out.print("Türkçe Sınav Notu:");
        turkce = examTurkceInput.nextFloat();


        Scanner examTarihInput = new Scanner(System.in);
        System.out.print("Tarih Sınav Notu:");
        tarih = examTarihInput.nextFloat();


        Scanner examMuzikInput = new Scanner(System.in);
        System.out.print("Müzik Sınav Notu:");
        muzik = examMuzikInput.nextFloat();


        float sumOfExamGrades = math + fizik + kimya + turkce + tarih + muzik;
        float avarageOfExamGrades = sumOfExamGrades / 6f;
        System.out.print("Ortalama:" + avarageOfExamGrades);

        float passGrade = 60f;
        String passStatus = avarageOfExamGrades >= passGrade ? " Ortalama ile Geçtiniz" :" Ortalama ile Kaldınız";
        System.out.println(passStatus);

    }
}
