import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_26Test {

  @Test
  public void removeDuplicates() {
    Solution_26 instance = new Solution_26();
    int[] input1 = {1, 1, 2};
    int[] expect1 = {1, 2, 2};
    int[] input2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] expect2 = {0, 1, 2, 3, 4, 2, 2, 3, 3, 4};

    assertEquals(2, instance.removeDuplicates(input1));
    assertArrayEquals(expect1, input1);

    assertEquals(5, instance.removeDuplicates(input2));
    assertArrayEquals(expect2, input2);
  }
}