package arrays;

/**
 * Kadane's Algorithm — Find the maximum sum contiguous subarray.
 *
 * Given an integer array, find the contiguous subarray (at least one element)
 * which has the largest sum. Return that sum.
 *
 * Approach: Dynamic Programming / Greedy — at each index, decide whether to
 * extend the current subarray or start fresh from the current element.
 *
 * Time: O(n) | Space: O(1)
 *
 * LeetCode #53 — Medium
 */
public class Kadane {

    /**
     * Returns the maximum sum of any contiguous subarray.
     *
     * @param nums array of integers (at least 1 element)
     * @return maximum subarray sum
     */
    public static int maxSubarraySum(int[] nums) {
        // TODO: Implement Kadane's Algorithm
        // Hint: Track currentSum and maxSum.
        // At each element: currentSum = max(nums[i], currentSum + nums[i])
        // Update maxSum = max(maxSum, currentSum)
        throw new UnsupportedOperationException("Implement me!");
    }

    /**
     * BONUS: Returns the start and end indices of the maximum sum subarray.
     *
     * @param nums array of integers (at least 1 element)
     * @return int array [startIndex, endIndex] of the max subarray
     */
    public static int[] maxSubarrayRange(int[] nums) {
        // TODO: Extend Kadane's to track indices
        throw new UnsupportedOperationException("Implement me!");
    }
}
