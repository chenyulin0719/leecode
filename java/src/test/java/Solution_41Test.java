import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_41Test {

  @Test
  public void firstMissingPositive() {
    Solution_41 instance = new Solution_41();
    int[] input1 = {1, 2, 0};
    int[] input2 = {3, 4, -1, 1};
    int[] input3 = {7, 8, 9, 11, 12};
    int[] input4 = {1, 1};

    assertEquals(3, instance.firstMissingPositive(input1));
    assertEquals(2, instance.firstMissingPositive(input2));
    assertEquals(1, instance.firstMissingPositive(input3));
    assertEquals(2, instance.firstMissingPositive(input4));
  }
}