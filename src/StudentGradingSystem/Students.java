package StudentGradingSystem;

public class Students extends SchPerson {
    public Lessons l1;
    public Lessons l2;
    public Lessons l3;
    public String stNum;
    public String stClass;

    Students(String name, String surname, String title, int age, String stNum, String stClass, Lessons l1, Lessons l2, Lessons l3) {
        super(name, surname, title, age);
        this.stNum = stNum;
        this.stClass = stClass;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        this.l1.calcAvarageAndStatus();
        this.l2.calcAvarageAndStatus();
        this.l3.calcAvarageAndStatus();
        System.out.println("Öğr. No:" + this.stNum);
        System.out.println("Öğr. Sınıfı:" + this.stClass);
        System.out.println(this.l1.allName + " : " + this.l1.midterm + ", " + this.l1.finalGrade + " = " + this.l1.avarage + " >> " + this.l1.status);
        System.out.println(this.l2.allName + " : " + this.l2.midterm + ", " + this.l2.finalGrade + " = " + this.l2.avarage + " >> " + this.l2.status);
        System.out.println(this.l3.allName + " : " + this.l3.midterm + ", " + this.l3.finalGrade + " = " + this.l3.avarage + " >> " + this.l3.status);
        System.out.println("=".repeat(20));

    }


}
