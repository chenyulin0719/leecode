public class Solution_74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
      return false;

    int m = matrix.length, n = matrix[0].length;
    int left = 0, right = m * n - 1;
    if (matrix[0][0] > target || matrix[m - 1][n - 1] < target)
      return false;

    while (left <= right) {
      int middle = (left + right) / 2;
      int middleNum = matrix[middle / n][middle % n];
      if (middleNum == target) {
        return true;
      } else if (middleNum > target) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return false;
  }
}