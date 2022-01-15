import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_3Test {
  private static final String input1 = "abcabcbb";
  private static final String input2 = "bbbbb";
  private static final String input3 = "pwwkew";
  private static final String input4 = "abba";

  @Test
  public void testLengthOfLongestSubstringHashMap() {
    // Test HashMapSolution
    Solution_3 instance = new Solution_3();

    assertEquals(3, instance.lengthOfLongestSubstringHashMap(input1));
    assertEquals(1, instance.lengthOfLongestSubstringHashMap(input2));
    assertEquals(3, instance.lengthOfLongestSubstringHashMap(input3));
    assertEquals(2, instance.lengthOfLongestSubstringHashMap(input4));
  }


  @Test
  public void testLengthOfLongestSubstringSlidingWindow() {
    // Test HashMapSolution
    Solution_3 instance = new Solution_3();

    assertEquals(3, instance.lengthOfLongestSubstringSlidingWindow(input1));
    assertEquals(1, instance.lengthOfLongestSubstringSlidingWindow(input2));
    assertEquals(3, instance.lengthOfLongestSubstringSlidingWindow(input3));
    assertEquals(2, instance.lengthOfLongestSubstringSlidingWindow(input4));
  }


  @Test
  public void testLengthOfLongestSubstringBrute() {
    // Test HashMapSolution
    Solution_3 instance = new Solution_3();

    assertEquals(3, instance.lengthOfLongestSubstringBrute(input1));
    assertEquals(1, instance.lengthOfLongestSubstringBrute(input2));
    assertEquals(3, instance.lengthOfLongestSubstringBrute(input3));
    assertEquals(2, instance.lengthOfLongestSubstringBrute(input4));
  }
}