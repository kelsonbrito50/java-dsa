package arrays;

/**
 * Container With Most Water — Two Pointers technique.
 *
 * Given n non-negative integers representing vertical lines on a chart,
 * find two lines that together with the x-axis form a container
 * that holds the most water.
 *
 * Approach: Two pointers from both ends, move the shorter line inward.
 * Why? Moving the taller line can never increase area (width shrinks,
 * height is limited by the shorter line).
 *
 * Time: O(n) | Space: O(1)
 *
 * LeetCode #11 — Medium
 */
public class TwoPointers {

    /**
     * Finds the maximum area of water that can be contained
     * between two lines in the height array.
     *
     * @param height array where height[i] is the height of line at index i
     * @return maximum water area between any two lines
     */
    public static int maxArea(int[] height) {
        // TODO: Implement using two pointers — left at 0, right at end
        // Move the pointer with the shorter height inward
        return 0;
    }
}
