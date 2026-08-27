package M05L03_ACP;

public class Main {
    public static void main(String[] args) {
        int n = 6; // Tower 1 has 6 disks

        String tower1 = "Tower 1"; // Source
        String tower2 = "Tower 2"; // Destination
        String tower3 = "Tower 3"; // Helper

        System.out.println("=== Instructions to solve Tower of Hanoi with " + n + " disks ===");
        System.out.println("Goal: Move from " + tower1 + " to " + tower2 + " using " + tower3 + "\n");

        // Call recursive solution
        TowerOfHanoi.solve(n, tower1, tower2, tower3);

        // Total moves calculation: (2^n - 1)
        int totalMoves = (int) Math.pow(2, n) - 1;
        System.out.println("\nTotal moves required: " + totalMoves);
    }
}