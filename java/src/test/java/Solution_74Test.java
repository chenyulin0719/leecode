import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_74Test {

  @Test
  public void searchMatrix() {
    Solution_74 instance = new Solution_74();
    int[][] input1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
    };
    int[][] input2 = {
            {1, 3}
    };
    assertTrue(instance.searchMatrix(input1, 3));
    assertFalse(instance.searchMatrix(input1, 13));
    assertFalse(instance.searchMatrix(input2, 2));
  }
}