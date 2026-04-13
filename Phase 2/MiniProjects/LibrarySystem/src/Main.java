import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> catalog = new ArrayList<>();

        catalog.add(new Book("Clean Code", "B001", "Robert Martin"));
        catalog.add(new Magazine("Java Magazine", "M99", 2026));

        System.out.println("=== Library Catalog ===");
        for (LibraryItem item : catalog) {
            item.displayDetails();
        }
        System.out.println("\nBorrowing an item...");
        catalog.get(0).borrowedItem();
    }
}
