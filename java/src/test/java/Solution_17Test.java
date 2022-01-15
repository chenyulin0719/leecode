import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_17Test {
  private String input = "23";
  private List<String> expect = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

  @Test
  public void letterCombinationsBFS() {
    Solution_17 instance = new Solution_17();
    assertEquals(expect, instance.letterCombinationsBFS(input));
  }

  @Test
  public void letterCombinationsDFS() {
    Solution_17 instance = new Solution_17();
    assertEquals(expect, instance.letterCombinationsDFS(input));
  }

  @Test
  public void letterCombinations() {
    Solution_17 instance = new Solution_17();

    assertEquals(expect, instance.letterCombinations(input));
  }
}