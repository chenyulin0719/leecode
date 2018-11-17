public class Solution_62 {
  //  Time(m*n),space(n)
  public int uniquePathsDP2(int m, int n) {
    if (m < 1 || n < 1)
      throw new RuntimeException("Wrong input");
    int[] res = new int[n];
    res[0] = 1;

    for (int i = 0; i < m; i++) {
      for (int j = 1; j < n; j++) {
        res[j] += res[j - 1];
      }
    }
    return res[n - 1];
  }

  //  Time(m*n),space(m*n)
  public int uniquePathsDP(int m, int n) {
    if (m < 1 || n < 1)
      throw new RuntimeException("Wrong input");
    if (m == 1 || n == 1)
      return 1;

    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      dp[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      dp[0][i] = 1;
    }
    return uniquePathsDP(dp, m - 1, n - 1);
  }

  private int uniquePathsDP(int[][] dp, int m, int n) {
    if (dp[m][n] == 0) {
      int result = uniquePathsDP(dp, m - 1, n) + uniquePathsDP(dp, m, n - 1);
      dp[m][n] = result;
      return result;
    } else {
      return dp[m][n];
    }
  }


  private int dfsResult;

  //TLE
  public int uniquePathsRecursive(int m, int n) {
    dfsResult = 0;
    uniquePathsRecursiveCount(m - 1, n - 1);
    return dfsResult;
  }

  private void uniquePathsRecursiveCount(int m, int n) {
    if (m == 0 || n == 0) {
      dfsResult++;
    } else {
      uniquePathsRecursiveCount(m - 1, n);
      uniquePathsRecursiveCount(m, n - 1);
    }
  }

  public int uniquePathsByCombination(int m, int n) {
    if (m < 1 || n < 1)
      throw new RuntimeException("Wrong input");
    long result = 1;
    long count = m + n - 2;
    long k = Math.min(m - 1, n - 1);
    for (long i = 1; i <= k; i++) {
      result = result * (count - i + 1) / i;
    }
    return (int) result;
  }
}