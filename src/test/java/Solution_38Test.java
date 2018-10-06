import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_38Test {

  @Test
  public void countAndSay() {
    Solution_38 instance = new Solution_38();

    assertEquals("1", instance.countAndSay(1));
    assertEquals("1211", instance.countAndSay(4));
  }
}