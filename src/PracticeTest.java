import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  @Test
  void testMostCommonTimeEfficient() {
    int[] nums = {4, 4, 2, 5, 1, 7, 3};
    int commonNum = Practice.mostCommonTimeEfficient(nums);
    assertEquals(4, commonNum);
  }

  @Test
  void testMostCommonSpaceEfficient() {
    int[] nums = {3, 3, 4, 5, 1, 3, 3};
    int commonNum = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(3, commonNum);
  }

  @Test
  void testMostCommonSpaceEfficientOneElement() {
    int[] nums = {3};
    int commonNum = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(3, commonNum);
  }

  @Test
  void testMostCommonTimeEfficientOneElement() {
    int[] nums = {3};
    int commonNum = Practice.mostCommonTimeEfficient(nums);
    assertEquals(3, commonNum);
  }
  
  @Test
  void testMostCommonSpaceEfficientTie() {
    int[] nums = {7, 7, 2, 2, 1, 4, 4, 1};
    int commonNum = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(7, commonNum);
  }

  @Test
  void testMostCommonTimeEfficientTie() {
    int[] nums = {7, 7, 9, 9, 1, 8, 8, 1};
    int commonNum = Practice.mostCommonTimeEfficient(nums);
    assertEquals(9, commonNum);
  }
}
