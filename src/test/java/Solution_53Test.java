import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_53Test {
  @Test
  public void maxSubArrayDivideAndConquer() {
    Solution_53 instance = new Solution_53();
    int[] input1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int[] input2 = {-2, -1};
    assertEquals(6, instance.maxSubArrayDivideAndConquer(input1));
    assertEquals(-1, instance.maxSubArrayDivideAndConquer(input2));
  }

  @Test
  public void maxSubArrayDP() {
    Solution_53 instance = new Solution_53();
    int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, instance.maxSubArray(input));
  }
}