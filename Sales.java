import java.util.Scanner;

public class Sales {
    public void CalculateSales() {
        Scanner input = new Scanner(System.in);
        // sales array holds data on number of each product sold by each salesman
        double[][] sales = new double[5][4]; // 5 products, 4 salespersons

        System.out.print("Enter sales person number (-1 to end): ");
        int person = input.nextInt();

        while (person != -1) {
            System.out.print("Enter product number: ");
            int product = input.nextInt(); // Corrected to nextInt()
            System.out.print("Enter sales amount: ");
            double amount = input.nextDouble();

            // error-check the input
            if (person >= 1 && person <= 4 && product >= 1 && product <= 5 && amount >= 0) {
                sales[product - 1][person - 1] += amount;
            } else {
                System.out.println("Invalid input!");
            }

            System.out.print("Enter sales person number (-1 to end): ");
            person = input.nextInt();
        } // end while

        // Total for each salesperson
        double[] salesPersonTotal = new double[4];

        // Display the table
        System.out.printf("%7s%14s%14s%14s%14s%10s\n",
                "Product", "Salesperson 1", "Salesperson 2",
                "Salesperson 3", "Salesperson 4", "Total");

        // For each row, calculate and print the sales data
        for (int row = 0; row < 5; row++) {
            double productTotal = 0.0;
            System.out.printf("%7d", (row + 1));

            for (int column = 0; column < 4; column++) {
                System.out.printf("%14.2f", sales[row][column]);
                productTotal += sales[row][column];
                salesPersonTotal[column] += sales[row][column];
            } // end for

            System.out.printf("%10.2f\n", productTotal);
        } // end for

        // Print totals for each salesperson
        System.out.printf("%7s", "Total");
        for (int column = 0; column < 4; column++) {
            System.out.printf("%14.2f", salesPersonTotal[column]);
        }

        System.out.println();
    } // end method CalculateSales

    public static void main(String[] args) {
        Sales sales = new Sales();
        sales.CalculateSales();
    }
} // end class Sales
