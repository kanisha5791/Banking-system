import java.util.TreeMap;

public class BankLedger {

    TreeMap<Integer, Account> accounts = new TreeMap<>();

    public void createAccount(int id, String name) {
        accounts.put(id, new Account(id, name));
        System.out.println("Account created!");
    }

    public void deposit(int id, double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(int id, double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance(int id) {
        if (accounts.containsKey(id)) {
            System.out.println("Balance: " + accounts.get(id).balance);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void sortedLedger() {
        System.out.println("\nSorted Ledger:");

        for (Account account : accounts.values()) {
            account.display();
        }
    }
}