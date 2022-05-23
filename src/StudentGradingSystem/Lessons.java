package StudentGradingSystem;


import java.util.Objects;

public class Lessons {
    Teachers teacher;
    public String name;
    public String suffix;
    public String code;

    public String allName;

    public double midterm;

    public double finalGrade;
    public double avarage;

    public boolean isPass;

    public String status;


    Lessons(String name, String suffix, String code) {
        this.name = name;
        this.suffix = suffix;
        this.code = code;
        this.allName = this.name + "-" + this.suffix + "-" + this.code;
        this.avarage = 0D;
        this.isPass = false;


    }


    public void showLessonInfo() {
        System.out.println("=".repeat(20));
        System.out.println("Adı:" + this.name);
        System.out.println("Ön Eki:" + this.suffix);
        System.out.println("Kodu:" + this.code);
        System.out.println("Tam Ad:" + this.allName);
        System.out.println("=".repeat(20));
    }

    public void addTeacher(Teachers teacher) {

        if (Objects.equals(teacher.branch, this.suffix)) {
            this.teacher = teacher;
        } else {
            System.out.println("=".repeat(20));
            System.out.println("Ders branşı ile öğretmen branşı uyuşmuyor!");
            System.out.println("=".repeat(20));
        }

    }

    public void showTeacher() {

        if (this.teacher != null) {
            this.teacher.showPersonInfo();
        } else {
            System.out.println("Derse öğretmen atanmamış!");
        }

    }

    public void calcAvarageAndStatus() {
        this.avarage = (this.midterm * 0.4) + (this.finalGrade * 0.6);
        this.isPass = this.avarage >= 60;
        this.status = this.isPass ? "Geçti" : "Kaldı";
    }


}
