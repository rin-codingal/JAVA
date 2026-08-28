package M06L01_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read size of array n
        int n = scanner.nextInt();

        // 2. Read n numbers into array (sorted denominations)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Read requested denomination d
        int d = scanner.nextInt();

        // 4. Find and print ceil and floor
        BrokenEconomy.findCeilAndFloor(arr, d);

        scanner.close();
    }
}