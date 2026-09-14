package M07L05_ACP;

public class PatternMatcher {

    /**
     * Counts the total number of occurrences of pattern P in target text T.
     * The search is case-sensitive.
     * 
     * @param p pattern string to find
     * @param t text string to search within
     * @return count of occurrences of P in T
     */
    public static int countOccurrences(String p, String t) {
        if (p == null || t == null || p.isEmpty() || t.isEmpty() || p.length() > t.length()) {
            return 0;
        }

        int count = 0;
        int pLen = p.length();
        int tLen = t.length();

        // Slide a window of length P across text T
        for (int i = 0; i <= tLen - pLen; i++) {
            if (t.substring(i, i + pLen).equals(p)) {
                count++;
            }
        }

        return count;
    }
}