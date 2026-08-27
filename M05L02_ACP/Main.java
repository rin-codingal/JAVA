package M05L02_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read n and k
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter k: ");
        int k = scanner.nextInt();

        // 2. Compute the k-th permutation
        String ans = KthPermutation.getPermutation(n, k);

        // 3. Display output
        System.out.println("\nThe " + k + "-th permutation sequence for n = " + n + " is: " + ans);

        scanner.close();
    }
}