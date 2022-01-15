import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_50Test {
  @Test
  public void myPow3() {
    Solution_50 instance = new Solution_50();

    assertEquals(1024, instance.myPow3(2, 10), 0.00001);
    assertEquals(9.261, instance.myPow3(2.1, 3), 0.00001);
    assertEquals(9.261, instance.myPow3(2.1, 3), 0.00001);
    assertEquals(0.25, instance.myPow3(2,-2), 0);
    assertEquals(3e-05, instance.myPow3(34.00515,-3), 0.00001);
  }

  @Test
  public void myPow2() {
    Solution_50 instance = new Solution_50();

    assertEquals(1024, instance.myPow2(2, 10), 0.00001);
    assertEquals(9.261, instance.myPow2(2.1, 3), 0.00001);
    assertEquals(9.261, instance.myPow2(2.1, 3), 0.00001);
    assertEquals(0.25, instance.myPow2(2,-2), 0);
    assertEquals(3e-05, instance.myPow2(34.00515,-3), 0.00001);
  }

  @Test
  public void myPow() {
    Solution_50 instance = new Solution_50();

    assertEquals(1024, instance.myPow(2, 10), 0.00001);
    assertEquals(9.261, instance.myPow(2.1, 3), 0.00001);
    assertEquals(9.261, instance.myPow(2.1, 3), 0.00001);
  }
}