import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, any one of the most common can be returned
   * arbitrarily.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    int currentNum = nums[0];
    int count = 0;

    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

      if(frequencyMap.get(num) > count) {
        currentNum = num;
        count = frequencyMap.get(num);
      }
    }

    return currentNum;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, any one of the most common can be returned
   * arbitrarily.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int currentNum = 0;
    int currentCount = 0;
    
    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count ++;
        }
      }
      if (count > currentCount) {
        currentCount = count;
        currentNum = nums[i];
      }
    }
    return currentNum;
  }
}