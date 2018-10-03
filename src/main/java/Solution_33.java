public class Solution_33 {
  //distinguish two case : left sorted & right sorted
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    if (nums.length == 0) return -1;
    if (nums[left] == target) return left;
    if (nums[right] == target) return right;

    while (left + 1 < right) {
      int middle = (left + right) / 2;
      if (nums[left] < nums[middle]) {
        if (nums[left] < target && target < nums[middle]) {
          right = middle;
        } else {
          left = middle;
        }
      } else {
        if (nums[middle] < target && target < nums[right]) {
          left = middle;
        } else {
          right = middle;
        }
      }
      if (nums[middle] == target) return middle;
    }

    return -1;
  }
}
