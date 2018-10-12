public class Solution_41 {

  public int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int j = nums[i] - 1;
      if (nums[i] < 1 || nums[i] > nums.length || nums[i] == i + 1 || nums[i] == nums[j]) {
        i++;
      } else {
        swap(nums, i, j);
      }
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }

  private void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}
