public class Solution_52 {
  private int res = 0;

  public int totalNQueens(int n) {
    boolean[] col = new boolean[n];
    boolean[] diag1 = new boolean[2 * n - 1];
    boolean[] diag2 = new boolean[2 * n - 1];
    helper(0, col, diag1, diag2, n);
    return res;
  }

  private void helper(int row, boolean[] col, boolean[] diag1, boolean[] diag2, int n) {
    if (row == n) {
      res++;
      return;
    }
    for (int i = 0; i < n; i++) {
      int d1 = row + i;
      int d2 = row - i + n - 1;
      if (col[i] || diag1[d1] || diag2[d2]) {
        continue;
      }
      col[i] = true;
      diag1[d1] = true;
      diag2[d2] = true;
      helper(row + 1, col, diag1, diag2, n);
      col[i] = false;
      diag1[d1] = false;
      diag2[d2] = false;
    }
  }
}
