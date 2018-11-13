public class Solution_59 {
  public int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];
    int x = 0, y = 0, count = 0;
    for (int offset = n - 1; offset > 0; offset -= 2) {
      for (int i = 0; i < offset; i++) {
        result[y][x++] = ++count;
      }
      for (int i = 0; i < offset; i++) {
        result[y++][x] = ++count;
      }
      for (int i = 0; i < offset; i++) {
        result[y][x--] = ++count;
      }
      for (int i = 0; i < offset; i++) {
        result[y--][x] = ++count;
      }
      x++;
      y++;
    }

    if (n % 2 == 1) {
      result[y][x] = ++count;
    }
    return result;
  }
}