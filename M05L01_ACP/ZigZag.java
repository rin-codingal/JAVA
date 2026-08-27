package M05L01_ACP;

public class ZigZag {

    /**
     * Recursively prints the Euler tour pattern (Zig-Zag) for a given number n.
     * Pattern flow: Pre-area call, Left recursion, In-area call, Right recursion, Post-area call.
     * 
     * @param n the positive integer to process
     */
    public static void pzz(int n) {
        if (n == 0) {
            return;
        }

        // Pre-area
        System.out.print(n + " ");

        // Left recursion
        pzz(n - 1);

        // In-area
        System.out.print(n + " ");

        // Right recursion
        pzz(n - 1);

        // Post-area
        System.out.print(n + " ");
    }
}