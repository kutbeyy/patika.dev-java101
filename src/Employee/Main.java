package Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Fatih", 2000d, 45d, 1985);
        String info1 = employee1.toString();
        System.out.println("=".repeat(20));
        Employee employee2 = new Employee("Hakan", 5300d, 50d, 2020);
        String info2 = employee2.toString();

    }
}
