package M06L04_ACP;

public class InsertionSortTracker {

    /**
     * Finds the 1-based index where each element A[i] will end up when the array is sorted.
     * Uses Insertion Sort principles to determine final positions.
     * 
     * @param arr array of unique integers
     * @return array containing 1-based final sorted positions for each element
     */
    public static int[] getSortedPositions(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // For each element, count elements smaller than it to get 1-based target position
        for (int i = 0; i < n; i++) {
            int smallerCount = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < arr[i]) {
                    smallerCount++;
                }
            }
            // 1-based index is smallerCount + 1
            result[i] = smallerCount + 1;
        }

        return result;
    }

    /**
     * Demonstrates Insertion Sort in-place on an array.
     * 
     * @param arr array to be sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead of current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}