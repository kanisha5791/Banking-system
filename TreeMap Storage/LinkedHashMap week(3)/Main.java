import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        while (true) {

            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Check");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    dao.createAccount(new Account(id, name, balance));
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    Account acc = dao.getAccount(id);

                    if (acc != null) {
                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();
                        acc.balance += amount;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    acc = dao.getAccount(id);

                    if (acc != null) {
                        System.out.print("Enter Amount: ");
                        double amount = sc.nextDouble();

                        if (amount <= acc.balance) {
                            acc.balance -= amount;
                            System.out.println("Withdraw successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account ID: ");
                    id = sc.nextInt();

                    acc = dao.getAccount(id);

                    if (acc != null) {
                        System.out.println("Balance: ₹" + acc.balance);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("\nID | Name | Balance");
                    dao.viewAllAccounts();
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