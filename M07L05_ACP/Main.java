package M07L05_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== String Pattern Matcher ===");
        System.out.println("Enter pattern P and text T on separate lines:");

        String p = scanner.nextLine();
        String t = scanner.nextLine();

        int result = PatternMatcher.countOccurrences(p, t);

        System.out.println("\n--- OUTPUT ---");
        System.out.println(result);

        scanner.close();
    }
}