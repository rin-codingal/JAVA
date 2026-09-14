package M07L06_ACP;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    /**
     * Finds all possible partitions of string 's' where every substring is a palindrome.
     * 
     * @param s input string
     * @return a list of lists containing all valid palindrome partitions
     */
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        // Base case: processed the entire string
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                // Choose: add the palindromic substring
                currentList.add(s.substring(start, end + 1));
                
                // Explore: backtrack with the remaining substring
                backtrack(s, end + 1, currentList, result);
                
                // Unchoose: remove the last added substring
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    /**
     * Helper method to check if substring s[low...high] is a palindrome.
     */
    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}