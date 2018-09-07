import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Solution_6Test {

  @Test
  public void testZigZagConvert() {
    Solution_6 instance = new Solution_6();
    int inputRow = 3;
    String input = "PAYPALISHIRING";
    String expect = "PAHNAPLSIIGYIR";
    assertEquals(expect, instance.convert(input, inputRow));
  }
}
