import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Scanner;

public class PracticeTest {

  // TODO: Implement tests for Practice.mostCommonTimeEfficient and
  // Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonSpaceEfficient() {
    int[] nums = {1, 2, 3, 3, 4, 5, 5, 5, 6};

    assertEquals(5, Practice.mostCommonTimeEfficient(nums));
  }

  // Hints: They are static methods, so you will use the full
  // Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides
  // for a refresher!
}
