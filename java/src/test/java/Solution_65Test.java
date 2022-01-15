import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_65Test {

  @Test
  public void isNumber() {
    Solution_65 instance = new Solution_65();
    assertTrue(instance.isNumber("0"));
    assertTrue(instance.isNumber(" 0.1"));
    assertTrue(instance.isNumber(".1"));
    assertFalse(instance.isNumber("abc"));
    assertFalse(instance.isNumber("1 a"));
    assertTrue(instance.isNumber("2e10"));
    assertTrue(instance.isNumber(" -90e3"));
    assertFalse(instance.isNumber(" 1e"));
    assertFalse(instance.isNumber("e3"));
    assertTrue(instance.isNumber(" 6e-1"));
    assertFalse(instance.isNumber(" 99e2.5"));
    assertTrue(instance.isNumber("53.5e93"));
    assertFalse(instance.isNumber("--6"));
    assertFalse(instance.isNumber("-+3"));
    assertFalse(instance.isNumber("95a54e53"));
    assertFalse(instance.isNumber("."));
    assertTrue(instance.isNumber("+.8"));
    assertTrue(instance.isNumber("46.e3"));
  }
}