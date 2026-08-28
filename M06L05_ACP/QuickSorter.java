package M06L05_ACP;

public class QuickSorter {

    /**
     * Sorts an array of Apple objects using Quick Sort algorithm.
     * 
     * @param apples array of Apple objects
     * @param low    starting index
     * @param high   ending index
     */
    public static void quickSort(Apple[] apples, int low, int high) {
        if (low < high) {
            int pi = partition(apples, low, high);
            quickSort(apples, low, pi - 1);
            quickSort(apples, pi + 1, high);
        }
    }

    private static int partition(Apple[] apples, int low, int high) {
        Apple pivot = apples[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (compare(apples[j], pivot) <= 0) {
                i++;
                Apple temp = apples[i];
                apples[i] = apples[j];
                apples[j] = temp;
            }
        }

        Apple temp = apples[i + 1];
        apples[i + 1] = apples[high];
        apples[high] = temp;

        return i + 1;
    }

    /**
     * Compares two apples:
     * Primary key: X coordinate in ascending order.
     * Secondary key: Y coordinate in descending order (if X is equal).
     */
    private static int compare(Apple a, Apple b) {
        if (a.x != b.x) {
            return Integer.compare(a.x, b.x);
        }
        return Integer.compare(b.y, a.y);
    }
}