import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_60Test {

  @Test
  public void getPermutation() {
    Solution_60 instance = new Solution_60();
    assertEquals("213", instance.getPermutation(3, 3));
    assertEquals("2314", instance.getPermutation(4, 9));
    assertEquals("132", instance.getPermutation(3, 2));
  }
}