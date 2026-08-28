package M06L04_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size of array N
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.print("");

        // 2. Read N unique elements into array A
        System.out.print("Enter elements for the array separated with spaces: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println();

        // 3. Compute 1-based sorted positions for each element
        int[] positions = InsertionSortTracker.getSortedPositions(a);

        // 4. Print results space-separated
        System.out.print("The result: ");
        for (int i = 0; i < n; i++) {
            System.out.print(positions[i] + (i == n - 1 ? "" : " "));
        }

        System.out.println();

        scanner.close();
    }
}