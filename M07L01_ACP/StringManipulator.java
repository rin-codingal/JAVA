package M07L01_ACP;

import java.util.ArrayList;

public class StringManipulator {

    /**
     * Constructs a String from an ArrayList of Character objects.
     */
    public static String buildStringFromList(ArrayList<Character> charList) {
        StringBuilder sb = new StringBuilder();
        for (char ch : charList) {
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * Reverses the given input String.
     */
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Splits the string into two equal halves.
     * If the string length is odd, the first half gets the extra character.
     * 
     * @param input the constructed string
     * @return array of 2 String halves
     */
    public static String[] splitIntoTwoWords(String input) {
        int mid = (input.length() + 1) / 2;
        String word1 = input.substring(0, mid);
        String word2 = input.substring(mid);
        return new String[]{word1, word2};
    }
}