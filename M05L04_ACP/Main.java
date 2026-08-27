package M05L04_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size n
        System.out.print("Enter number of elements (n): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Read n numbers
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Find maximum using iterative function
        int maxIterative = ArrayMaxFinder.findMaxIterative(arr);

        // 4. Find maximum using recursive function (starting at index 0)
        int maxRecursive = ArrayMaxFinder.findMaxRecursive(arr, 0);

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Maximum (Iterative): " + maxIterative);
        System.out.println("Maximum (Recursive): " + maxRecursive);

        scanner.close();
    }
}