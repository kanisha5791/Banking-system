public class Account {
    int id;
    String name;
    double balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void display() {
        System.out.println(id + "  " + name + "  " + balance);
    }
}