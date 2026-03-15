class Bank {
    final double interestRate = 5.0;   // fixed interest rate

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        double c1 = b.calculateInterest(10000);
        double c2 = b.calculateInterest(20000);
        double c3 = b.calculateInterest(50000);

        System.out.println("Interest for Customer 1: " + c1);
        System.out.println("Interest for Customer 2: " + c2);
        System.out.println("Interest for Customer 3: " + c3);
    }
}