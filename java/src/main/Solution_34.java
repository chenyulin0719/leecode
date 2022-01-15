public class Solution_34 {
  public int[] searchRange(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    if (nums.length == 0)
      return new int[]{-1, -1};

    if (nums[right] != target) {
      while (left < right) {
        int middle = (left + right) / 2;
        if (nums[middle] == target && nums[middle + 1] != target) {
          right = middle;
          break;
        } else if (nums[middle] <= target) {
          left = middle + 1;
        } else {
          right = middle - 1;
        }
      }
    }

    if (right < 0 || nums[right] != target) {
      return new int[]{-1, -1};
    }

    int rightEdge = right;
    int leftEdge = 0;
    if (nums[0] == target) {
      return new int[]{0, right};
    } else {
      while (leftEdge < rightEdge) {
        int middle = (leftEdge + rightEdge) / 2;
        if (nums[middle] < target) {
          leftEdge = middle + 1;
        } else {
          rightEdge = middle;
        }
      }
      left = rightEdge;
    }

    return new int[]{left, right};
  }
}