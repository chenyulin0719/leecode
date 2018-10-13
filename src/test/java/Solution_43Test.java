import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_43Test {

  @Test
  public void multiply() {
    Solution_43 instance = new Solution_43();
    assertEquals("6", instance.multiply("2", "3"));
    assertEquals("56088", instance.multiply("123", "456"));
    assertEquals("0", instance.multiply("0", "0"));
  }
}