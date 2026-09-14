package M08L01_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Find Column with Minimum Zeros ===");
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int colIndex = MinZeroColumnFinder.findColumnWithMinZeros(matrix);

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Column index with minimum zeros (0-based): " + colIndex);

        scanner.close();
    }
}