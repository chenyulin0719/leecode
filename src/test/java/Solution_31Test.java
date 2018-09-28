import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_31Test {

  @Test
  public void nextPermutation() {
    Solution_31 instance = new Solution_31();
    int[] nums1 = {1, 2, 3};
    int[] expect1 = {1, 3, 2};
    instance.nextPermutation(nums1);
    assertArrayEquals(expect1, nums1);

    int[] nums2 = {3, 2, 1};
    int[] expect2 = {1, 2, 3};
    instance.nextPermutation(nums2);
    assertArrayEquals(expect2, nums2);

    int[] nums3 = {1, 1, 5};
    int[] expect3 = {1, 5, 1};
    instance.nextPermutation(nums3);
    assertArrayEquals(expect3, nums3);

    int[] nums4 = {1, 3, 2};
    int[] expect4 = {2, 1, 3};
    instance.nextPermutation(nums4);
    assertArrayEquals(expect4, nums4);
  }
}