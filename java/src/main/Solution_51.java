import java.util.ArrayList;
import java.util.List;

public class Solution_51 {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    if (n > 0)
      solveNQueens(res, new int[n], 0);
    return res;
  }

  private void solveNQueens(List<List<String>> res, int[] queens, int row) {
    int n = queens.length;
    if (row == n) {
      addResult(res, queens);
      return;
    }
    for (int col = 0; col < n; col++) {
      if (checkValid(queens, row, col)) {
        queens[row] = col;
        solveNQueens(res, queens, row + 1);
      }
    }
  }

  private boolean checkValid(int[] queens, int row, int col) {
    for (int i = 0; i < row; i++) {
      if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
        return false;
      }
    }
    return true;
  }

  private void addResult(List<List<String>> res, int[] queens) {
    int n = queens.length;
    List<String> table = new ArrayList<>();
    for (int i : queens) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < n; j++) {
        if (j == i) {
          sb.append("Q");
        } else {
          sb.append(".");
        }
      }
      table.add(sb.toString());
    }
    res.add(table);
  }
}