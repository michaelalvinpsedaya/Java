public class LibraryItem {
    private String title;
    private String id;
    private boolean isBorrowed;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.isBorrowed = false;
    }
    public void borrowedItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been barrowed.");
        }
        else {
            System.out.println(title + "is already out");
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " | Title: " + title + " | Available: " + !isBorrowed);
    }
}
