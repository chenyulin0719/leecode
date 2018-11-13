import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_59Test {

  @Test
  public void generateMatrix() {
    Solution_59 instance = new Solution_59();
    int input = 3;
    int[][] expect = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
    };
    assertArrayEquals(expect, instance.generateMatrix(input));
  }
}