import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt selection
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // Convert option integer choice to console string text
        String consoleType = "";
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else if (choice == 3) {
            consoleType = "SWITCH";
        } else {
            consoleType = "Unknown";
        }

        // Store Name input
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        // Total sales input
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales subclass object
        ConsoleSales appReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Run the print output method display
        appReport.printReport();

        scanner.close();
    }
}
