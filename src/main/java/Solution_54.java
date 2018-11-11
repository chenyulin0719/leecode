import java.util.ArrayList;
import java.util.List;

public class Solution_54 {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
      return result;
    }

    int startX = 0, startY = 0, endX = matrix[0].length - 1, endY = matrix.length - 1;

    while (startX <= endX && startY <= endY) {
      for (int i = startX; i <= endX; i++)
        result.add(matrix[startY][i]);
      startY++;
      if (startY > endY)
        break;

      for (int i = startY; i <= endY; i++)
        result.add(matrix[i][endX]);
      endX--;
      if (startX > endX)
        break;

      for (int i = endX; i >= startX; i--)
        result.add(matrix[endY][i]);
      endY--;
      if (startY > endY)
        break;

      for (int i = endY; i >= startY; i--)
        result.add(matrix[i][startX]);
      startX++;
    }
    return result;
  }
}