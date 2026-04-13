public class Magazine extends LibraryItem {
    private  int issueNumber;


    public Magazine(String title, String id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Issue #: " + issueNumber);
    }
}
