public class Solution_55 {
  public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    int reached = 0;
    for (int current = 0; current <= reached; current++) {
      if (current + nums[current] > reached) {
        reached = current + nums[current];
      }
      if (reached >= nums.length - 1) {
        return true;
      }
    }
    return false;
  }
}
