public class Solution_6 {
  //ZigZag Conversion
  public String convert(String s, int numRows) {
    StringBuilder sb = new StringBuilder();

    if (numRows == 1) {
      return s;
    }
    for (int i = 0; i < numRows; i++) {
      appenOneRow(sb, s, i, numRows);
    }
    return sb.toString();
  }

  void appenOneRow(StringBuilder sb, String s, int row, int numRows) {
    int index = row;
    Direction direction = (row != numRows - 1) ? Direction.DOWN : Direction.UP;

    while (index < s.length()) {
      sb.append(s.charAt(index));
      switch (direction) {
        case DOWN:
          index = index + (numRows - 1 - row) * 2;
          break;
        case UP:
          index = index + row * 2;
          break;
      }
      if (row == 0) {
        direction = Direction.DOWN;
      } else if (row == numRows - 1) {
        direction = Direction.UP;
      } else {
        direction = (direction == Direction.DOWN) ? Direction.UP : Direction.DOWN;
      }
    }
  }

  private enum Direction {
    DOWN, UP
  }

}
