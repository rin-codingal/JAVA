package M04L06_ACP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Demo 1: Example from the instructions ---
        ArrayList<String> sampleList = new ArrayList<>();
        sampleList.add("hello");
        sampleList.add("world");

        System.out.println("Original Sample List: " + sampleList);
        ArrayListSwapper.swapFirstLast(sampleList);
        System.out.println("Swapped Sample List:  " + sampleList);

        System.out.println("\n-----------------------------------\n");

        // --- Demo 2: User Input ---
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ArrayList<String> userList = new ArrayList<>();
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            userList.add(scanner.nextLine());
        }

        System.out.println("\nOriginal User List: " + userList);
        ArrayListSwapper.swapFirstLast(userList);
        System.out.println("Swapped User List:  " + userList);

        scanner.close();
    }
}