import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_35Test {

  @Test
  public void searchInsert() {
    Solution_35 instance = new Solution_35();
    int[] nums1 = {1, 3, 5, 6};
    assertEquals(2, instance.searchInsert(nums1, 5));
    assertEquals(1, instance.searchInsert(nums1, 2));
    assertEquals(4, instance.searchInsert(nums1, 7));
    assertEquals(0, instance.searchInsert(nums1, 0));

    int[] nums2 = {1, 3};
    assertEquals(1, instance.searchInsert(nums2, 2));

    int[] nums3 = {1, 2, 4, 6, 7};
    assertEquals(2, instance.searchInsert(nums3, 3));
  }
}