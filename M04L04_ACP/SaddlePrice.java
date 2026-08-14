package M04L04_ACP;

public class SaddlePrice {

    /**
     * Finds the saddle price in an n x n square matrix.
     * A saddle price is defined as the minimum value in its row 
     * AND the maximum value in its column.
     * 
     * @param matrix the n x n 2D array
     */
    public static void findAndPrintSaddlePrice(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Step 1: Find the minimum element in row i
            int minColIndex = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minColIndex]) {
                    minColIndex = j;
                }
            }

            // Step 2: Check if this minimum element is the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < n; k++) {
                if (matrix[k][minColIndex] > matrix[i][minColIndex]) {
                    isSaddlePoint = false;
                    break;
                }
            }

            // Step 3: If it is the maximum in its column, we found the saddle price
            if (isSaddlePoint) {
                System.out.println(matrix[i][minColIndex]);
                return;
            }
        }

        // If no element satisfies the condition
        System.out.println("No saddle point");
    }
}