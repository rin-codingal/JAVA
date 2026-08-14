package M04L02_ACP;

public class KadaneConcat {

    /**
     * Standard Kadane's Algorithm to find the maximum subarray sum in a single array.
     * 
     * @param arr the input array
     * @return the maximum contiguous subarray sum
     */
    public static long kadane(int[] arr) {
        long maxSoFar = arr[0];
        long currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max((long) arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    /**
     * Computes the maximum subarray sum for array B (A concatenated K times).
     * 
     * @param arr the original array A
     * @param k   the number of concatenations
     * @return maximum subarray sum of concatenated array B
     */
    public static long maxSubarraySumConcat(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return 0;
        }

        // 1. Calculate sum of a single copy of array A
        long sumA = 0;
        for (int val : arr) {
            sumA += val;
        }

        // 2. If K = 1, simply return standard Kadane's result on A
        if (k == 1) {
            return kadane(arr);
        }

        // 3. Create array concatenated twice: A + A
        int n = arr.length;
        int[] doubleArr = new int[n * 2];
        for (int i = 0; i < n; i++) {
            doubleArr[i] = arr[i];
            doubleArr[i + n] = arr[i];
        }

        // 4. Calculate Kadane's result on A + A
        long maxTwo = kadane(doubleArr);

        // 5. If overall sum of A is positive, we can include (K - 2) full copies of A
        if (sumA > 0) {
            return maxTwo + (k - 2) * sumA;
        } else {
            return maxTwo;
        }
    }
}
