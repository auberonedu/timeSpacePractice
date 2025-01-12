import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  public void testMostCommonTimeEfficient() {
    int[] numList1 = {1, 4, 4, 6, 7, 9, 3};
    int[] numList2 = {7, 7, 4, 2, 2, 1, 5};

    assertEquals(4, Practice.mostCommonTimeEfficient(numList1));
    assertEquals(2, Practice.mostCommonTimeEfficient(numList2));

    // I need help fixing this. Is there a reson 
    // why the assertEquals() is not working? Am 
    // I setting this up wrong?

  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!
}
