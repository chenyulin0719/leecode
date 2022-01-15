import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_32Test {

  @Test
  public void longestValidParenthesesDP() {
    Solution_32 instance = new Solution_32();

    assertEquals(2, instance.longestValidParenthesesDP("(()"));
    assertEquals(4, instance.longestValidParenthesesDP(")()())"));
    assertEquals(2, instance.longestValidParenthesesDP("(()"));
    assertEquals(2, instance.longestValidParenthesesDP("()(()"));
    assertEquals(4, instance.longestValidParenthesesDP(")()())()()("));
  }


  @Test
  public void longestValidParentheses() {
    Solution_32 instance = new Solution_32();

    assertEquals(2,instance.longestValidParentheses("(()"));
    assertEquals(4,instance.longestValidParentheses( ")()())"));
    assertEquals(2,instance.longestValidParentheses( "(()"));
    assertEquals(2,instance.longestValidParentheses( "()(()"));
    assertEquals(4,instance.longestValidParentheses( ")()())()()("));
  }

  @Test
  public void longestValidParenthesesBrute() {
    Solution_32 instance = new Solution_32();

    assertEquals(2,instance.longestValidParenthesesBrute("(()"));
    assertEquals(4,instance.longestValidParenthesesBrute( ")()())"));
    assertEquals(2,instance.longestValidParenthesesBrute( "(()"));
    assertEquals(2,instance.longestValidParenthesesBrute( "()(()"));
    assertEquals(4,instance.longestValidParenthesesBrute( ")()())()()("));
  }

}