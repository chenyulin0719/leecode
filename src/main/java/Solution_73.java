public class Solution_73 {
  public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix[0] == null)
      return;

    int m = matrix.length, n = matrix[0].length;
    boolean firstRowZero = false, firstColZero = false;

    for (int i = 0; i < n; i++) {
      if (matrix[0][i] == 0) {
        firstRowZero = true;
        break;
      }
    }

    for (int i = 0; i < m; i++) {
      if (matrix[i][0] == 0) {
        firstColZero = true;
        break;
      }
    }

    for (int y = 1; y < m; y++) {
      for (int x = 1; x < n; x++) {
        if (matrix[y][x] == 0) {
          matrix[0][x] = 0;
          matrix[y][0] = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      if (matrix[i][0] == 0)
        setRowZero(matrix, n, i);
    }

    for (int i = 1; i < n; i++) {
      if (matrix[0][i] == 0)
        setColZero(matrix, m, i);
    }

    if (firstRowZero)
      setRowZero(matrix, n, 0);

    if (firstColZero)
      setColZero(matrix, m, 0);

  }

  private void setRowZero(int[][] matrix, int rowCount, int row) {
    for (int i = 0; i < rowCount; i++) {
      matrix[row][i] = 0;
    }
  }

  private void setColZero(int[][] matrix, int colCount, int col) {
    for (int i = 0; i < colCount; i++) {
      matrix[i][col] = 0;
    }
  }
}
