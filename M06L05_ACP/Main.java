package M06L05_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Quick Sort Apple Traversal Program ===");
        System.out.print("Enter the total number of apples (N): ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for N:");
            scanner.next();
        }
        int n = scanner.nextInt();

        Apple[] apples = new Apple[n];

        System.out.println("Enter the coordinates (X Y) for each of the " + n + " apples:");
        System.out.println("(Example: Enter '1 4' and press Enter for each apple)");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Apple " + (i + 1) + " (X Y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            apples[i] = new Apple(x, y, i);
        }

        // Sort using Quick Sort implementation
        QuickSorter.quickSort(apples, 0, n - 1);

        // Map sorted position back to the apple's original input index
        int[] results = new int[n];
        for (int sortedIndex = 0; sortedIndex < n; sortedIndex++) {
            results[apples[sortedIndex].originalIndex] = sortedIndex;
        }

        System.out.println("\n--- OUTPUT (Apples eaten before each respective apple) ---");
        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }

        scanner.close();
    }
}