import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankLedger bank = new BankLedger();

        while (true) {

            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. Sorted Ledger");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    bank.createAccount(id, name);
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    bank.deposit(id, amount);
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    amount = sc.nextDouble();

                    bank.withdraw(id, amount);
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    bank.checkBalance(id);
                    break;

                case 5:
                    bank.sortedLedger();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}