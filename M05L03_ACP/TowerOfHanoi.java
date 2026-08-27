package M05L03_ACP;

public class TowerOfHanoi {

    /**
     * Recursively prints the instructions to move 'n' disks from a source tower to a destination tower
     * using a helper (auxiliary) tower.
     * 
     * @param n          number of disks to move
     * @param src        the source tower identifier
     * @param dest       the destination tower identifier
     * @param helper     the helper/auxiliary tower identifier
     */
    public static void solve(int n, String src, String dest, String helper) {
        // Base case: If there are no disks to move, return
        if (n == 0) {
            return;
        }

        // Step 1: Move top (n - 1) disks from source to helper tower using destination tower
        solve(n - 1, src, helper, dest);

        // Step 2: Move the nth (largest) disk directly from source to destination tower
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Step 3: Move the (n - 1) disks from helper tower to destination tower using source tower
        solve(n - 1, helper, dest, src);
    }
}