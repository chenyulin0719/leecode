import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_13Test {

  @Test
  public void romanToInt() {
    Solution_13 instance = new Solution_13();
    assertEquals(3,instance.romanToInt("III"));
    assertEquals(4,instance.romanToInt("IV"));
    assertEquals(9,instance.romanToInt("IX"));
    assertEquals(58,instance.romanToInt("LVIII"));
    assertEquals(1994,instance.romanToInt("MCMXCIV"));
  }
}