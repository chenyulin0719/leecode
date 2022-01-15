public class Solution_75 {

  public void sortColorsOnePass(int[] nums) {
    if (nums == null || nums.length <= 1)
      return;

    int left = 0, right = nums.length - 1;
    for (int i = 0; i <= right; i++) {
      if (nums[i] == 0) {
        swap(nums, i, left++);
      } else if (nums[i] == 2) {
        swap(nums, i--, right--);
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public void sortColorsTwoPass(int[] nums) {
    if (nums == null || nums.length <= 1)
      return;

    int[] count = new int[3];
    int index = 0;
    for (int num : nums)
      count[num]++;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < count[i]; j++)
        nums[index++] = i;
    }
  }
}