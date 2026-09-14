package M08L04_ACP;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElementFinder {

    /**
     * Extracts and returns all unique elements from an input ArrayList of Strings.
     * Preserves insertion order and returns a brand-new ArrayList instance.
     * 
     * @param inputList original list of strings
     * @return new ArrayList containing only unique strings
     */
    public static ArrayList<String> findUniqueElements(ArrayList<String> inputList) {
        if (inputList == null) {
            return new ArrayList<>();
        }

        // LinkedHashSet preserves the original insertion order while removing duplicates
        Set<String> uniqueSet = new LinkedHashSet<>(inputList);

        // Return a brand-new ArrayList created from the set
        return new ArrayList<>(uniqueSet);
    }
}