package M08L05_ACP;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Letter Case Permutation Program ===");
        System.out.print("Enter target string (s): ");

        String s = scanner.nextLine().trim();

        List<String> permutations = LetterCasePermutation.letterCasePermutation(s);

        System.out.println("\n--- OUTPUT ---");
        System.out.println(permutations);

        scanner.close();
    }
}