import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

  // Time Complexity: 0(n)
  // Space Complexity: 0(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n)
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: 0(n)
  // Space Complexity: 0(n)
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
   * Time Complexity: 0(n)
   * Space Complexity: 0(n)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    int mostCommon = 0;
    int maxFrequency = 0;

    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
      if (frequencyMap.get(num) > maxFrequency) {
        mostCommon = num;
        maxFrequency = frequencyMap.get(num);
      }
    }

    return mostCommon;
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
   * Time Complexity: 0(n^2)
   * Space Complexity: 0(1)
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int maxCount = 0;
    int mostCommon = nums[0];

    for (int i = 0; i < nums.length; i++) {
      int count = 0;

      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }

      if (count > maxCount) {
        maxCount = count;
        mostCommon = nums[i];
      }
    }

    return mostCommon;
  }
}