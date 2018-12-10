import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_72Test {

  @Test
  public void minDistanceDP() {
    Solution_72 instance = new Solution_72();
    assertEquals(3, instance.minDistanceDP("horse", "ros"));
    assertEquals(5, instance.minDistanceDP("intention", "execution"));
  }

  @Test
  public void minDistanceRecursive() {
    Solution_72 instance = new Solution_72();
    assertEquals(3, instance.minDistanceRecursive("horse", "ros"));
    assertEquals(5, instance.minDistanceRecursive("intention", "execution"));
  }
}