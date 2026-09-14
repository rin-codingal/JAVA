package M08L03_ACP;

public class SecondLargestFinder {

    /**
     * Finds the second-largest element in an integer array.
     * 
     * @param arr input array of integers
     * @return the second-largest element, or -1 if the array has fewer than 2 elements or no distinct second largest
     */
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If no distinct second largest element exists (e.g., all elements are equal)
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}