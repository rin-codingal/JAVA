package M08L03_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Second Largest Element Finder ===");
        System.out.print("Enter the number of elements in the array (N): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer for N:");
            scanner.next();
        }
        int n = scanner.nextInt();

        int[] arr = new int[n];
        if (n > 0) {
            System.out.println("Enter " + n + " space-separated integers:");
            for (int i = 0; i < n; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Enter an integer for index " + i + ":");
                    scanner.next();
                }
                arr[i] = scanner.nextInt();
            }
        }

        int result = SecondLargestFinder.findSecondLargest(arr);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Second Largest Element: " + result);

        scanner.close();
    }
}