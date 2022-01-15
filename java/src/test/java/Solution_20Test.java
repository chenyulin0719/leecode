import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_20Test {

  @Test
  public void isValid() {
    Solution_20 instance = new Solution_20();
    assertTrue(instance.isValid("()"));
    assertTrue(instance.isValid("()[]{}"));
    assertFalse(instance.isValid("(]"));
    assertFalse(instance.isValid("([)]"));
    assertTrue(instance.isValid("{[]}"));
    assertFalse(instance.isValid("]"));
  }
}