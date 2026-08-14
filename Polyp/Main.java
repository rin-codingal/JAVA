package Polyp;

// Main class with test code
public class Main {
    public static void main(String[] args) {
    // Create an array of shapes (polymorphism)
    Shape[] shapes = new Shape[2];
    shapes[0] = new Rectangle(2, 4); // Area = 8
    shapes[1] = new Circle(3); // Area = 28.2743

    // Calculate total area
    AreaCalculator calculator = new AreaCalculator();
    double totalArea = calculator.sumAreas(shapes);

    // Print result
    System.out.println("Total area: " + totalArea);
    }
}
