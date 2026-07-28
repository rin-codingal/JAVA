// Parent class demonstrating Method Overloading
class Printer {
    
    // Original Method
    public void print(String message) {
        System.out.println("Base Printer (String): " + message);
    }

    // OVERLOADING: Same name, different parameter type (int instead of String)
    public void print(int copies) {
        System.out.println("Base Printer (int): Printing " + copies + " page(s).");
    }
}

// Child class inheriting from Printer to demonstrate Method Overriding
class SmartPrinter extends Printer {

    // OVERRIDING: Same name, same parameters as the parent class method
    @Override
    public void print(String message) {
        System.out.println("SmartPrinter [Enhanced Output]: " + message.toUpperCase());
    }
}

// Main execution class
public class TestYourLearning {
    public static void main(String[] args) {
        // Instantiate the child class
        SmartPrinter myPrinter = new SmartPrinter();

        // 1. Testing Method Overloading (Resolved at Compile-Time)
        // Invokes the overloaded method inherited from the parent class
        myPrinter.print(5); 

        // 2. Testing Method Overriding (Resolved at Runtime)
        // Invokes the overridden method inside the child class
        myPrinter.print("Hello Java"); 
    }
}