package M05L01_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read positive integer n
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print Zig-Zag recursion output
        ZigZag.pzz(n);
        System.out.println();

        scanner.close();
    }
}