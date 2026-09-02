import java.util.LinkedHashMap;

public class AccountDAO {

    private LinkedHashMap<Integer, Account> accounts = new LinkedHashMap<>();

    public void createAccount(Account account) {
        accounts.put(account.id, account);
        System.out.println("Account created successfully!");
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public void viewAllAccounts() {
        for (Account account : accounts.values()) {
            account.display();
        }
    }
}