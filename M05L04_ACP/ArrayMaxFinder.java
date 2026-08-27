package M05L04_ACP;

public class ArrayMaxFinder {

    /**
     * Finds the maximum element in an array using an iterative approach.
     * 
     * @param arr the input array
     * @return maximum value in the array
     */
    public static int findMaxIterative(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * Finds the maximum element in an array using a recursive approach.
     * 
     * @param arr the input array
     * @param idx current index being evaluated
     * @return maximum value in the array from index `idx` onward
     */
    public static int findMaxRecursive(int[] arr, int idx) {
        // Base case: when we reach the last element, it is the max of that sub-array
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // Recursive step: compare current element with the max of the remaining elements
        int maxInRest = findMaxRecursive(arr, idx + 1);
        return Math.max(arr[idx], maxInRest);
    }
}