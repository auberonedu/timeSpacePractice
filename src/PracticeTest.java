import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
  // Forgot how to do unit tests? Look back at the ramblebot tests or old slides for a refresher!

@Test
  void testMostCommonTimeEfficient(){
    int[] numsTest = new int[6];
    numsTest[0] = 1;
    numsTest[1] = 6;
    numsTest[2] = 2;
    numsTest[3] = 4;
    numsTest[4] = 2;
    numsTest[5] = 2;

    
    
    int actual = Practice.mostCommonTimeEfficient(numsTest);

    assertEquals(2, actual);
  }

  @Test
  void testMostCommonSpaceEfficient(){
    int[] numsTest = {1, 2, 3, 3, 4, 4, 2};

    int howMany = Practice.mostCommonSpaceEfficient(numsTest);

    assertEquals( 2, howMany);

  }

}
