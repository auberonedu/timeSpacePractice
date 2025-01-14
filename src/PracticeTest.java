import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient() {
    int[] nums = {1, 1, 1, 3, 4, 6, 6, 6, 6, 6, 2, 2, 3};
    assertEquals(Practice.mostCommonTimeEfficient(nums), 6);
  }
  @Test
  void testMostCommonSpaceEfficient() {
    int[] nums = {1, 1, 1, 3, 4, 6, 6, 6, 6, 6, 2, 2, 3};
    assertEquals(Practice.mostCommonSpaceEfficient(nums), 6);
  }
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!
}
