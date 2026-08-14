package M04L01_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size of array n
        System.out.print("Enter array size n: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        // 2. Read n elements into array a
        System.out.println("Enter " + n + " elements (values from 0 to " + (n - 1) + "):");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 3. Calculate inverse array
        int[] inv = ArrayInverse.inverse(a);

        // Display results
        System.out.println("\nOriginal Array:");
        printArray(a);

        System.out.println("Inverted Array:");
        printArray(inv);

        scanner.close();
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}