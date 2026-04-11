import java.util.ArrayList;

public class Main {
    public  static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(10.0, 4.0));

        System.out.println("=== Shape Area Calculator ===");

        for (Shape s : shapes) {
            System.out.printf("%s Area: %.2f%n", s.getname(), s.calculateArea());
        }
    }
}
