import java.util.Scanner;

public class NumberRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number and rotation positions
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter number of rotations (positive for right, negative for left): ");
        int rotation = scanner.nextInt();

        int temp = number;
        int count = 0;

        // Loop 1: Count the total number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Handle cases where rotation is greater than digit count or negative
        rotation = rotation % count;
        if (rotation < 0) {
            rotation = rotation + count; // Convert left rotation to equivalent right rotation
        }

        // Loop 2: Rotate the number step-by-step
        int rotatedNumber = number;
        int i = 0;
        while (i < rotation) {
            int lastDigit = rotatedNumber % 10;
            int remainingPart = rotatedNumber / 10;
            
            // Move the last digit to the front
            rotatedNumber = (lastDigit * (int) Math.pow(10, count - 1)) + remainingPart;
            i++;
        }

        System.out.println("Rotated Number: " + rotatedNumber);
        scanner.close();
    }
}