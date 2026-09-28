// Subclass extending the abstract Console parent class
public class ConsoleSales extends Console {

    // Subclass constructor passing values up to the parent super constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }


    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("*********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

