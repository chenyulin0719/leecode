import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_51Test {

  @Test
  public void solveNQueens() {
    Solution_51 instance = new Solution_51();
    int input = 4;
    List<List<String>> expect = new ArrayList<>();
    expect.add(Arrays.asList(".Q..",  // Solution 1
            "...Q",
            "Q...",
            "..Q."));
    expect.add(Arrays.asList("..Q.",  // Solution 2
            "Q...",
            "...Q",
            ".Q.."));
    assertEquals(expect, instance.solveNQueens(input));
  }
}