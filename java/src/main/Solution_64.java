public class Solution_64 {
  public int minPathSumDP(int[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      throw new RuntimeException("Illegal input.");
    }

    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    dp[0][0] = grid[0][0];
    for (int i = 1; i < m; i++)
      dp[i][0] = dp[i - 1][0] + grid[i][0];
    for (int i = 1; i < n; i++)
      dp[0][i] = dp[0][i - 1] + grid[0][i];

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
      }
    }
    return dp[m - 1][n - 1];
  }

  public int minPathSumRecursive(int[][] grid) {
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
      throw new RuntimeException("Illegal input.");
    }
    int m = grid.length;
    int n = grid[0].length;
    return minPathSumRecursive(grid, m - 1, n - 1, m, n);
  }

  private int minPathSumRecursive(int[][] grid, int i, int j, int m, int n) {
    if (i == 0 && j == 0) {
      return grid[0][0];
    } else if (i < 0 || j < 0) {
      return Integer.MAX_VALUE;
    } else {
      return grid[i][j] + Math.min(minPathSumRecursive(grid, i - 1, j, m, n), minPathSumRecursive(grid, i, j - 1, m, n));
    }
  }
}