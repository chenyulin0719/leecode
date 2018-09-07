import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_11Test {

  @Test
  public void maxArea() {
    Solution_11 instance = new Solution_11();
    int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    assertEquals(49, instance.maxArea(input));
  }
}