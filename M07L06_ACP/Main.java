package M07L06_ACP;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Partitioning Program ===");
        System.out.print("Enter target string (s): ");

        String s = scanner.nextLine().trim();

        // Compute all palindrome partitions
        List<List<String>> partitions = PalindromePartitioning.partition(s);

        // Display results matching standard format
        System.out.println("\n--- OUTPUT ---");
        System.out.println(partitions);

        scanner.close();
    }
}