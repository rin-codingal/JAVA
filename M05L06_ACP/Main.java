package M05L06_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size n
        int n = scanner.nextInt();

        // 2. Read n numbers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Read target sum
        int tar = scanner.nextInt();

        // 4. Print subsets matching target sum
        TargetSumSubsets.printTargetSumSubsets(arr, 0, "", 0, tar);

        scanner.close();
    }
}