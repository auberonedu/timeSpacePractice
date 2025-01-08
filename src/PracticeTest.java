import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!
}


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

  // Edge case: empty
  assertThrows(IllegalArgumentException.class, () -> {
    Practice.mostCommonTimeEfficient(new int[]{});
  });
}