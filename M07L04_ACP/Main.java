package M07L04_ACP;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Substring Frequency Counter ===");
        System.out.print("Enter the target string: ");
        String str = scanner.nextLine().trim();

        System.out.print("Enter the substring length (k): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid integer for k: ");
            scanner.next();
        }
        int k = scanner.nextInt();

        // Call the frequency calculation function
        Map<String, Integer> results = SubstringFrequency.getSubstringFrequencies(str, k);

        System.out.println("\n--- OUTPUT ---");
        if (results.isEmpty()) {
            System.out.println("No valid substrings found. Check if k is greater than string length or <= 0.");
        } else {
            System.out.println("Substrings of length " + k + " and their occurrences:");
            for (Map.Entry<String, Integer> entry : results.entrySet()) {
                System.out.println("\"" + entry.getKey() + "\" —> " + entry.getValue());
            }
        }

        scanner.close();
    }
}