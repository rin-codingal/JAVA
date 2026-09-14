package M07L03_ACP;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Email Numeric & Special Character Frequency Counter ===");
        System.out.print("Enter an email ID: ");

        String email = scanner.nextLine().trim();

        // Compute frequencies of non-alphabetic characters
        Map<Character, Integer> result = CharacterFrequency.findNumericAndSpecialFrequencies(email);

        System.out.println("\n--- OUTPUT ---");
        if (result.isEmpty()) {
            System.out.println("No numeric or special characters found.");
        } else {
            for (Map.Entry<Character, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + " —> " + entry.getValue());
            }
        }

        scanner.close();
    }
}