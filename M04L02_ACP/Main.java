package M04L02_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read array size N
        System.out.print("Enter size of array A (N): ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        // 2. Read N elements of array A
        System.out.println("Enter " + n + " elements of array A:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 3. Read concatenation factor K
        System.out.print("Enter number of concatenations (K): ");
        int k = scanner.nextInt();

        // 4. Compute maximum subarray sum using KadaneConcat
        long result = KadaneConcat.maxSubarraySumConcat(a, k);

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Maximum Subarray Sum for B: " + result);

        scanner.close();
    }
}