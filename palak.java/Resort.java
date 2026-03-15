import java.util.Scanner;

class Resort {
    int RNo, Days;
    String Name;
    float Charges, Amount;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room No: ");
        RNo = sc.nextInt();
        System.out.print("Enter Name: ");
        Name = sc.next();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();
        System.out.print("Enter Days: ");
        Days = sc.nextInt();
    }

    float Compute() {
        Amount = Days * Charges;
        if (Amount > 11000)
            Amount = 1.02f * Amount;
        return Amount;
    }

    void DispInfo() {
        Compute();
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}