import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_14Test {

  @Test
  public void longestCommonPrefixBinarySearch() {
    Solution_14 instance = new Solution_14();
    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    String[] input3 = {"abb", "abc"};

    assertEquals("fl", instance.longestCommonPrefixBinarySearch(input1));
    assertEquals("", instance.longestCommonPrefixBinarySearch(input2));
    assertEquals("ab", instance.longestCommonPrefixBinarySearch(input3));
  }

  @Test
  public void longestCommonPrefixDivideAndConquer() {
    Solution_14 instance = new Solution_14();
    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    String[] input3 = {"abb", "abc"};

    assertEquals("fl", instance.longestCommonPrefixDivideAndConquer(input1));
    assertEquals("", instance.longestCommonPrefixDivideAndConquer(input2));
    assertEquals("ab", instance.longestCommonPrefixDivideAndConquer(input3));
  }

  @Test
  public void longestCommonPrefixVertical() {
    Solution_14 instance = new Solution_14();

    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    String[] input3 = {"abb", "abc"};
    assertEquals("fl", instance.longestCommonPrefixVertical(input1));
    assertEquals("", instance.longestCommonPrefixVertical(input2));
    assertEquals("ab", instance.longestCommonPrefixVertical(input3));
  }

  @Test
  public void longestCommonPrefixHorizontal() {
    Solution_14 instance = new Solution_14();
    String[] input1 = {"flower", "flow", "flight"};
    String[] input2 = {"dog", "racecar", "car"};
    String[] input3 = {"abb", "abc"};
    assertEquals("fl", instance.longestCommonPrefixHorizontal(input1));
    assertEquals("", instance.longestCommonPrefixHorizontal(input2));
    assertEquals("ab", instance.longestCommonPrefixHorizontal(input3));
  }
}