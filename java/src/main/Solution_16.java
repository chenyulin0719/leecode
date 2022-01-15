import java.util.Arrays;

public class Solution_16 {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int diff = Integer.MAX_VALUE;
    int closeSet = nums[0] + nums[1] + nums[2];

    for (int k = 0; k < nums.length - 2; k++) {
      int i = k + 1;
      int j = nums.length - 1;

      while (i < j) {
        int sum = nums[k] + nums[i] + nums[j];
        int newDiff = Math.abs(target - sum);
        if (newDiff == 0) {
          return sum;
        }
        if (diff > newDiff) {
          diff = newDiff;
          closeSet = sum;
        }
        if (target - sum > 0) {
          i++;
        } else {
          j--;
        }

      }
    }
    return closeSet;
  }
}
