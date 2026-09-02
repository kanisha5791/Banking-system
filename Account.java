public class Account {
    int id;
    String name;
    double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println(id + " | " + name + " | ₹" + balance);
    }
}