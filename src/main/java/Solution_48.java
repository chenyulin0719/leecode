public class Solution_48 {
  //  Peeling onions
  public void rotate(int[][] matrix) {
    if (matrix.length == 0)
      throw new RuntimeException("Not allow empty matrix");
    int n = matrix.length;
    for (int y = 0; y < n / 2; y++) {
      for (int x = y; x < n - 1 - y; x++) {
        int temp = matrix[y][x];
        matrix[y][x] = matrix[n - x - 1][y];
        matrix[n - x - 1][y] = matrix[n - y - 1][n - x - 1];
        matrix[n - y - 1][n - x - 1] = matrix[x][n - y - 1];
        matrix[x][n - y - 1] = temp;
      }
    }
  }

  //fold diagonal then fold both sides
  public void rotate2(int[][] matrix) {
    if (matrix.length == 0)
      throw new RuntimeException("Not allow empty matrix");
    int n = matrix.length;
    for (int y = 0; y < n; y++) {
      for (int x = y + 1; x < n; x++) {
        swap(matrix, x, y, y, x);
      }
    }
    for (int x = 0; x < n / 2; x++) {
      for (int y = 0; y < n; y++) {
        swap(matrix, x, y, n - 1 - x, y);
      }
    }
  }

  private void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
    int temp = matrix[y1][x1];
    matrix[y1][x1] = matrix[y2][x2];
    matrix[y2][x2] = temp;
  }
}