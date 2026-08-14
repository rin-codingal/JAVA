package M03L04ACP;

public class WordMatch {

    /** The secret string. */
    private String secret;

    /** Constructs a WordMatch object with the given secret string of lowercase letters. */
    public WordMatch(String word) {
        this.secret = word;
    }

    /** 
     * Returns a score for guess, as described in part (a).
     * Precondition: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess) {
        int count = 0;
        int len = guess.length();

        // Loop through all possible substring starting indices in secret
        for (int i = 0; i <= secret.length() - len; i++) {
            if (secret.substring(i, i + len).equals(guess)) {
                count++;
            }
        }

        // Score = (Number of occurrences) * (length of guess)^2
        return count * len * len;
    }

    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     *               guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if (score1 > score2) {
            return guess1;
        } else if (score2 > score1) {
            return guess2;
        } else {
            // Tie-breaker: return the alphabetically greater string
            return (guess1.compareTo(guess2) > 0) ? guess1 : guess2;
        }
    }

    // Main method to test and verify all examples from the problem description
    public static void main(String[] args) {
        System.out.println("=== Part (a) Tests: secret = \"mississippi\" ===");
        WordMatch game1 = new WordMatch("mississippi");

        System.out.println("scoreGuess(\"i\"): " + game1.scoreGuess("i"));                   // Expected: 4

        System.out.println("scoreGuess(\"iss\"): " + game1.scoreGuess("iss"));               // Expected: 18

        System.out.println("scoreGuess(\"issipp\"): " + game1.scoreGuess("issipp"));         // Expected: 36

        System.out.println("scoreGuess(\"mississippi\"): " + game1.scoreGuess("mississippi")); // Expected: 121

        System.out.println("\n=== Part (b) Tests: secret = \"concatenation\" ===");
        WordMatch game2 = new WordMatch("concatenation");

        System.out.println("scoreGuess(\"ten\"): " + game2.scoreGuess("ten"));               // Expected: 9
        System.out.println("scoreGuess(\"nation\"): " + game2.scoreGuess("nation"));         // Expected: 36
        System.out.println("findBetterGuess(\"ten\", \"nation\"): " 
                           + game2.findBetterGuess("ten", "nation"));                         // Expected: "nation"

        System.out.println("scoreGuess(\"con\"): " + game2.scoreGuess("con"));               // Expected: 9

        System.out.println("scoreGuess(\"cat\"): " + game2.scoreGuess("cat"));               // Expected: 9
        
        System.out.println("findBetterGuess(\"con\", \"cat\"): " 
                           + game2.findBetterGuess("con", "cat"));                           // Expected: "con"
    }
}