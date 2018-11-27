import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_67Test {

  @Test
  public void addBinary() {
    Solution_67 instance = new Solution_67();
    assertEquals("100", instance.addBinary("11", "1"));
    assertEquals("10101", instance.addBinary("1010", "1011"));
  }

  @Test
  public void addBinary2() {
    Solution_67 instance = new Solution_67();
    assertEquals("100", instance.addBinary2("11", "1"));
    assertEquals("10101", instance.addBinary2("1010", "1011"));
  }
}