package M06L06_ACP;

public class MergeSortReversePairs {

    /**
     * Entry point to compute the total number of reverse pairs.
     * A reverse pair is defined as (i, j) where i < j and nums[i] > 2 * nums[j].
     * 
     * @param nums input array of integers
     * @return count of reverse pairs
     */
    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private static int mergeSortAndCount(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;
        int count = mergeSortAndCount(nums, low, mid) + mergeSortAndCount(nums, mid + 1, high);

        // Count reverse pairs between the left and right sorted halves
        count += countPairs(nums, low, mid, high);

        // Standard merge step to maintain sorted order
        merge(nums, low, mid, high);

        return count;
    }

    private static int countPairs(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            // Using long cast to prevent integer overflow during 2 * nums[j]
            while (j <= high && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        return count;
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        System.arraycopy(temp, 0, nums, low, temp.length);
    }
}