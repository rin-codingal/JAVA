package M07L01_ACP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ArrayList String Manipulation Program ===");
        System.out.print("Enter the number of characters (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer:");
            scanner.next();
        }
        int n = scanner.nextInt();

        ArrayList<Character> charList = new ArrayList<>();
        System.out.println("Enter " + n + " character(s) one by one:");

        for (int i = 0; i < n; i++) {
            System.out.print("Character " + (i + 1) + ": ");
            char ch = scanner.next().charAt(0);
            charList.add(ch);
        }

        // 1. Construct string from ArrayList
        String original = StringManipulator.buildStringFromList(charList);
        
        // 2. Find length
        int length = original.length();

        // 3. Reverse string
        String reversed = StringManipulator.reverseString(original);

        // 4. Split into two equal halves
        String[] halves = StringManipulator.splitIntoTwoWords(original);

        // Output results
        System.out.println("\n--- RESULTS ---");
        System.out.println("Constructed String: " + original);
        System.out.println("Length: " + length);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Word 1 (First Half): " + halves[0]);
        System.out.println("Word 2 (Second Half): " + halves[1]);

        scanner.close();
    }
}