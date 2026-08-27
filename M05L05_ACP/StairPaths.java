package M05L05_ACP;

import java.util.ArrayList;

public class StairPaths {

    /**
     * Recursively computes all paths to reach the n-th stair from the bottom (0-th stair).
     * Allowed jumps are 1, 2, or 3 steps at a time.
     * 
     * @param n total number of stairs
     * @return an ArrayList of Strings representing all possible paths
     */
    public static ArrayList<String> getStairPaths(int n) {
        // Base Case 1: Successfully reached the destination (stair 0)
        if (n == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(""); // Empty string represents 1 valid path of 0 steps
            return baseResult;
        }

        // Base Case 2: Overshot the stairs (negative stair count)
        if (n < 0) {
            return new ArrayList<>(); // Return empty list (invalid path)
        }

        // Recursive calls for jumps of 1, 2, and 3 steps
        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> myPaths = new ArrayList<>();

        // Append '1' to all paths derived from taking 1 step
        for (String path : paths1) {
            myPaths.add("1" + path);
        }

        // Append '2' to all paths derived from taking 2 steps
        for (String path : paths2) {
            myPaths.add("2" + path);
        }

        // Append '3' to all paths derived from taking 3 steps
        for (String path : paths3) {
            myPaths.add("3" + path);
        }

        return myPaths;
    }
}