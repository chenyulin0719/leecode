import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_63Test {

  @Test
  public void uniquePathsWithObstacles() {
    Solution_63 instance = new Solution_63();
    int[][] input = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
    };
    assertEquals(2, instance.uniquePathsWithObstacles(input));
  }
}