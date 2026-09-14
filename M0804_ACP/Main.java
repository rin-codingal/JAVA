package M08L04_ACP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Unique String Element Finder ===");
        System.out.print("Enter the total number of elements (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer for N:");
            scanner.next();
        }
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        ArrayList<String> inputList = new ArrayList<>();
        System.out.println("Enter " + n + " string element(s):");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            String str = scanner.nextLine();
            inputList.add(str);
        }

        // Get new ArrayList containing unique elements
        ArrayList<String> uniqueList = UniqueElementFinder.findUniqueElements(inputList);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Original List: " + inputList);
        System.out.println("Unique Elements List: " + uniqueList);
        System.out.println("Is returned list a new object reference? " + (uniqueList != inputList));

        scanner.close();
    }
}