package arrays;

/**
 * Sliding Window Maximum Sum — Find the maximum sum of a subarray of size k.
 *
 * Given an array of integers and a window size k, find the maximum sum
 * among all contiguous subarrays of length k.
 *
 * Example 1: nums=[1, 4, 2, 10, 2, 3, 1, 0, 20], k=4 → 24 (subarray [2, 10, 2, 10]... wait)
 *            Actually: max sum window is [10, 2, 3, 1]? No — let's compute:
 *            [1,4,2,10]=17, [4,2,10,2]=18, [2,10,2,3]=17, [10,2,3,1]=16, [2,3,1,0]=6, [3,1,0,20]=24 → 24
 *
 * Example 2: nums=[2, 3], k=3 → -1 (window larger than array)
 *
 * Approach: Sliding window — O(n) time, O(1) space
 *
 * Key insight: Instead of recalculating the sum for each window from scratch,
 * slide the window by subtracting the element leaving and adding the element entering.
 *
 * Easy
 */
public class SlidingWindow {

    /**
     * Find the maximum sum of any contiguous subarray of size k.
     *
     * Time: O(n) | Space: O(1)
     *
     * @param nums array of integers
     * @param k    window size
     * @return maximum sum of a subarray of size k, or -1 if k > nums.length
     */
    public static int maxSumSubarray(int[] nums, int k) {
        // TODO: Implement this method
        // Hint: Calculate sum of first window, then slide by removing left and adding right
        throw new UnsupportedOperationException("Implement me!");
    }
}
