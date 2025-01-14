import java.util.Scanner;

class Shape {
    public double getArea() {
      return 0;
    }
}

// A triangle with base and height
class Triangle extends Shape {   // extended form the Shape class
    private double base;
    private double height;

    public Triangle(double b, double h) {
      this.base = b;
      this.height = h;
    }
    public double getArea() {//area of triangle 1/2*b*h 
      return 0.5 * base * height; 
    }
}

// A SQUARE is a Shape with a specific side
class Square extends Shape {
    private double side;
    
    public Square(double s) {
      this.side = s; 
    }
    public double getArea() {
      return side * side; 
    }
}

public class Area {
    public static void main(String args[]) {
        //Shape[] shape = new Shape[2]; // Creating shape array of size 2
        Shape shape = new Shape();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. for area of square");
        System.out.println("2. for area of triangle");
        System.out.println("");

        System.out.print("Your choice: ");
	    int choice = sc.nextInt();

        if (choice == 1){ // square
            System.out.print("Enter the square side: ");
            int side = sc.nextInt();
            shape = new Square(side);

            System.out.println("Area of the Square: " + shape.getArea());
        }
        else if (choice == 2) { // triangle
            System.out.print("Enter the triangle base: ");
            int tBase = sc.nextInt();

            System.out.print("Enter the triangle height: ");
            int tHeight = sc.nextInt();
            shape = new Triangle(tBase,tHeight);

            System.out.println("Area of the Triangle: " + shape.getArea());
        }

        System.out.println("");


        //instead of hardcoding the input we can take input from user also
        //a switch case could be created press 1 for area of square press 2 for area of triangle
        //shape[0] = new Square(5); // creating circle object at index 0
        //shape[1] = new Triangle(2, 2); // creating rectangle object at index 1

        // Shape object is calling children classes method
        //System.out.println("Area of the Square: " + shape[0].getArea());
        //System.out.println("Area of the Triangle: " + shape[1].getArea());
    }
}
