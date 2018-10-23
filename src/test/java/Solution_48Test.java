import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_48Test {

  @Test
  public void rotate() {
    Solution_48 instance = new Solution_48();
    int[][] input1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int[][] expect1 = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
    };
    int[][] input2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
    };
    int[][] expect2 = {
            {15, 13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7, 10, 11}
    };

    instance.rotate(input1);
    instance.rotate(input2);
    assertArrayEquals(expect1, input1);
    assertArrayEquals(expect2, input2);
  }

  @Test
  public void rotate2() {
    Solution_48 instance = new Solution_48();
    int[][] input1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int[][] expect1 = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
    };
    int[][] input2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
    };
    int[][] expect2 = {
            {15, 13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7, 10, 11}
    };

    instance.rotate2(input1);
    instance.rotate2(input2);
    assertArrayEquals(expect1, input1);
    assertArrayEquals(expect2, input2);
  }
}