import Utils.MyUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_22Test {
  private int n = 3;
  private List<String> expect = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");

  @Test
  public void generateParenthesis() {
    Solution_22 instance = new Solution_22();
    assertTrue(MyUtils.eqaulsUnsortList(expect, instance.generateParenthesis(n)));
  }

  @Test
  public void generateParenthesisBacktracking() {
    Solution_22 instance = new Solution_22();
    assertEquals(expect, instance.generateParenthesisBacktracking(n));
  }

  @Test
  public void generateParenthesisBrute() {
    Solution_22 instance = new Solution_22();
    assertEquals(expect, instance.generateParenthesisBacktracking(n));
  }
}