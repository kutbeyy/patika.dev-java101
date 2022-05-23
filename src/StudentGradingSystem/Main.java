package StudentGradingSystem;

public class Main {

    public static void main(String[] args) {
        Lessons tarih = new Lessons("Tarih", "TRH", "101");
        Lessons math = new Lessons("Matematik", "MAT", "101");
        Lessons cografya = new Lessons("Coğrafya", "COG", "101");

        Teachers tarihT1 = new Teachers("Fatih", "Çelik", "Öğretmen", 26, "TRH");
        tarihT1.showPersonInfo();


        Teachers mathT1 = new Teachers("Süleyman", "Ural", "Öğretmen", 32, "MAT");
        Teachers cografyaT1 = new Teachers("Savaş", "Keleş", "Öğretmen", 45, "COG");

        tarih.addTeacher(tarihT1);
        tarih.addTeacher(mathT1);
        math.addTeacher(mathT1);
        cografya.addTeacher(cografyaT1);

        tarih.showTeacher();
        tarih.showLessonInfo();


        Students student1 = new Students("Ahmet", "Çalık", "Öğrenci", 15, "458", "10-A", tarih, math, cografya);

        tarihT1.giveMidtermGrade(student1, 80);
        tarihT1.giveFinalGrade(student1, 90);

        mathT1.giveMidtermGrade(student1, 45);
        mathT1.giveFinalGrade(student1, 68);

        cografyaT1.giveMidtermGrade(student1, 80);
        cografyaT1.giveFinalGrade(student1, 60);


        student1.showPersonInfo();


    }


}
