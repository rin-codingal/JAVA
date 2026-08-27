package M05L06_ACP;

public class TargetSumSubsets {

    /**
     * Recursively calculates and prints all subsets whose sum equals the target.
     * Matches the standard competitive programming signature.
     * 
     * @param arr the input array of numbers
     * @param idx current index being processed
     * @param set string representation of current subset
     * @param sos sum of elements currently in 'set'
     * @param tar the target sum
     */
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        // Base Case: when all elements have been processed
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }

        // Option 1: Include the current element arr[idx]
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);

        // Option 2: Exclude the current element arr[idx]
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }
}