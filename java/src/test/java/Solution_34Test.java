import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_34Test {

  @Test
  public void searchRange() {
    Solution_34 instance = new Solution_34();
    int[] nums1 = {5, 7, 7, 8, 8, 10};
    int input1 = 8;
    int[] expect1 = {3, 4};
    assertArrayEquals(expect1, instance.searchRange(nums1, input1));

    int[] nums2 = {5, 7, 7, 8, 8, 10};
    int input2 = 6;
    int[] expect2 = {-1, -1};
    assertArrayEquals(expect2, instance.searchRange(nums2, input2));

    int[] nums3 = {2, 2};
    int input3 = 1;
    int[] expect3 = {-1, -1};
    assertArrayEquals(expect3, instance.searchRange(nums3, input3));

    int[] nums4 = {2, 2};
    int input4 = 2;
    int[] expect4 = {0, 1};
    assertArrayEquals(expect4, instance.searchRange(nums4, input4));

    int[] nums5 = {3, 3, 3};
    int input5 = 3;
    int[] expect5 = {0, 2};
    assertArrayEquals(expect5, instance.searchRange(nums5, input5));
  }
}