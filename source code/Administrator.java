import java.util.List;
import java.util.Scanner;

public class Administrator {
    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(Scanner scanner) {
        System.out.print("Enter Admin Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Admin login successful!\n");
            return true;
        } else {
            System.out.println("Invalid Admin credentials.");
            return false;
        }
    }

    public void adminMenu(Scanner scanner, List<Feedback> feedbackList) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\nAdministrator Menu:");
            System.out.println("1. View All Feedback");
            System.out.println("2. Update Feedback Status");
            System.out.println("3. Logout");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Feedback.viewAllFeedback(feedbackList); // View all feedback
                    break;
                case 2:
                    updateFeedbackStatus(scanner, feedbackList);
                    break;
                case 3:
                    loggedIn = false;
                    System.out.println("Logged out.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void updateFeedbackStatus(Scanner scanner, List<Feedback> feedbackList) {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback to update.");
            return;
        }

        for (int i = 0; i < feedbackList.size(); i++) {
            System.out.println((i + 1) + ". " + feedbackList.get(i));
        }

        System.out.print("Enter feedback number to update: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < feedbackList.size()) {
            System.out.print("Enter new status: ");
            feedbackList.get(index).setStatus(scanner.nextLine());
            System.out.println("Feedback status updated.");
        } else {
            System.out.println("Invalid feedback number.");
        }
    }
}

