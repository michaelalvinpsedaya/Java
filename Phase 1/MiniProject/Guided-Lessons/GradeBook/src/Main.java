import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("\n--- Student Grade Book System ---/n");
        System.out.println("Enter grades. (Type -1 to finish) :");

        while (true) {
            try {
                System.out.print("Grade: ");
                double grade = scanner.nextDouble();

                if (grade == -1) break;

                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter 0 - 100");
                    continue;
                }
                grades.add(grade);

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next(); // Clear the invalid input
            }
        }
        displayResult(grades);
        scanner.close();
    }
    public static void displayResult(ArrayList<Double> grades) {
        if (grades.isEmpty()) {
            System.out.println("No Grades Recorded");
            return;
        }

        double sum = 0;
        for (double g : grades) sum += g;
        double average = sum / grades.size();

        System.out.println("---Final Report ---\n");
        System.out.println("Total Students: " +  grades.size());
        System.out.printf("Class Average: %.2f%n", average);


    }
}
