import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_55Test {

  @Test
  public void canJump() {
    Solution_55 instance = new Solution_55();
    int[] input1 = {2, 3, 1, 1, 4};
    assertTrue(instance.canJump(input1));

    int[] input2 = {3, 2, 1, 0, 4};
    assertFalse(instance.canJump(input2));

    int[] input3 = {0};
    assertTrue(instance.canJump(input3));
  }
}