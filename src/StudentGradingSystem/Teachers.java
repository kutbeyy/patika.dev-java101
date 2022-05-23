package StudentGradingSystem;

public class Teachers extends SchPerson {
    public String branch;


    Teachers(String name, String surname, String title, int age, String branch) {
        super(name, surname, title, age);
        this.branch = branch;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Branş:" + this.branch);
        System.out.println("=".repeat(20));
    }


    public void giveMidtermGrade(Students students, double midterm) {
        if (midterm >= 0D && midterm <= 100D) {
            if (this.branch.equals(students.l1.suffix)) {
                students.l1.midterm = midterm;
            }
            if (this.branch.equals(students.l2.suffix)) {
                students.l2.midterm = midterm;
            }
            if (this.branch.equals(students.l3.suffix)) {
                students.l3.midterm = midterm;
            }
            System.out.println(this.branch + " Vize Notu Başarı ile girildi!");
        } else {
            System.out.println(this.branch + " Not değeri 1 ile 100 (dahil) arasında olmalıdır!");
        }
    }

    public void giveFinalGrade(Students students, double finalGrade) {
        if (finalGrade >= 0D && finalGrade <= 100D) {
            if (this.branch.equals(students.l1.suffix)) {
                students.l1.finalGrade = finalGrade;
            }
            if (this.branch.equals(students.l2.suffix)) {
                students.l2.finalGrade = finalGrade;
            }
            if (this.branch.equals(students.l3.suffix)) {
                students.l3.finalGrade = finalGrade;
            }
            System.out.println(this.branch + " Final Notu Başarı ile girildi!");
        } else {
            System.out.println(this.branch + " Not değeri 1 ile 100 (dahil) arasında olmalıdır!");
        }
    }

}
