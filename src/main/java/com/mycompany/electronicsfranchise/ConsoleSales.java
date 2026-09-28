public class ConsoleSales extends GamingConsole {

    // Constructor calls the parent (Consoles) constructor
    public ConsoleSales(String consoleType, String storeName, double totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("\n===== CONSOLE SALES REPORT =====");
        System.out.println("Console type : " + getConsoleType());
        System.out.println("Store        : " + getStoreName());
        System.out.println("Total sales  : R" + String.format("%.2f", getTotalSales()));
        System.out.println("================================");
    }
}