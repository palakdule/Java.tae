import java.util.Scanner;

class UsernameValidator {
    private String username;

        public UsernameValidator(String username) {
        this.username = username;
    }

        public String cleanUsername() {
        String cleaned = username.trim();
                cleaned = cleaned.toLowerCase();
        
        return cleaned;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.nextLine();

       
        UsernameValidator validator = new UsernameValidator(input);
        System.out.println("Cleaned Username: " + validator.cleanUsername());

        sc.close();
    }
}