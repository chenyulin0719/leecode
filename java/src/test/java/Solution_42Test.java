import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_42Test {

  @Test
  public void trapStack2() {
    Solution_42 instance = new Solution_42();
    int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, instance.trapStack2(input));
  }

  @Test
  public void trapStack() {
    Solution_42 instance = new Solution_42();
    int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, instance.trapStack(input));
  }

  @Test
  public void trapTwoPointer2() {
    Solution_42 instance = new Solution_42();
    int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, instance.trapTwoPointer2(input));
  }

  @Test
  public void trapTwoPointer() {
    Solution_42 instance = new Solution_42();
    int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    assertEquals(6, instance.trapTwoPointer(input));
  }
}