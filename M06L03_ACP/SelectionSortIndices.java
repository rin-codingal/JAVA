package M06L03_ACP;

public class SelectionSortIndices {

    /**
     * Finds the 0-based index where each element A[i] would be located 
     * if the array were fully sorted in ascending order.
     * 
     * @param arr array of unique integers
     * @return an array containing the target sorted position for each element at index i
     */
    public static int[] getSortedPositions(int[] arr) {
        int n = arr.length;
        int[] sortedIndices = new int[n];

        // For each element, count how many elements in the array are strictly smaller.
        // The count of smaller elements equals its index in the sorted array.
        for (int i = 0; i < n; i++) {
            int smallerCount = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    smallerCount++;
                }
            }
            sortedIndices[i] = smallerCount;
        }

        return sortedIndices;
    }
}