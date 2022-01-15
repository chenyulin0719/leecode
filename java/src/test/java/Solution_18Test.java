import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution_18Test {

  @Test
  public void fourSum() {
    Solution_18 instance = new Solution_18();
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    List<List<Integer>> expect = new ArrayList<>();
    expect.add(Arrays.asList(-2, 0, 0, 2));
    expect.add(Arrays.asList(-2, -1, 1, 2));
    expect.add(Arrays.asList(-1, 0, 0, 1));

    assertEquals(expect, instance.fourSum(nums, target));
  }
}