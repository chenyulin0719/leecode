import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_73Test {

  @Test
  public void setZeroes() {
    Solution_73 instance = new Solution_73();
    int[][] input1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
    };
    int[][] output1 = {
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
    };
    int[][] input2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
    };
    int[][] output2 = {
            {0, 0, 0, 0},
            {0, 4, 5, 0},
            {0, 3, 1, 0}
    };

    instance.setZeroes(input1);
    assertArrayEquals(output1, input1);

    instance.setZeroes(input2);
    assertArrayEquals(output2, input2);
  }
}