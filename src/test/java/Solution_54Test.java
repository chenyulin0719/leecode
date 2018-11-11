import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_54Test {

  @Test
  public void spiralOrder() {
    Solution_54 instance = new Solution_54();
    int[][] input1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    List<Integer> expect1 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
    assertEquals(expect1, instance.spiralOrder(input1));

    int[][] input2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
    };
    List<Integer> expect2 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    assertEquals(expect2, instance.spiralOrder(input2));
  }
}