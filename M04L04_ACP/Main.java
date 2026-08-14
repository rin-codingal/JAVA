package M04L04_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read matrix size n
        int n = scanner.nextInt();

        // 2. Read n x n elements of the matrix
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 3. Find and print the saddle price
        SaddlePrice.findAndPrintSaddlePrice(matrix);

        scanner.close();
    }
}