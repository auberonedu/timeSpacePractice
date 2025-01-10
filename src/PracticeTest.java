import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

public class PracticeTest {

  // TODO: Implement tests for Practice.mostCommonTimeEfficient and
  // Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient() {
    int[] nums = {1, 2, 3, 3, 4, 5, 5, 5, 6};

    assertEquals(5, Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void testMostCommonTimeEfficientIdentical() {
    int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};

    assertEquals(1, Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void testMostCommonTimeEfficientNegativeNumbers() {
    int[] nums = {-12, -3, -4, -3, -2, -3};

    assertEquals(-3,  Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void testMostCommonTimeEfficientOneNumber() {
    int[] nums = {72};

    assertEquals(72,  Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void testMostCommonTimeEfficientEmptyArray() {
    int[] nums = {};

    assertThrows(IllegalArgumentException.class, () -> Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void testMostCommonTimeEfficientNullArray() {
    int[] nums = null;

    assertThrows(NullPointerException.class, () -> Practice.mostCommonTimeEfficient(nums));
  }

  // Hints: They are static methods, so you will use the full
  // Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides
  // for a refresher!

  @Test
  void testMostCommonSpaceEfficient() {
    int[] nums = {1, 2, 2, 3, 4, 5};

    assertEquals(2, Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  void testMostCommonSpaceEfficientIdentical() {
    int[] nums = {5, 5, 5, 5, 5};

    assertEquals(5, Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  void testMostCommonSpaceEfficientNegativeNumbers() {
    int[] nums = {-12, -3, -4, -3, -2, -3};

    assertEquals(-3,  Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  void testMostCommonSpaceEfficientOneNumber() {
    int[] nums = {64};

    assertEquals(64,  Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  void testMostCommonSpaceEfficientEmptyArray() {
    int[] nums = {};

    assertThrows(IllegalArgumentException.class, () -> Practice.mostCommonSpaceEfficient(nums));
  }

  @Test
  void testMostCommonSpaceEfficientNullArray() {
    int[] nums = null;

    assertThrows(NullPointerException.class, () -> Practice.mostCommonSpaceEfficient(nums));
  }

}
