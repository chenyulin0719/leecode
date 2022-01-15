import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_27Test {

  @Test
  public void removeElement() {
    Solution_27 instance = new Solution_27();
    int[] input1 = {3, 2, 2, 3};
    int val1 = 3;
    int[] expect1 = {2, 2, 2, 3};
    int[] input2 = {0, 1, 2, 2, 3, 0, 4, 2};
    int val2 = 2;
    int[] expect2 = {0, 1, 3, 0, 4, 0, 4, 2};

    assertEquals(2, instance.removeElement(input1, val1));
    assertArrayEquals(expect1, input1);

    assertEquals(5, instance.removeElement(input2, val2));
    assertArrayEquals(expect2, input2);
  }
}