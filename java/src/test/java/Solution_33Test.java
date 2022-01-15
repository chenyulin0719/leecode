import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_33Test {

  @Test
  public void search() {
    Solution_33 instance = new Solution_33();
    int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
    int[] nums2 = {4, 5};
    int[] nums3 = {4, 5, 6, 7, 8, 1, 2, 3};
    int[] nums4 = {4, 5, 6, 7, 0, 1, 2};

    assertEquals(0, instance.search(nums1, 4));
    assertEquals(-1, instance.search(nums1, 3));
    assertEquals(0, instance.search(nums2, 4));
    assertEquals(4, instance.search(nums3, 8));
    assertEquals(1, instance.search(nums4, 5));
  }
}