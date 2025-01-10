import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
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
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()
    if (nums == null) {
      throw new NullPointerException("Array nums cannot be null.");
    }

    if (nums.length == 0) {
      throw new IllegalArgumentException("Array nums cannot be empty");
    }
    
    
    
    Map<Integer, Integer> map = new HashMap<>();

    for (int element : nums) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }
    }

    int majority = 0;
    int max = 0;

    for (int element : map.keySet()) {
      if (map.get(element) > max) {
        max = map.get(element);
        majority = element;
      }
    }

    return majority;
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
    if (nums == null) {
      throw new NullPointerException("Array nums cannot be null.");
    }

    if (nums.length == 0) {
      throw new IllegalArgumentException("Array nums cannot be empty");
    }
    
    int mostFrequent = nums[0];
    int maxFrequency = 0;

    for (int i = 0; i < nums.length; i++) {
      int count = 0;

      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }

      if (count > maxFrequency) {
        mostFrequent = nums[i];
        maxFrequency = count;
      }
    }

    return mostFrequent;
  }
}