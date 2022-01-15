import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_75Test {

  @Test
  public void sortColorsOnePass() {
    Solution_75 instance = new Solution_75();
    int[] input = {2, 0, 2, 1, 1, 0};
    int[] output = {0, 0, 1, 1, 2, 2};
    instance.sortColorsOnePass(input);
    assertArrayEquals(output, input);
  }

  @Test
  public void sortColorsTwoPass() {
    Solution_75 instance = new Solution_75();
    int[] input = {2, 0, 2, 1, 1, 0};
    int[] output = {0, 0, 1, 1, 2, 2};
    instance.sortColorsTwoPass(input);
    assertArrayEquals(output, input);
  }
}