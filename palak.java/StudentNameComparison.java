import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }

        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }

        sc.close();
    }
}