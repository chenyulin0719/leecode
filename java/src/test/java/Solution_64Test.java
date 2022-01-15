import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_64Test {

  @Test
  public void minPathSumDP() {
    Solution_64 instance = new Solution_64();
    int[][] input = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
    };
    assertEquals(7, instance.minPathSumDP(input));
  }

  @Test
  public void minPathSumRecursive() {
    Solution_64 instance = new Solution_64();
    int[][] input = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
    };
    assertEquals(7, instance.minPathSumRecursive(input));
  }
}