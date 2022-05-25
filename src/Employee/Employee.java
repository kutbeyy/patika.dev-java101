package Employee;

import java.time.LocalDateTime;


public class Employee {
    public String name;
    public Double salary;
    public Double workHours;
    public int hireYear;

    public double bonusFactor;
    public double bonusPrice;

    Employee(String name, Double salary, Double workHours, int hireYear, double bonusFactor, double bonusPrice) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonusFactor = bonusFactor;
        this.bonusPrice = bonusPrice;
    }

    Employee(String name, Double salary, Double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonusFactor = 40D;
        this.bonusPrice = 30D;

        bonus();
    }

    private double tax() { // vergilendirme
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        if (this.workHours >= this.bonusFactor) {
            bonus = (this.workHours - this.bonusFactor) * this.bonusPrice;
        }
        return bonus;
    }

    public double raiseSalary() {
        int nowYear = LocalDateTime.now().getYear();
        int minusYears = (nowYear - this.hireYear);

        double salaryIncrease = 0;
        if (minusYears <= 9) {
            salaryIncrease = this.salary * 0.05;
        } else if (minusYears <= 19) {
            salaryIncrease = this.salary * 0.1;
        } else {
            salaryIncrease = this.salary * 0.15;
        }
        return salaryIncrease;
    }

    public Double salaryWithoutTax() {
        return (this.salary + this.bonus() - this.tax());
    }

    public Double lastSalary() {
        return (this.salary + this.bonus() + this.raiseSalary() - this.tax());
    }

    @Override
    public String toString() {
        String info = "Ad: " + this.name + "\n" + "Maaşı: " + this.salary + "\n" + "Çalışma Saati :" + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" + "Vergi :" + this.tax() + "\n" + "Bonus :" + this.bonus() + "\n" +
                "Maaş Artışı :" + this.raiseSalary() + "\n" + "Vergi ve Bonuslar ile birlikte maaş :" + this.salaryWithoutTax() + "\n" +
                "Toplam maaş :" + this.lastSalary();

        System.out.println(info);
        return info;
    }

}
