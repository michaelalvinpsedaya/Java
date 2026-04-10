import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> expenses = new ArrayList<>();
        double monthlyBudget = 0;
        while (true) {
            try {
                System.out.print("Enter your monthly budget: ");
                monthlyBudget = scanner.nextDouble();
                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        }



        System.out.println("Enter expenses type 0 to finish");

        while (true) {
            try {
                System.out.print("Amount: ");
                double expense = scanner.nextDouble();

                if (expense == 0) break;
                if (expense < 0) {
                    System.out.println("Invalid amount. Please greater than 0");
                    continue;
                }
                expenses.add(expense);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        }
        double totalExpenses =  calculateExpenses(expenses);
        double remainingBudget = calculateRemaining(totalExpenses, monthlyBudget);
        finalReport(totalExpenses, remainingBudget, monthlyBudget);
        scanner.close();
    }

    public static double calculateExpenses(ArrayList<Double> expenses) {
        double totalExpenses = 0;
        for (double g : expenses) totalExpenses += g;
        return totalExpenses;
    }

    public static double calculateRemaining(double total, double budget) {
        return budget - total;
    }

    public static void finalReport(double expenses, double remaining, double budget) {
        System.out.printf("Budget : ₱%.2f%n", budget);
        System.out.printf("Total expenses: ₱%.2f%n", expenses);
        //System.out.printf("Remaining budget: ₱%.2f%n", remaining);

        if (remaining == 0) System.out.println("No Budget left");
        if (remaining < 0) System.out.println("You are over your budget");
        if (remaining > 0) System.out.printf("Remaining Budget ₱%.2f%n", remaining);
    }

}
