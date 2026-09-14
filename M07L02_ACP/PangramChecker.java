package M07L02_ACP;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    /**
     * Checks whether the given string is a Pangram.
     * A pangram contains every letter of the English alphabet (a-z), case-insensitive.
     * 
     * @param str input sentence or string
     * @return true if the string is a pangram, false otherwise
     */
    public static boolean isPangram(String str) {
        if (str == null) {
            return false;
        }

        Set<Character> alphabetSet = new HashSet<>();

        // Normalize string to lowercase
        String lowerStr = str.toLowerCase();

        // Add all alphabet characters 'a' through 'z' to the set
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetSet.add(ch);
            }
        }

        // English alphabet contains 26 unique letters
        return alphabetSet.size() == 26;
    }
}