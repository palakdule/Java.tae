interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

class TestBank {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();
        ICICI i = new ICICI();

        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + i.getInterestRate() + "%");
    }
}