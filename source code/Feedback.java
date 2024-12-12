import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Feedback {
    private String name;
    private String customerFeedback;
    private int rating;
    private String suggestion;
    private Date date;
    private String status;

    public Feedback(String name, String customerFeedback, int rating) {
        this.name = name;
        this.customerFeedback = customerFeedback;
        this.rating = rating;
        this.suggestion = null;
        this.date = new Date();
        this.status = "Pending";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
    
    public String getSuggestion() {
        return suggestion;
    }


    public static int provideFeedback(Scanner scanner, List<Furnitures> availableFurniture) {
        System.out.println("\nAvailable Furniture Products:");
        for (int i = 0; i < availableFurniture.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, availableFurniture.get(i).getDescription());
        }

        int choice = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Select the product you want to provide feedback for (1 to " + availableFurniture.size() + "): ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());

                if (choice >= 1 && choice <= availableFurniture.size()) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please choose a number between 1 and " + availableFurniture.size() + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return choice;
    }

     

    public static void submitFeedback(Scanner scanner, List<Feedback> feedbackList) {
        System.out.print("Enter a username or type Anonymous: ");
        String name = scanner.nextLine();
     
        System.out.print("Enter your feedback: ");
        String customerFeedback = scanner.nextLine();

        System.out.print("Enter your rating (1 to 5): ");
        int rating = Integer.parseInt(scanner.nextLine());

        String suggestion = null;
    
        if (rating <= 2) {
            System.out.print("Do you want to provide a suggestion? (yes or no): ");
            String answer = scanner.nextLine().toLowerCase();
            
            if (answer.equals("yes")) {
                System.out.print("Please provide your suggestion: ");
                suggestion = scanner.nextLine();
            }
        }

       Feedback feedback = new Feedback(name, customerFeedback, rating);
       
       if (suggestion != null && !suggestion.isEmpty()) {
           feedback.setSuggestion(suggestion);
        }

        feedbackList.add(feedback);

         System.out.println("Thank you for your feedback!");
    }

    public static void viewFeedback(List<Feedback> feedbackList) {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (Feedback feedback : feedbackList) {
                System.out.println(feedback);
            }
        }
    }

    public static void viewAllFeedback(List<Feedback> feedbackList) {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (Feedback feedback : feedbackList) {
                System.out.println(feedback);
            }
        }
    }


    @Override
    public String toString() {
        return String.format("User: %s\nFeedback: %s\nRating: %d\nSuggestion: %s\nDate: %s\nStatus: %s",
            name, customerFeedback, rating, suggestion == null ? "No suggestion" : suggestion, date, status);
    }

}