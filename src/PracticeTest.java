import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  @Test
  void testMostCommonTimeEffecient(){
    assertEquals(5, Practice.mostCommonTimeEfficient(new int[]{1, 3, 5, 2, 5, 5}));
    assertEquals(8, Practice.mostCommonTimeEfficient(new int[]{8, 3, 4, 8, 5, 8}));
    assertEquals(1, Practice.mostCommonTimeEfficient(new int[]{1, 1, 1, 2, 5, 2}));
    assertEquals(2, Practice.mostCommonTimeEfficient(new int[]{1, 3, 4, 2, 5, 2}));
    assertEquals(0, Practice.mostCommonTimeEfficient(new int[]{0,0,0}));
    assertEquals(3, Practice.mostCommonTimeEfficient(new int[]{3}));
  }

  @Test
  void testMostCommonSpaceEffecient(){
    assertEquals(5, Practice.mostCommonTimeEfficient(new int[]{1, 3, 5, 2, 5, 5}));
    assertEquals(8, Practice.mostCommonTimeEfficient(new int[]{8, 3, 4, 8, 5, 8}));
    assertEquals(1, Practice.mostCommonTimeEfficient(new int[]{1, 1, 1, 2, 5, 2}));
    assertEquals(2, Practice.mostCommonTimeEfficient(new int[]{1, 3, 4, 2, 5, 2}));
    assertEquals(0, Practice.mostCommonTimeEfficient(new int[]{0,0,0}));
    assertEquals(3, Practice.mostCommonTimeEfficient(new int[]{3}));
  }


  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!
}
