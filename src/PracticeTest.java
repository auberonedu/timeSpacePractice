import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  /* mostCommonTimeEfficient */
  @Test
  void testMostCommonTimeEfficient() {
    int[] test = {1, 2, 2, 3, 4, 2};
    assertEquals(2, Practice.mostCommonTimeEfficient(test));
    
  }

  @Test
  void testMostCommonTimeEfficientOneVal() {
    int[] test = {9};
    assertEquals(9, Practice.mostCommonTimeEfficient(test));
  }

  @Test
  void testMostCommonTimeEfficientEmpty() {
    int[] test = {};
    assertEquals(0, Practice.mostCommonTimeEfficient(test));
  }


  /* mostCommonSpaceEfficient */
  @Test
  void testMostCommonSpaceEfficient() {
    int[] test = {1, 2, 2, 3, 4, 2};

    assertEquals(2, Practice.mostCommonSpaceEfficient(test));
  }

  @Test
  void testMostCommonSpaceEfficientOneVal() {
    int[] test = {9};
    assertEquals(9, Practice.mostCommonSpaceEfficient(test));
  }

  @Test
  void testMostCommonSpaceEfficientEmpty() {
    int[] test = {};
    assertEquals(0, Practice.mostCommonSpaceEfficient(test));
  }
}
