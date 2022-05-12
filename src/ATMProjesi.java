import java.util.Scanner;

public class ATMProjesi {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String IDnumber, password;
        String dbIDnumber = "123", dbPassword = "123";
        byte wrongAttempt = 3, processSelect;
        double balance = 0D;
        do {
            // entrance panel || Giriş paneli
            System.out.print("Enter your identity number: ");
            IDnumber = scan.nextLine();
            System.out.print("Enter your password: ");
            password = scan.nextLine();
            System.out.println();
            boolean login = IDnumber.equals(dbIDnumber) && password.equals(dbPassword);
            if (!login) {
                wrongAttempt--;
                System.out.println("Incorrect ID number or password! Remaining rights:" + wrongAttempt);
                if (wrongAttempt == 0) System.out.println("Account is blocked,Contact your bank!");
                System.out.println();
            } else {
                System.out.println("Wellcome Patika Bank!");
                do {
                    // Menu
                    System.out.println("1-Take Money\n2-Deposite Money\n3-Balance inquiry\n4-Exit");
                    System.out.print("Your Option:");
                    processSelect = scan.nextByte();
                    System.out.println();
                    switch (processSelect) {
                        case 1 -> {
                            System.out.print("The amount of money to be withdrawn: ");
                            double takeMoney = scan.nextDouble();
                            if (takeMoney > balance) {
                                System.out.println("\nInsufficient balance!\nYour account balance: " + balance);
                            } else {
                                balance -= takeMoney;
                                System.out.println("New account balance: " + balance + "\n");
                            }
                        }
                        case 2 -> {
                            System.out.print("Amount of Deposit: ");
                            double depositedMoney = scan.nextDouble();
                            balance += depositedMoney;
                            System.out.println("New account balance: " + balance + "\n");
                        }
                        case 3 -> System.out.println("Account balance: " + balance + "\n");
                        case 4 -> System.out.println("See you!");
                        default -> System.out.println("Wrong Selected!\n");
                    }
                } while (processSelect != 4); // Menu loop
                break; // App Exit
            }
        } while (wrongAttempt != 0); // Entrance panel loop


    }
}
