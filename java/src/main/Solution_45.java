public class Solution_45 {
  //'cur' is longest reachable distance after jump+1 times
  public int jumpGreedy(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int last = 0, cur = 0, jump = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > last) {
        last = cur;
        jump++;
      }
      cur = (i + nums[i] > cur) ? i + nums[i] : cur;
      if (cur >= nums.length - 1) {
        break;
      }
    }
    return jump + 1;
  }

  //TLE
  public int jumpDP(int[] nums) {
    int[] dp = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j <= nums[i]; j++) {
        if ((i + j) < nums.length) {
          dp[i + j] = (dp[i + j] < dp[i] + 1) ? dp[i + j] : dp[i] + 1;
        } else
          break;
      }
    }
    return dp[nums.length - 1];
  }
}
