import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

  @Test
  public void testFindEvens() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    List<Integer> result = Practice.findEvens(nums);
    assertEquals(List.of(2, 4, 6), result);

    int[] noEvens = {1, 3, 5, 7};
    assertTrue(Practice.findEvens(noEvens).isEmpty());
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
