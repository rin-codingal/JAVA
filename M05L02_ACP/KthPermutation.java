package M05L02_ACP;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

    /**
     * Calculates the k-th permutation sequence for numbers from 1 to n.
     * Uses a factoradic / mathematical approach to find the result in O(n^2) time.
     * 
     * @param n total numbers [1, 2, ..., n]
     * @param k 1-based index of the permutation sequence
     * @return the k-th permutation sequence as a String
     */
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n];
        
        // Compute factorials and populate available numbers list
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Convert 1-based k to 0-based index
        k--;

        StringBuilder result = new StringBuilder();

        // Determine digits step by step
        for (int i = n; i >= 1; i--) {
            int blockFactorial = factorial[i - 1];
            int index = k / blockFactorial;

            result.append(numbers.get(index));
            numbers.remove(index); // Remove used number

            k %= blockFactorial; // Remaining k for next position
        }

        return result.toString();
    }
}