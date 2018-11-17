import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_62Test {

  @Test
  public void uniquePathsDP2() {
    Solution_62 instance = new Solution_62();
    assertEquals(3,instance.uniquePathsDP2(3,2));
    assertEquals(28,instance.uniquePathsDP2(3,7));
  }

  @Test
  public void uniquePathsDP() {
    Solution_62 instance = new Solution_62();
    assertEquals(3,instance.uniquePathsDP(3,2));
    assertEquals(28,instance.uniquePathsDP(3,7));
  }

  @Test
  public void uniquePathsRecursive() {
    Solution_62 instance = new Solution_62();
    assertEquals(3,instance.uniquePathsRecursive(3,2));
    assertEquals(28,instance.uniquePathsRecursive(3,7));
  }

  @Test
  public void uniquePathsByCombination() {
    Solution_62 instance = new Solution_62();
    assertEquals(3,instance.uniquePathsByCombination(3,2));
    assertEquals(28,instance.uniquePathsByCombination(3,7));
  }
}