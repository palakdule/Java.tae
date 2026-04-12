import java.util.Scanner;
import java.util.InputMismatchException;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            int check = 100 / age;

            System.out.println("Student age: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }
}