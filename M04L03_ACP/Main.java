package M04L03_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read dimensions for 1st matrix
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();

        // 2. Read elements for 1st matrix
        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                a1[i][j] = scanner.nextInt();
            }
        }

        // 3. Read dimensions for 2nd matrix
        int n2 = scanner.nextInt();
        int m2 = scanner.nextInt();

        // 4. Read elements for 2nd matrix
        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                a2[i][j] = scanner.nextInt();
            }
        }

        // 5. Multiply matrices and display output
        int[][] prd = MatrixMultiplication.multiply(a1, a2);

        if (prd == null) {
            System.out.println("Invalid input");
        } else {
            MatrixMultiplication.printMatrix(prd);
        }

        scanner.close();
    }
}