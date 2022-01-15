import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Solution_8Test {
  @Test
  public void testMyAtoi() {
    Solution_8 instance = new Solution_8();
    String input1 = "123";
    int expect1 = 123;
    assertEquals(expect1, instance.myAtoi(input1));

    String input2 = "    10522545459";
    int expect2 = 2147483647;
    assertEquals(expect2, instance.myAtoi(input2));
  }
}
