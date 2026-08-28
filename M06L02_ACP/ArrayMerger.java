package M06L02_ACP;

public class ArrayMerger {

    /**
     * Sorts an array using the Bubble Sort algorithm.
     * 
     * @param arr the input array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped in the inner loop, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Merges two sorted arrays into a single sorted array using a two-pointer technique.
     * 
     * @param a first sorted array
     * @param b second sorted array
     * @return merged sorted array
     */
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and pick the smaller element
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[], if any
        while (i < a.length) {
            merged[k++] = a[i++];
        }

        // Copy remaining elements of b[], if any
        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }
}