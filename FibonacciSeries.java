import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(firstTerm + " ");
            
            // Compute the next term in the sequence
            int nextTerm = firstTerm + secondTerm;
            
            // Shift values for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        // Close the scanner resource
        sc.close();
    }
}