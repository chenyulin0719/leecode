import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_45Test {
  private int[] input1 = {2, 3, 1, 1, 4};
  private int[] input2 = {1, 2};
  private int[] input3 = {1, 1, 1, 1};

  @Test
  public void jumpGreedy() {
    Solution_45 instance = new Solution_45();
    assertEquals(2, instance.jumpGreedy(input1));
    assertEquals(1, instance.jumpGreedy(input2));
    assertEquals(3, instance.jumpGreedy(input3));
  }

  @Test
  public void jumpDP() {
    Solution_45 instance = new Solution_45();
    assertEquals(2, instance.jumpDP(input1));
    assertEquals(1, instance.jumpDP(input2));
    assertEquals(3, instance.jumpDP(input3));
  }
}