package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Two Sum")
class TwoSumTest {

    @Test
    @DisplayName("HashMap: basic case [2,7,11,15] target=9 → [0,1]")
    void hashMapBasicCase() {
        int[] result = TwoSum.twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    @DisplayName("HashMap: target in middle [3,2,4] target=6 → [1,2]")
    void hashMapMiddleCase() {
        int[] result = TwoSum.twoSumHashMap(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    @DisplayName("HashMap: duplicate values [3,3] target=6 → [0,1]")
    void hashMapDuplicates() {
        int[] result = TwoSum.twoSumHashMap(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    @DisplayName("HashMap: no solution → empty array")
    void hashMapNoSolution() {
        int[] result = TwoSum.twoSumHashMap(new int[]{1, 2, 3}, 10);
        assertEquals(0, result.length);
    }

    @Test
    @DisplayName("HashMap: negative numbers [-1,-2,-3,-4] target=-7 → [2,3]")
    void hashMapNegativeNumbers() {
        int[] result = TwoSum.twoSumHashMap(new int[]{-1, -2, -3, -4}, -7);
        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    @DisplayName("Two Pointers: sorted array [1,2,3,4,5] target=9 → [3,4]")
    void twoPointersBasicCase() {
        int[] result = TwoSum.twoSumTwoPointers(new int[]{1, 2, 3, 4, 5}, 9);
        assertArrayEquals(new int[]{3, 4}, result);
    }

    @Test
    @DisplayName("Two Pointers: first and last [1,10] target=11 → [0,1]")
    void twoPointersEdges() {
        int[] result = TwoSum.twoSumTwoPointers(new int[]{1, 10}, 11);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    @DisplayName("Two Pointers: no solution → empty array")
    void twoPointersNoSolution() {
        int[] result = TwoSum.twoSumTwoPointers(new int[]{1, 2, 3}, 100);
        assertEquals(0, result.length);
    }
}
