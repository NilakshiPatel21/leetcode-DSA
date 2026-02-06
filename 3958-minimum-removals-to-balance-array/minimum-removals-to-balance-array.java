import java.util.*;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        int maxWindow = 1;   // at least one element is always valid
        int i = 0;

        // Step 2: Sliding window
        for (int j = 0; j < n; j++) {
            // Shrink window from left if condition breaks
            while ((long) nums[j] > (long) nums[i] * k) {
                i++;
            }
            // Update maximum valid window size
            maxWindow = Math.max(maxWindow, j - i + 1);
        }

        // Step 3: Minimum removals
        return n - maxWindow;
    }
}
