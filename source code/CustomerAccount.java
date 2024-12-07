import java.util.ArrayList;
import java.util.Scanner;

public class CustomerAccount {
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<String> passwords = new ArrayList<>();
    private boolean loggedIn = false;

    public boolean createAccount(Scanner scanner) {
        System.out.print("Enter a new username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a new password: ");
        String password = scanner.nextLine();

        if (!usernames.contains(username)) {
            usernames.add(username);
            passwords.add(password);
            System.out.println("Welcome " + username + ", your account has been successfully created!\n");
            return true;
        } else {
            System.out.println("Oops, that username is already taken. Please try another one.\n");
            return false;
        }
    }

    public boolean login(Scanner scanner) {
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            int index = usernames.indexOf(username);
            if (index != -1 && passwords.get(index).equals(password)) {
                loggedIn = true;
                System.out.println("Login successful!\n");
                return true;
            } else {
                System.out.println("Invalid username or password. Try again.");
                attempts++;
            }
        }

        System.out.println("Too many failed attempts. Please try again later.");
        return false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
