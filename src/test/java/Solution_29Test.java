import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_29Test {
  @Test
  public void divide() {
    Solution_29 instance = new Solution_29();

    assertEquals(3, instance.divide(10, 3));
    assertEquals(-2, instance.divide(7, -3));
    assertEquals(2147483647, instance.divide(-2147483648, -1));
    assertEquals(-2147483648, instance.divide(-2147483648, 1));
    assertEquals(715827882, instance.divide(-2147483648, -3));
  }
}