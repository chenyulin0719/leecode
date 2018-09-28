import java.util.Arrays;

public class Solution_31 {
  public void nextPermutation(int[] nums) {
    if (nums.length < 2) return;

    int preIndex = -1;
    int preNum = Integer.MIN_VALUE;
    int edgeNum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int newEdgeNum = nums[i];
      if (newEdgeNum > edgeNum) {
        preIndex = i - 1;
      }
      edgeNum = newEdgeNum;
    }
    if (preIndex == -1)
      Arrays.sort(nums);
    else {
      handlePartialPermutation(nums, preIndex);
    }
  }

  private void handlePartialPermutation(int[] nums, int preIndex) {
    int indexNum = nums[preIndex];
    int nextIndex = -1;
    int nextNumber = Integer.MAX_VALUE;
    for (int i = preIndex + 1; i < nums.length; i++) {
      if (nums[i] > indexNum && nextNumber > nums[i]) {
        nextIndex = i;
        nextNumber = nums[i];
      }
    }
    swapNumber(nums, preIndex, nextIndex);
    Arrays.sort(nums, preIndex + 1, nums.length);
  }

  private void swapNumber(int[] nums, int index1, int index2) {
    if (index1 >= nums.length || index2 >= nums.length)
      throw new RuntimeException("swap wrong index.");
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
  }
}
