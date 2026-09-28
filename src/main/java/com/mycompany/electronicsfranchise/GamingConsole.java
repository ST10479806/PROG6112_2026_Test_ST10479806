public abstract class GamingConsole {

    // Variables
    private String consoleType;
    private String storeName;
    private double totalSales;

    // Constructor
    public GamingConsole(String consoleType, String storeName, double totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Get methods
    public String getConsoleType() {
        return consoleType;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getTotalSales() {
        return totalSales;
    }

    // Abstract method - each subclass must write its own version
    public abstract void printReport();
}