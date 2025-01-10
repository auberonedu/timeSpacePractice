import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  @Test
  public void testFindEvens() {


  }

  @Test
  public void testSumDiagonal() {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    assertEquals(15, Practice.sumDiagonal(matrix));
  }

  @Test
  public void testCountFrequencies() {
    String[] fruit = {"apple", "banana", "apple", "orange", "banana", "apple"};
    Map<String, Integer> result = Practice.countFrequencies(fruit);
    Map<String, Integer> expected = new HashMap<>();
    expected.put("apple", 3);
    expected.put("banana", 2);
    expected.put("orange", 1);
    assertEquals(expected, result);
  }

  @Test
  public void testMostCommonSpaceEfficient() {
    
  }
}
