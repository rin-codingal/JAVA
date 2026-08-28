package M06L06_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Reverse Pairs Counter using Merge Sort ===");
        System.out.println("Condition: Pair (i, j) where i < j and nums[i] > 2 * nums[j]");
        System.out.print("Enter the number of elements in the array (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer for N:");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " space-separated integers for the array:");

        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid element at index " + i + ". Enter an integer:");
                scanner.next();
            }
            nums[i] = scanner.nextInt();
        }

        int result = MergeSortReversePairs.reversePairs(nums);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Number of Reverse Pairs: " + result);

        scanner.close();
    }
}