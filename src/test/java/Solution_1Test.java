import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_1Test {
  private final int[] nums = {2, 7, 11, 15};
  private final int target = 9;
  private final int[] expect = {0, 1};

  @Test
  public void testTwoSumBully() {
    Solution_1 instance = new Solution_1();
    assertArrayEquals(expect, instance.twoSumBully(nums, target));
  }

  @Test
  public void testTwoSumHashMap() {
    Solution_1 instance = new Solution_1();
    assertArrayEquals(expect, instance.twoSumHashMap(nums, target));
  }

  @Test
  public void testTwoSumHashMapAndComplement() {
    Solution_1 instance = new Solution_1();
    assertArrayEquals(expect, instance.twoSumHashMapAndComplement(nums, target));
  }

}