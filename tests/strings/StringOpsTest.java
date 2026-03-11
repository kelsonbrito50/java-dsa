package strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StringOpsTest {

    private StringOps solution;

    @BeforeEach
    void setUp() {
        solution = new StringOps();
    }

    @Test
    void testValidAnagram() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(solution.isAnagram("ab", "a"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(solution.isAnagram("a", "a"));
        assertFalse(solution.isAnagram("a", "b"));
    }
}
