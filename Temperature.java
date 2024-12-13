import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        int option;
        double degree1; // Variable for temperature input
        double celsius1; // Variable for Celsius conversion
        double fahrenheit1; // Variable for Fahrenheit conversion

        Scanner input = new Scanner(System.in);

        // Display menu options
        System.out.printf("%s\n%s\n%s\n", 
            "1 for Fahrenheit to Celsius", 
            "2 for Celsius to Fahrenheit", 
            "3 to quit:");

        // Get user option
        option = input.nextInt();

        // Process based on user option
        if (option == 1) {
            System.out.print("Enter the degrees in Fahrenheit: ");
            degree1 = input.nextDouble();

            // Convert Fahrenheit to Celsius
            celsius1 = (degree1 - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.2f\n", celsius1);

        } else if (option == 2) {
            System.out.print("Enter the degrees in Celsius: ");
            degree1 = input.nextDouble();

            // Convert Celsius to Fahrenheit
            fahrenheit1 = (degree1 * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.2f\n", fahrenheit1);

        } else if (option == 3) {
            System.out.println("Program ended.");
        } else {
            System.out.println("Invalid option. Please select 1, 2, or 3.");
        }
    }
}
