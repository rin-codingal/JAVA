package Polyp;

// AreaCalculator class
class AreaCalculator {
    public double sumAreas(Shape[] shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
    totalArea += shape.getArea();
    }
    return totalArea;
    }
}
