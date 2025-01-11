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
  // Space Complexity: O(n^2)
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

    HashMap<Integer, Integer> frequencies = new HashMap<>();
    int highestCount = 0;
    int mostCommon = 0;
    for (int i = 0; i < nums.length; i++) {
      if (frequencies.containsKey(nums[i])) {
        int count = frequencies.get(nums[i]);
        count++;
        frequencies.put(nums[i], count);
      } else {
        frequencies.put(nums[i], 1);
      }
      if (frequencies.get(nums[i]) >= highestCount) {
        highestCount = frequencies.get(nums[i]);
        mostCommon = nums[i];
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
   * Time Complexity:
   * Space Complexity:
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.

    // HashMap that stores the number without duplicates
    Map<Integer, Integer> mostCommonMap = new HashMap<>();
    // Keeps track of the most common number
    int mostCommonCount = 0;
    int mostCommonInt = nums[0];

    // Loops over the input array to add each number to the HashMap
    // Sets each numbers count to 1
    for (int num : nums) {
      mostCommonMap.put(num, mostCommonMap.getOrDefault(num, 0));

      // Variable that targets the count, that being the number that represents the
      // amount of times a number appears in the array
      int count = mostCommonMap.get(num);

      if (count > mostCommonCount) {
        mostCommonCount = count;
        mostCommonInt = num;
      }
    }

    return mostCommonInt;
  }
}