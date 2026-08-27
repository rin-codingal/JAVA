package M05L05_ACP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read number of stairs
        System.out.print("Enter number of stairs (n): ");
        int n = scanner.nextInt();

        // 2. Compute paths
        ArrayList<String> paths = StairPaths.getStairPaths(n);

        // 3. Display output
        System.out.println("\nAll possible paths to climb " + n + " stairs:");
        System.out.println(paths);

        System.out.println("Total number of ways: " + paths.size());

        scanner.close();
    }
}