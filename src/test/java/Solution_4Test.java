import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution_4Test {

  @Test
  public void testFindMedianSortedArrays() {

    //Test 1
    Solution_4 instance = new Solution_4();
    int[] nums1 = {3, 4, 5, 6};
    int[] nums2 = {1, 2, 7, 8};
    double expect1 = 4.5;
    assertEquals(4.5, instance.findMedianSortedArrays(nums1, nums2), 0);

    //Test 2
    int[] nums3 = {1, 3, 5, 7, 9};
    int[] nums4 = {2, 4, 6, 8};
    double expect2 = 5;
    assertEquals(expect2, instance.findMedianSortedArrays(nums3, nums4), 0);

    //Test 3
    int[] nums5 = {1, 3};
    int[] nums6 = {2};
    double expect3 = 2;
    assertEquals(expect3, instance.findMedianSortedArrays(nums5, nums6), 0);

    //Test 4
    int[] nums7 = {1, 2};
    int[] nums8 = {3, 4};
    double expect4 = 2.5;
    assertEquals(expect4, instance.findMedianSortedArrays(nums7, nums8), 0);
  }
}