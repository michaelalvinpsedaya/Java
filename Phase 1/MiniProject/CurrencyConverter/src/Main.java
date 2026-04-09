import java.util.Scanner;

public class Main {
    // Constants are written in UPPER_CASE (Best Practice)
    private static final double USD_TO_PHP = 56.12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayHeader();

        System.out.print("Enter amount in USD: ");
        if (input.hasNextDouble()) {
            double usdAmount = input.nextDouble();
            double phpAmount = convertToPhp(usdAmount);

            System.out.printf("Success: $%.2f is equivalent to ₱%.2f%n", usdAmount, phpAmount);
        } else {
            System.out.println("Error: Please enter a valid numerical decimal.");
        }

        input.close();
    }

    private static void displayHeader() {
        System.out.println("================================");
        System.out.println("   CURRENCY CONVERTER v1.0      ");
        System.out.println("================================");
    }

    private static double convertToPhp(double usd) {
        return usd * USD_TO_PHP;
    }
}