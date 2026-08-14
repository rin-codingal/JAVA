package M04L03_ACP;

public class MatrixMultiplication {

    /**
     * Multiplies two matrices a1 and a2 if their dimensions are compatible.
     * 
     * @param a1 matrix 1 of dimension n1 x m1
     * @param a2 matrix 2 of dimension n2 x m2
     * @return the resulting product matrix of dimension n1 x m2, or null if multiplication is impossible
     */
    public static int[][] multiply(int[][] a1, int[][] a2) {
        int n1 = a1.length;
        int m1 = a1[0].length;
        int n2 = a2.length;
        int m2 = a2[0].length;

        // Matrix multiplication condition: columns of matrix 1 must equal rows of matrix 2
        if (m1 != n2) {
            return null;
        }

        int[][] prd = new int[n1][m2];

        // Perform standard matrix multiplication
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    prd[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        return prd;
    }

    /**
     * Utility method to print matrix contents.
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}