package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum — Find two indices whose values sum to target.
 *
 * Approach 1: HashMap lookup — O(n) time, O(n) space
 * Approach 2: Two pointers (sorted input) — O(n) time, O(1) space
 *
 * Key insight: For each number, check if (target - number) already exists
 * in the map. One pass is enough.
 *
 * LeetCode #1 — Easy
 */
public class TwoSum {

    /**
     * HashMap approach — works on unsorted arrays.
     * Time: O(n) | Space: O(n)
     *
     * @param nums   array of integers
     * @param target target sum
     * @return indices of the two numbers, or empty array if not found
     */
    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }

    /**
     * Two pointers approach — requires sorted input.
     * Time: O(n) | Space: O(1)
     *
     * Note: Returns indices in the SORTED array, not the original.
     * Use HashMap approach when original indices matter.
     *
     * @param sortedNums sorted array of integers
     * @param target     target sum
     * @return indices in sorted array, or empty array if not found
     */
    public static int[] twoSumTwoPointers(int[] sortedNums, int target) {
        int left = 0;
        int right = sortedNums.length - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}
