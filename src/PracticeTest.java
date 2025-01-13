import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  @Test
  void testMostCommonTimeEfficient() {
    int[] nums = {1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10};

    Practice countTest = new Practice();

    int actualCount = countTest.mostCommonTimeEfficient(nums);

    assertEquals(3, actualCount);
  }

  @Test
  void testMostCommonTimeEfficientMultiples() {
    int[] nums = {1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10, 10};

    Practice countTest = new Practice();

    int actualCount = countTest.mostCommonTimeEfficient(nums);

    assertEquals(2, 3, actualCount);
  }

  @Test
  void testMostCommonSpaceEfficient() {
    int[] nums = {1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10};

    Practice countTest = new Practice();

    int actualCount = countTest.mostCommonSpaceEfficient(nums);

    assertEquals(3, actualCount);
  }

  @Test
  void testMostCommonSpaceEfficientMultiples() {
    int[] nums = {1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10, 10};

    Practice countTest = new Practice();

    int actualCount = countTest.mostCommonSpaceEfficient(nums);

    assertEquals(2, 3, actualCount);
  }
  
  @Test
  void testMostCommonTimeEfficientTwoNums() {
    int[] nums = {1, 2};

    Practice countTest = new Practice();

    int actualCount = countTest.mostCommonTimeEfficient(nums);

    assertEquals(1, 2,  actualCount);
  }
}
