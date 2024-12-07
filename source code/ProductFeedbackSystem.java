import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFeedbackSystem {
    static CustomerAccount customerAccount = new CustomerAccount();
    static Administrator administrator = new Administrator("king", "kingking21");
    static List<Feedback> feedbackList = new ArrayList<>();
    static List<Furnitures> availableFurniture = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        availableFurniture.add(new Furnitures("Gaming Chair", "Seating", 101, "Chair", "Gaming Chair", "Leather", "Ergonomic and adjustable"));
        availableFurniture.add(new Furnitures("Dining Table", "Furniture", 102, "Table", "Dining Table", "Wood", "Seats 6 people"));
        availableFurniture.add(new Furnitures("Living Room Couch", "Seating", 103, "Couch", "5-Seater Couch", "Fabric", "Comfortable and durable"));
        availableFurniture.add(new Furnitures("Bookcase", "Storage", 104, "Bookcase", "3-Shelf Bookcase", "Wood", "Compact and stylish"));
        availableFurniture.add(new Furnitures("Drawer Unit", "Storage", 105, "Drawer", "5-Drawer Unit", "Metal", "Sturdy and spacious"));

        boolean exit = false;
        while (!exit) {
            System.out.println("\n==========================================================");
            System.out.println("Welcome to Share your Feedback: Product Feedback System.");
            System.out.println("==========================================================");
            System.out.println("\n1. Register an account");
            System.out.println("2. Login");
            System.out.println("3. Admin Login");
            System.out.println("4. Exit");
            
            int choice = 0;
            boolean validChoice = false;
            
            while (!validChoice) {
                System.out.print("Enter your choice (1-4): ");
       
                if (scanner.hasNextInt()) {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice >= 1 && choice <= 4) {
                        validChoice = true; 
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }

            switch (choice) {
                case 1:
                    customerAccount.createAccount(scanner);
                    break;
                case 2:
                    if (customerAccount.login(scanner)) {
                        provideCustomerMenu(scanner, feedbackList);
                    }
                    break;
                case 3:
                    if (administrator.login(scanner)) {
                        administrator.adminMenu(scanner, feedbackList);
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    public static void provideCustomerMenu(Scanner scanner, List<Feedback> feedbackList) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\n======================");
            System.out.println("Feedback System Menu");
            System.out.println("=====================");
            System.out.println("1. Provide Feedback");
            System.out.println("2. View My Feedback");
            System.out.println("3. Logout");

            int choice = -1;
            while (choice < 1 || choice > 3) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice < 1 || choice > 3) {
                        throw new IllegalArgumentException("Invalid choice. Please enter 1, 2, or 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            switch (choice) {
                case 1:
                    int productChoice = Feedback.provideFeedback(scanner, availableFurniture);
                    if (productChoice != -1) {
                        Furnitures selectedProduct = availableFurniture.get(productChoice - 1);
                        System.out.println("You have selected: " + selectedProduct.getProductName());
                        Feedback.submitFeedback(scanner, feedbackList);
                    }
                    break;
                case 2:
                    Feedback.viewFeedback(feedbackList);
                    break;
                case 3:
                    loggedIn = false;
                    System.out.println("Exiting the feedback system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

    