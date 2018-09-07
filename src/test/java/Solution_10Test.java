import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class Solution_10Test {

  @Test
  public void regularExcpressionMatchDP_BottomUp() {
    Solution_10 instance = new Solution_10();
    assertFalse(instance.isMatchDP_BottomUp("aa", "a"));
    assertTrue(instance.isMatchDP_BottomUp("aa", "a*"));
    assertTrue(instance.isMatchDP_BottomUp("ab", ".*"));
    assertTrue(instance.isMatchDP_BottomUp("aab", "c*a*b"));
    assertFalse(instance.isMatchDP_BottomUp("mississippi", "mis*is*p*."));
    assertTrue(instance.isMatchDP_BottomUp("bbbba", ".*a*a"));
    assertFalse(instance.isMatchDP_BottomUp("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    assertFalse(instance.isMatchDP_BottomUp("ab", ".*c"));

  }

  @Test
  public void regularExcpressionMatchDP_TopDown() {
    Solution_10 instance = new Solution_10();
    assertFalse(instance.isMatchDP_TopDown("aa", "a"));
    assertTrue(instance.isMatchDP_TopDown("aa", "a*"));
    assertTrue(instance.isMatchDP_TopDown("ab", ".*"));
    assertTrue(instance.isMatchDP_TopDown("aab", "c*a*b"));
    assertFalse(instance.isMatchDP_TopDown("mississippi", "mis*is*p*."));
    assertTrue(instance.isMatchDP_TopDown("bbbba", ".*a*a"));
    assertFalse(instance.isMatchDP_TopDown("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    assertFalse(instance.isMatchDP_TopDown("ab", ".*c"));
  }

  @Test
  public void regularExcpressionMatchRecursive() {
    Solution_10 instance = new Solution_10();
    assertFalse(instance.isMatchRecursive("aa", "a"));
    assertTrue(instance.isMatchRecursive("aa", "a*"));
    assertTrue(instance.isMatchRecursive("ab", ".*"));
    assertTrue(instance.isMatchRecursive("aab", "c*a*b"));
    assertFalse(instance.isMatchRecursive("mississippi", "mis*is*p*."));
    assertTrue(instance.isMatchRecursive("bbbba", ".*a*a"));
    assertFalse(instance.isMatchRecursive("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
    assertFalse(instance.isMatchRecursive("ab", ".*c"));
  }
}