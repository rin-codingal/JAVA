package M07L02_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pangram Checker Program ===");
        System.out.println("Enter a sentence to check if it contains all English letters (a-z):");

        String input = scanner.nextLine();

        boolean result = PangramChecker.isPangram(input);

        System.out.println("\n--- OUTPUT ---");
        if (result) {
            System.out.println("\"" + input + "\" is a Pangram");
            System.out.println("Explanation: Contains all the characters from 'a' to 'z'");
        } else {
            System.out.println("\"" + input + "\" is NOT a Pangram");
        }

        scanner.close();
    }
}