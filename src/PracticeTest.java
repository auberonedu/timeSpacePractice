import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

  // TODO: Implement tests for Practice.mostCommonTimeEfficient and
  // Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full
  // Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides
  // for a refresher!

  @Test
  void mostCommonTimeEfficient() {
    int[] nums = { 0, 1, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(1, Practice.mostCommonTimeEfficient(nums));
  }

  @Test
  void mostCommonSpaceEfficient() {
    int[] nums = { 2, 2, 2, 2, 4, 4, 6, 6, 6, 8, 9, 10 };
    assertEquals(2, Practice.mostCommonSpaceEfficient(nums));
  }
}
