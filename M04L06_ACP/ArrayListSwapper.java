package M04L06_ACP;

import java.util.ArrayList;

public class ArrayListSwapper {

    /**
     * Swaps the first and last elements of an ArrayList of Strings.
     * Modifies and returns the ArrayList.
     * 
     * @param list the input ArrayList of Strings
     * @return the updated ArrayList with first and last elements swapped
     */
    public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
        // If the list is null, empty, or has only 1 element, no swap is needed
        if (list == null || list.size() <= 1) {
            return list;
        }

        int lastIndex = list.size() - 1;

        // Get first and last elements
        String first = list.get(0);
        String last = list.get(lastIndex);

        // Swap the elements
        list.set(0, last);
        list.set(lastIndex, first);

        return list;
    }
}