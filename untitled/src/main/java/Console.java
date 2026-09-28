// Abstract base class implementing the interface
public abstract class Console implements IConsoles {
    // Member variables to hold console info
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor accepting parameters to populate variables
    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementing required interface getter methods
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
