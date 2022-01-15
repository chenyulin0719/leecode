import java.util.*;

public class Solution_36 {
  private Map<Integer, Set<Character>> xSet = new HashMap<>();
  private Map<Integer, Set<Character>> ySet = new HashMap<>();
  private Map<Integer, Set<Character>> squareSet = new HashMap<>();

  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      xSet.put(i, new HashSet<>());
      ySet.put(i, new HashSet<>());
      squareSet.put(i, new HashSet<>());
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char c = board[i][j];
        if (c == '.')
          continue;

        if (!xSet.get(i).add(c)) {
          return false;
        }

        if (!ySet.get(j).add(c)) {
          return false;
        }

        int z = (j / 3) * 3 + i / 3;
        if (!squareSet.get(z).add(c)) {
          return false;
        }
      }
    }
    return true;
  }
}
