import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Solution_7Test {

  @Test
  public void testReverseInteger() {
    Solution_7 instance = new Solution_7();
    int input1 = 123;
    int expect1 = 321;
    assertEquals(expect1, instance.reverse(input1));

    int input2 = -123;
    int expect2 = -321;
    assertEquals(expect2, instance.reverse(input2));

    int input3 = 120;
    int expect3 = 21;
    assertEquals(expect3, instance.reverse(input3));

    int input4 = 1534236469;
    int expect4 = 0;
    assertEquals(expect4, instance.reverse(input4));

  }
}
