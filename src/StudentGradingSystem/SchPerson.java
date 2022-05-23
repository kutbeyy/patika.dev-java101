package StudentGradingSystem;

public class SchPerson {
    String name;
    String surname;

    String title;
    int age;

    SchPerson(String name, String surname, String title, int age) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.age = age;
    }

    public void showPersonInfo() {
        System.out.println("=".repeat(20));
        System.out.println("Ad:" + this.name);
        System.out.println("Soyad:" + this.surname);
        System.out.println("Ünvan:" + this.title);
        System.out.println("Yaş:" + this.age);
    }

}
