import java.util.Scanner;

public class Main {
    private static final Double USD_TO_PHP =59.71;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayHeader();

        System.out.println("Enter USD Amount");

        System.out.print("USD : ");
        if (scanner.hasNextDouble()) {
            double usdAmount = scanner.nextDouble();
            double phpAount = converToPhp(usdAmount);
            System.out.printf("PHP : ₱%.2f%n", phpAount);
        }
        else {
            System.out.println("Invalid amount. Please Enter valid amount");
        }
        scanner.close();
    }

    public static void displayHeader() {
        System.out.println("===========================================");
        System.out.println("========= Currency Converter V1.0 =========");
        System.out.println("===========================================");
    }

    public static double converToPhp(double usdAmout) {
        return usdAmout * USD_TO_PHP;
    }
}
