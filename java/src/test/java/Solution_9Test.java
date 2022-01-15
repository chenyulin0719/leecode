import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution_9Test {

  @Test
  public void testIsPalindrome() {
    Solution_9 instance = new Solution_9();
    int input1 = 123;
    boolean result1 = instance.isPalindrome(input1);
    assertFalse(result1);

    int input2 = 12321;
    boolean result2 = instance.isPalindrome(input2);
    assertTrue(result2);

    int input3 = 10;
    boolean result3 = instance.isPalindrome(input3);
    assertFalse(result3);
  }
}
