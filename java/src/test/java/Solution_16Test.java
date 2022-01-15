import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_16Test {

  @Test
  public void threeSumClosest() {
    Solution_16 instance = new Solution_16();
    int[] input = {-1, 2, 1, -4};
    int target = 1;
    assertEquals(2, instance.threeSumClosest(input, target));
  }
}