import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_28Test {

  @Test
  public void strStr() {
    Solution_28 instance = new Solution_28();
    String haystack1 = "hello";
    String needle1 = "ll";

    String haystack2 = "aaaaa";
    String needle2 = "bba";

    assertEquals(2, instance.strStr(haystack1, needle1));
    assertEquals(-1, instance.strStr(haystack2, needle2));
  }
}