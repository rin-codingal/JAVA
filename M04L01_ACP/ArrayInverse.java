package M04L01_ACP;

public class ArrayInverse {

    /**
     * Calculates the inverse of an array.
     * The inverse of an array is defined such that if a[i] = v, 
     * then in the inverse array inv[v] = i.
     *
     * @param arr the input array containing values from 0 to n - 1
     * @return the inverted array
     */
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            inv[value] = i;
        }

        return inv;
    }
}
