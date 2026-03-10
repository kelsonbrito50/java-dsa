package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Container With Most Water — Two Pointers")
class TwoPointersTest {

    @Test
    @DisplayName("Classic case [1,8,6,2,5,4,8,3,7] → 49")
    void classicCase() {
        int result = TwoPointers.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, result);
    }

    @Test
    @DisplayName("Two elements [1,1] → 1")
    void twoElements() {
        int result = TwoPointers.maxArea(new int[]{1, 1});
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Descending heights [4,3,2,1,4] → 16")
    void descendingWithMatch() {
        int result = TwoPointers.maxArea(new int[]{4, 3, 2, 1, 4});
        assertEquals(16, result);
    }

    @Test
    @DisplayName("Equal heights [5,5,5,5] → 15")
    void equalHeights() {
        int result = TwoPointers.maxArea(new int[]{5, 5, 5, 5});
        assertEquals(15, result);
    }

    @Test
    @DisplayName("One tall line surrounded by short [1,1,1,100,1,1,100,1] → 300")
    void tallLinesSeparated() {
        int result = TwoPointers.maxArea(new int[]{1, 1, 1, 100, 1, 1, 100, 1});
        assertEquals(300, result);
    }
}
