import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

    @Test
    public void testMostCommonTimeEfficient() {
        // Basic cases
        assertEquals(3, Practice.mostCommonTimeEfficient(new int[]{1, 3, 2, 3, 4, 1, 3}));
        assertEquals(1, Practice.mostCommonTimeEfficient(new int[]{1, 1, 1, 2, 2}));

        // Edge case: single element
        assertEquals(5, Practice.mostCommonTimeEfficient(new int[]{5}));

        // Edge case: tie
        int result = Practice.mostCommonTimeEfficient(new int[]{2, 3, 2, 3});
        assertTrue(result == 2 || result == 3);

        // Edge case: empty array
        assertThrows(IllegalArgumentException.class, () -> {
            Practice.mostCommonTimeEfficient(new int[]{});
        });
    }

    @Test
    public void testMostCommonSpaceEfficient() {
        // Basic cases
        assertEquals(3, Practice.mostCommonSpaceEfficient(new int[]{1, 3, 2, 3, 4, 1, 3}));
        assertEquals(1, Practice.mostCommonSpaceEfficient(new int[]{1, 1, 1, 2, 2}));

        // Edge case: single element
        assertEquals(5, Practice.mostCommonSpaceEfficient(new int[]{5}));

        // Edge case: tie
        int result = Practice.mostCommonSpaceEfficient(new int[]{2, 3, 2, 3});
        assertTrue(result == 2 || result == 3);

        // Edge case: empty array
        assertThrows(IllegalArgumentException.class, () -> {
            Practice.mostCommonSpaceEfficient(new int[]{});
        });

        // Additional cases for space-efficient implementation
        assertEquals(7, Practice.mostCommonSpaceEfficient(new int[]{7, 7, 7, 7}));
        assertEquals(2, Practice.mostCommonSpaceEfficient(new int[]{4, 2, 5, 3, 6, 2}));
    }
}
