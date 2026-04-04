class BankApplication {

    static void withdraw(double balance, double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        } else {
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + (balance - amount));
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}