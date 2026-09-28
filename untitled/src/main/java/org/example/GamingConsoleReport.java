

public class GamingConsoleReport {
    public static void main(String[] args) {
        // Array declarations
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        // Main Report
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("                PS5          XBOX         SWITCH");


        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-16s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-13d", sales[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------\n");

        // Totals Calculations
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        int[] cityTotals = new int[cities.length];

        for (int i = 0; i < sales.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                rowTotal += sales[i][j];
            }
            cityTotals[i] = rowTotal;
            System.out.printf("%-16s%d%n", cities[i], rowTotal);
        }
        System.out.println();

        // Maximum Sales Logic
        int maxSales = cityTotals[0];
        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                maxIndex = i;
            }
        }
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
    }
}
