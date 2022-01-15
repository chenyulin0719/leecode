import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_70Test {
  @Test
  public void climbStairsDP2() {
    Solution_70 instance = new Solution_70();
    assertEquals(2,instance.climbStairsDP2(2));
    assertEquals(3,instance.climbStairsDP2(3));
  }

  @Test
  public void climbStairsDP() {
    Solution_70 instance = new Solution_70();
    assertEquals(2,instance.climbStairsDP(2));
    assertEquals(3,instance.climbStairsDP(3));
  }
}