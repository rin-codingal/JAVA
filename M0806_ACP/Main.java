package M08L06_ACP;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Combination Sum Finder ===");
        System.out.print("Enter number of candidates (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer:");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] candidates = new int[n];
        System.out.println("Enter " + n + " distinct space-separated candidates:");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        // Calculate unique combination sums
        List<List<Integer>> result = CombinationSum.combinationSum(candidates, target);

        System.out.println("\n--- OUTPUT ---");
        System.out.println(result);

        scanner.close();
    }
}