class Account {
    int balance = 1000;

    void withdraw(String name, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(name + ": Insufficient balance");
            }
        }
    }
}

class User extends Thread {
    Account acc;
    String name;
    int amount;

    User(Account acc, String name, int amount) {
        this.acc = acc;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        acc.withdraw(name, amount);
    }
}

class BankingSystem {
    public static void main(String[] args) {
        Account acc = new Account();

        User u1 = new User(acc, "User1", 700);
        User u2 = new User(acc, "User2", 500);

        u1.start();
        u2.start();
    }
}