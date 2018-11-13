import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_58Test {

  @Test
  public void lengthOfLastWord() {
    Solution_58 instance = new Solution_58();
    String input1 = "Hello World";
    String input2 = "Hello World  ";
    String input3 = "  ";
    String input4 = "Today is a nice day";
    assertEquals(5, instance.lengthOfLastWord(input1));
    assertEquals(5, instance.lengthOfLastWord(input2));
    assertEquals(0, instance.lengthOfLastWord(input3));
    assertEquals(3, instance.lengthOfLastWord(input4));
  }
}