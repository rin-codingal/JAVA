package M08L06_ACP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    /**
     * Finds all unique combinations of candidates that sum up to the target.
     * Each candidate number can be selected an unlimited number of times.
     * 
     * @param candidates array of distinct integers
     * @param target     target sum
     * @return list of all unique combinations summing to target
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        // Sort candidates to optimize pruning during backtracking
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int remain, int start, List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Stop early if candidate exceeds remaining target sum
            if (candidates[i] > remain) {
                break;
            }

            current.add(candidates[i]);
            // Pass 'i' as start index to allow reusing the same candidate element
            backtrack(candidates, remain - candidates[i], i, current, result);
            current.remove(current.size() - 1); // Unchoose
        }
    }
}