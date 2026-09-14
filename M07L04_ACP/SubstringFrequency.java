package M07L04_ACP;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubstringFrequency {

    /**
     * Determines the number of occurrences of all contiguous substrings 
     * of length 'k' present in the input string.
     * 
     * @param str the input string
     * @param k   the fixed length of the substrings
     * @return a Map containing each unique substring of length k and its count
     */
    public static Map<String, Integer> getSubstringFrequencies(String str, int k) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        // Edge case checks for invalid string or length parameters
        if (str == null || k <= 0 || k > str.length()) {
            return frequencyMap;
        }

        // Slide a window of size k across the string
        for (int i = 0; i <= str.length() - k; i++) {
            String sub = str.substring(i, i + k);
            frequencyMap.put(sub, frequencyMap.getOrDefault(sub, 0) + 1);
        }

        return frequencyMap;
    }
}