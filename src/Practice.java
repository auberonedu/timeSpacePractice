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

  // Time Complexity: O(n)
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
   * @throws IllegalArgumentException if input array empty
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    // Handle empty array edge case
    if (nums.length == 0) {
      throw new IllegalArgumentException("Input array must not be empty!");
    }

    // Map to store frequency of each int
    Map<Integer, Integer> numsMap = new HashMap<>();

    // Populate frequency map
    for (int number : nums) {
      numsMap.put(number, numsMap.getOrDefault(number, 0) + 1);
    }

    // Variables to track most common key plus maxFreq
    int vipKey = nums[0];
    int maxFreq = 0;

    // For-each loop to find most freq number
    for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
      if (entry.getValue() > maxFreq) {
        vipKey = entry.getKey();
        maxFreq = entry.getValue();
      }
    }

    return vipKey;
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
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    return -1;
  }
}