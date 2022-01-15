public class Solution_70 {

  public int climbStairsDP2(int n) {
    int[] dp = new int[3];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++)
      dp[i % 3] = dp[(i - 1) % 3] + dp[(i - 2) % 3];
    return dp[n % 3];
  }

  public int climbStairsDP(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;

    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++)
      dp[i] = dp[i - 1] + dp[i - 2];
    return dp[n];
  }
}