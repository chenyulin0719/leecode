import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_69Test {
  @Test
  public void mySqrtNewton() {
    Solution_69 instance = new Solution_69();
    assertEquals(2,instance.mySqrtNewton(4));
    assertEquals(2,instance.mySqrtNewton(8));
  }

  @Test
  public void mySqrtBinarySearch() {
    Solution_69 instance = new Solution_69();
    assertEquals(2,instance.mySqrtBinarySearch(4));
    assertEquals(2,instance.mySqrtBinarySearch(8));
  }

  @Test
  public void mySqrtBrute() {
    Solution_69 instance = new Solution_69();
    assertEquals(2,instance.mySqrtBrute(4));
    assertEquals(2,instance.mySqrtBrute(8));
  }
}