package M06L03_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size of array N
        System.out.print("Enter size of array (N): ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        // 2. Read N unique elements into array A
        System.out.println("Enter " + n + " unique integers:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 3. Find sorted positions for each element
        int[] positions = SelectionSortIndices.getSortedPositions(a);

        // 4. Print results
        System.out.println("\nTarget sorted indices for each element:");
        for (int i = 0; i < n; i++) {
            System.out.print(positions[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();

        scanner.close();
    }
}