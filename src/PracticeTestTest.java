import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PracticeTestTest {
  @Test
  public void testTestMostCommonSpaceEfficient() {
    // Test Case 1: Simple case
    int[] nums1 = {1, 2, 2, 3, 3, 3};
    int result1 = Practice.mostCommonTimeEfficient(nums1);
    assertTrue(result1 == 3 || result1 == 2);

    // Test Case 2: Single element array
    int[] nums2 = {5};
    int result2 = Practice.mostCommonTimeEfficient(nums2);
    assertEquals(5, result2);

    // Test Case 3: All elements are unique
    int[] nums3 = {1, 2, 3, 4, 5};
    int result3 = Practice.mostCommonTimeEfficient(nums3);
    assertTrue(result3 == 1 || result3 == 2 || result3 == 3 || result3 == 4 || result3 == 5);

    // Test Case 4: Large input with clear majority
    int[] nums4 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6};
    int result4 = Practice.mostCommonTimeEfficient(nums4);
    assertEquals(3, result4);

    // Test Case 5: Tie between two numbers
    int[] nums5 = {7, 7, 8, 8};
    int result5 = Practice.mostCommonTimeEfficient(nums5);
    assertTrue(result5 == 7 || result5 == 8);
  }

  @Test
  public void testMostCommonSpaceEfficient() {
    // Test Case 1: Simple case
    int[] nums1 = {1, 2, 2, 3, 3, 3};
    int result1 = Practice.mostCommonSpaceEfficient(nums1);
    assertTrue(result1 == 3 || result1 == 2); // Accepts any valid most common number

    // Test Case 2: Single element array
    int[] nums2 = {5};
    int result2 = Practice.mostCommonSpaceEfficient(nums2);
    assertEquals(5, result2);

    // Test Case 3: All elements are unique
    int[] nums3 = {1, 2, 3, 4, 5};
    int result3 = Practice.mostCommonSpaceEfficient(nums3);
    assertTrue(result3 == 1 || result3 == 2 || result3 == 3 || result3 == 4 || result3 == 5);

    // Test Case 4: Large input with clear majority
    int[] nums4 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6};
    int result4 = Practice.mostCommonSpaceEfficient(nums4);
    assertEquals(3, result4);

    // Test Case 5: Tie between two numbers
    int[] nums5 = {7, 7, 8, 8};
    int result5 = Practice.mostCommonSpaceEfficient(nums5);
    assertTrue(result5 == 7 || result5 == 8);
  }
}