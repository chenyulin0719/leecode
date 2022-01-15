import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Solution_5Test {
  private String input1 = "cbbd";
  private String expect1 = "bb";

  private String input2 = "babad";
  private String expect2 = "bab";

  private String input3 = "a";
  private String expect3 = "a";

  @Test
  public void testLongestPalindromeDP() {
    Solution_5 instance = new Solution_5();
    assertEquals(expect1, instance.longestPalindromeDP(input1));
    assertEquals(expect2, instance.longestPalindromeDP(input2));
    assertEquals(expect3, instance.longestPalindromeDP(input3));
  }

  @Test
  public void testLongestPalindromeExpandAroundCenter() {
    Solution_5 instance = new Solution_5();
    assertEquals(expect1, instance.longestPalindromeExpandAroundCenter(input1));
    assertEquals(expect2, instance.longestPalindromeExpandAroundCenter(input2));
    assertEquals(expect3, instance.longestPalindromeExpandAroundCenter(input3));
  }

  //Too Complicated
  @Test
  public void testLongestPalindromeManacher() {
    Solution_5 instance = new Solution_5();
    assertEquals(expect1, instance.longestPalindromeManacher(input1));
    assertEquals(expect2, instance.longestPalindromeManacher(input2));
    assertEquals(expect3, instance.longestPalindromeManacher(input3));
  }
}
