package M08L05_ACP;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    /**
     * Generates all possible string permutations by transforming letter cases.
     * Digits remain unchanged.
     * 
     * @param s input string
     * @return a List of all valid case permutations
     */
    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        if (s == null) {
            return result;
        }
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        // If current character is a letter, explore both lowercase and uppercase options
        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        } else {
            // For digits and special characters, move to next position directly
            backtrack(chars, index + 1, result);
        }
    }
}