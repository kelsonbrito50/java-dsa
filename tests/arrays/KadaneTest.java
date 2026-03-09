package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Kadane's Algorithm — Maximum Subarray Sum")
class KadaneTest {

    @Test
    @DisplayName("Mixed array [-2,1,-3,4,-1,2,1,-5,4] → 6")
    void mixedArray() {
        assertEquals(6, Kadane.maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    @DisplayName("Single element [1] → 1")
    void singleElement() {
        assertEquals(1, Kadane.maxSubarraySum(new int[]{1}));
    }

    @Test
    @DisplayName("All negative [-3,-2,-1,-4] → -1 (least negative)")
    void allNegative() {
        assertEquals(-1, Kadane.maxSubarraySum(new int[]{-3, -2, -1, -4}));
    }

    @Test
    @DisplayName("All positive [1,2,3,4] → 10 (entire array)")
    void allPositive() {
        assertEquals(10, Kadane.maxSubarraySum(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("Max at the end [−1,−2,5,6] → 11")
    void maxAtEnd() {
        assertEquals(11, Kadane.maxSubarraySum(new int[]{-1, -2, 5, 6}));
    }
}
