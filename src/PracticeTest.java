import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.sound.sampled.SourceDataLine;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient() {
    int[] numArr1 = {1, 2, 3, 2, 4, 2};
    System.out.println(Practice.mostCommonTimeEfficient(numArr1)); // 2
  }
 
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!
}
