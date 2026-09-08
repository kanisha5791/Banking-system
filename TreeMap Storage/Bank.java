import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        HashMap<Integer, Double> accounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BANKING MANAGEMENT SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                accounts.put(accNo, balance);
                System.out.println("Account created successfully!");

            } else if (choice == 2) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                if (accounts.containsKey(accNo)) {
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    accounts.put(accNo, accounts.get(accNo) + amount);
                    System.out.println("Amount deposited!");
                } else {
                    System.out.println("Account not found!");
                }

            } else if (choice == 3) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                if (accounts.containsKey(accNo)) {
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= accounts.get(accNo)) {
                        accounts.put(accNo, accounts.get(accNo) - amount);
                        System.out.println("Amount withdrawn!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else {
                    System.out.println("Account not found!");
                }

            } else if (choice == 4) {
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                if (accounts.containsKey(accNo)) {
                    System.out.println("Balance: Rs." + accounts.get(accNo));
                } else {
                    System.out.println("Account not found!");
                }

            } else if (choice == 5) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}