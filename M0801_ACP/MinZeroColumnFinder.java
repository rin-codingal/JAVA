package M08L01_ACP;

public class MinZeroColumnFinder {

    /**
     * Finds the 0-based column index that contains the minimum number of zeros in a 2D array.
     * 
     * @param matrix 2D integer array
     * @return index of the column with the minimum number of zeros
     */
    public static int findColumnWithMinZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty.");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int minZeroCount = Integer.MAX_VALUE;
        int minColIndex = 0;

        // Iterate column by column
        for (int j = 0; j < cols; j++) {
            int zeroCount = 0;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }

            // Update column index if a new minimum zero count is found
            if (zeroCount < minZeroCount) {
                minZeroCount = zeroCount;
                minColIndex = j;
            }
        }

        return minColIndex;
    }
}