import java.util.Scanner;

public class Graphs {

    // Draws 5 histograms
    public void drawHistograms() {
        Scanner input = new Scanner(System.in);

        int number1 = 0; // first number
        int number2 = 0; // second number
        int number3 = 0; // third number
        int number4 = 0; // fourth number
        int number5 = 0; // fifth number

        int inputNumber; // number entered by user

        // Loop to input 5 valid numbers
        for (int counter = 1; counter <= 5; counter++) {
            System.out.print("Enter number (1-30): ");
            inputNumber = input.nextInt();

            // Validate input range
            if (inputNumber >= 1 && inputNumber <= 30) {
                switch (counter) {
                    case 1:
                        number1 = inputNumber;
                        break;
                    case 2:
                        number2 = inputNumber;
                        break;
                    case 3:
                        number3 = inputNumber;
                        break;
                    case 4:
                        number4 = inputNumber;
                        break;
                    case 5:
                        number5 = inputNumber;
                        break;
                }
            } else {
                System.out.println("Invalid Input. Number should be between 1 and 30.");
                counter--; // Decrement counter to re-enter the number
            }
        }

        // Array to store the numbers for easier looping
        int[] numbers = {number1, number2, number3, number4, number5};

        // Print histograms
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            for (int j = 1; j <= numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each histogram
        }
    }

    public static void main(String[] args) {
        Graphs graphs = new Graphs();
        graphs.drawHistograms();
    }
}
