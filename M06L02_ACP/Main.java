package M06L02_ACP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first array line
        System.out.print("Enter elements for first array separated with spaces: ");
        String[] line1 = scanner.nextLine().trim().split("\\s+");
        int[] arr1 = new int[line1.length];
        for (int i = 0; i < line1.length; i++) {
            arr1[i] = Integer.parseInt(line1[i]);
        }

        System.out.print("");

        // Read second array line
        System.out.print("Enter elements for second array separated with spaces: ");
        String[] line2 = scanner.nextLine().trim().split("\\s+");
        int[] arr2 = new int[line2.length];
        for (int i = 0; i < line2.length; i++) {
            arr2[i] = Integer.parseInt(line2[i]);
        }

        System.out.println();

        // 1. Sort both arrays using Bubble Sort
        ArrayMerger.bubbleSort(arr1);
        ArrayMerger.bubbleSort(arr2);

        // 2. Merge sorted arrays
        int[] mergedArr = ArrayMerger.mergeSortedArrays(arr1, arr2);

        // 3. Print the merged sorted result
        System.out.print("The sorted array: ");
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + (i == mergedArr.length - 1 ? "" : " "));
        }

        System.out.println();

        scanner.close();
    }
}