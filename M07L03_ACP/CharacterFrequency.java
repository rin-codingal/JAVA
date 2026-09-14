package M07L03_ACP;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    /**
     * Counts the frequency of numeric (0-9) and special characters 
     * present in a given email string.
     * 
     * @param email input email ID
     * @return a Map containing non-alphabetic characters and their occurrence counts
     */
    public static Map<Character, Integer> findNumericAndSpecialFrequencies(String email) {
        // LinkedHashMap preserves insertion order for clean output
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        if (email == null) {
            return frequencyMap;
        }

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Filter out alphabetic characters (a-z, A-Z)
            if (!Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }
}