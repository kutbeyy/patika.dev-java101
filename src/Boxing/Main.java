package Boxing;

public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Lark", 88);
        Fighter f2 = new Fighter("Kent", 78);

        Match m1 = new Match(f1, f2);
        m1.showFighterInfo();

        System.out.println("\n");

        m1.run();

    }
}
