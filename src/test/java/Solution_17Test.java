import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_17Test {

  @Test
  public void letterCombinations() {
    Solution_17 instance = new Solution_17();
    String input = "23";
    List<String> expect = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    assertEquals(expect, instance.letterCombinations(input));
  }
}