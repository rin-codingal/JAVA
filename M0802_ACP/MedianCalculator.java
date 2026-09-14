package M08L02_ACP;

import java.util.Arrays;

public class MedianCalculator {

    /**
     * Calculates the median value of an array of integers.
     * Sorts the array first to locate central elements.
     * 
     * @param arr input array of integers
     * @return median value as a double
     */
    public static double findMedian(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        // Clone array to prevent modifying the original array
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int n = sorted.length;
        if (n % 2 != 0) {
            // Odd length: middle element
            return sorted[n / 2];
        } else {
            // Even length: average of the two middle elements
            return (sorted[(n / 2) - 1] + sorted[n / 2]) / 2.0;
        }
    }
}