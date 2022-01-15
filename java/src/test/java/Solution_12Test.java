import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_12Test {

  @Test
  public void intToRoman() {
    Solution_12 instance = new Solution_12();
    assertEquals("III", instance.intToRoman(3));
    assertEquals("IV", instance.intToRoman(4));
    assertEquals("IX", instance.intToRoman(9));
    assertEquals("LVIII", instance.intToRoman(58));
    assertEquals("MCMXCIV", instance.intToRoman(1994));
  }
}