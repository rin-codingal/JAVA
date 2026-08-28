package M06L01_ACP;

public class BrokenEconomy {

    /**
     * Finds and prints the ceil and floor of a target denomination 'd' in a sorted array.
     * Uses Binary Search for O(log n) efficiency.
     * 
     * - Ceil: Smallest element in the array >= d (nearest maximum)
     * - Floor: Largest element in the array <= d (nearest minimum)
     * 
     * @param arr sorted array of available coin denominations
     * @param d   the target denomination requested by the foreigner
     */
    public static void findCeilAndFloor(int[] arr, int d) {
        int low = 0;
        int high = arr.length - 1;

        int ceil = -1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == d) {
                // Exact match found
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if (arr[mid] < d) {
                // arr[mid] is a potential floor (largest element <= d)
                floor = arr[mid];
                low = mid + 1;
            } else {
                // arr[mid] is a potential ceil (smallest element >= d)
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        // Print output: if exact match, print once; otherwise print ceil then floor
        if (ceil == floor) {
            System.out.println(ceil);
        } else {
            System.out.println(ceil);
            System.out.println(floor);
        }
    }
}