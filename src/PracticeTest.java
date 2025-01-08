import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  @Test
    public void testMostCommonTimeEfficient() {
      assertEquals(3, Practice.mostCommonTimeEfficient(new int[]{3, 3, 2, 1, 3}));
      assertEquals(1, Practice.mostCommonTimeEfficient(new int[]{1}));
      assertEquals(2, Practice.mostCommonTimeEfficient(new int[]{2, 2, 2, 3, 3}));
      assertEquals(4, Practice.mostCommonTimeEfficient(new int[]{4, 4, 4, 4}));
      assertEquals(0, Practice.mostCommonTimeEfficient(new int[]{0, 0, 1, 2, 3, 0, 4}));
    }
}
