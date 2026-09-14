package M08L02_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Median Calculator Program ===");
        System.out.print("Enter the number of elements in the array (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer:");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " space-separated integers:");

        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter an integer for index " + i + ":");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }

        double median = MedianCalculator.findMedian(arr);

        System.out.println("\n--- OUTPUT ---");
        // Print as integer if whole number, else print floating-point
        if (median == (long) median) {
            System.out.println("Median: " + (long) median);
        } else {
            System.out.println("Median: " + median);
        }

        scanner.close();
    }
}