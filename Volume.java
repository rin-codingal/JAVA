import java.util.Scanner;

class Shapes {
    public double getVolume() {
      return 0;
    }
}

// A cube with with a specific side
class Cube extends Shapes {   // extended form the Shape class
    private double side;

    public Cube(double s) {
      this.side = s;
    }

    public double getVolume() {//volume of Cube s*s*s
      return side * side * side; 
    }
}

// A Sphere is a Shape  with a specific radius
class Sphere extends Shapes {
    private double radius;
    
    public Sphere(double r) {
      this.radius = r; 
    }
    public double getVolume() { //volume of sphere
      return 4/3 * (3.14 * radius * radius * radius); 
    }
}

// A Cylinder is a Shape with a radius and height
class Cylinder extends Shapes {
    private double radius;
    private double height;
    
    public Cylinder(double r, double h) {
      this.radius = r; 
      this.height = h;
    }
    public double getVolume() { // volume of cylinder
      return 3.14 * radius * radius * height; 
    }
}

public class Volume {
    public static void main(String args[]) {
        //Shape[] shape = new Shape[2]; // Creating shape array of size 2
        Shapes shape = new Shapes();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. for area of Cube");
        System.out.println("2. for area of Sphere");
        System.out.println("3. for area of Cylinder");
        System.out.println("");

        System.out.print("Your choice: ");
	    int choice = sc.nextInt();

        if (choice == 1){ // Cube
            System.out.print("Enter the Cube side: ");
            int side = sc.nextInt();
            shape = new Cube(side);

            System.out.println("Volume of the Cube: " + shape.getVolume());
        }
        else if (choice == 2) { // Sphere
            System.out.print("Enter the Sphere radius: ");
            int sRad = sc.nextInt();
            shape = new Sphere(sRad);

            System.out.println("Volume of the Sphere: " + shape.getVolume());
        }
        else if (choice == 3) { // Cylinder
            System.out.print("Enter the cylinder radius: ");
            int cRad = sc.nextInt();

            System.out.print("Enter the cylinder height: ");
            int cHeight = sc.nextInt();

            shape = new Cylinder(cRad, cHeight);

            System.out.println("Volume of the cylinder: " + shape.getVolume());
        }

        System.out.println("");
    }
}
