package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Sliding Window Maximum Sum")
class SlidingWindowTest {

    @Test
    @DisplayName("Basic case: [1,4,2,10,2,3,1,0,20] k=4 → 24")
    void basicCase() {
        int result = SlidingWindow.maxSumSubarray(new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20}, 4);
        assertEquals(24, result);
    }

    @Test
    @DisplayName("Whole array is window: [5,2,3] k=3 → 10")
    void wholeArray() {
        int result = SlidingWindow.maxSumSubarray(new int[]{5, 2, 3}, 3);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Window of size 1: [3,7,1,9] k=1 → 9")
    void singleElement() {
        int result = SlidingWindow.maxSumSubarray(new int[]{3, 7, 1, 9}, 1);
        assertEquals(9, result);
    }

    @Test
    @DisplayName("Negative numbers: [-1,-2,-3,-4] k=2 → -3")
    void negativeNumbers() {
        int result = SlidingWindow.maxSumSubarray(new int[]{-1, -2, -3, -4}, 2);
        assertEquals(-3, result);
    }

    @Test
    @DisplayName("Window larger than array: [2,3] k=3 → -1")
    void windowTooLarge() {
        int result = SlidingWindow.maxSumSubarray(new int[]{2, 3}, 3);
        assertEquals(-1, result);
    }
}
