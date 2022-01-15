import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_44Test {


  @Test
  public void isMatchGreedy() {
    Solution_44 instance = new Solution_44();
    assertFalse(instance.isMatchGreedy("aa", "a"));
    assertTrue(instance.isMatchGreedy("aa", "*"));
    assertFalse(instance.isMatchGreedy("cd", "?a"));
    assertTrue(instance.isMatchGreedy("adceb", "a*b"));
    assertTrue(instance.isMatchGreedy("", "*"));
    assertFalse(instance.isMatchGreedy("", "p"));
    assertTrue(instance.isMatchGreedy("", "**"));
    assertFalse(instance.isMatchGreedy("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b"));
  }

  @Test
  public void isMatchDP() {
    Solution_44 instance = new Solution_44();
    assertFalse(instance.isMatchDP("aa", "a"));
    assertTrue(instance.isMatchDP("aa", "*"));
    assertFalse(instance.isMatchDP("cd", "?a"));
    assertTrue(instance.isMatchDP("adceb", "a*b"));
    assertTrue(instance.isMatchDP("", "*"));
    assertFalse(instance.isMatchDP("", "p"));
    assertTrue(instance.isMatchDP("", "**"));
    assertFalse(instance.isMatchDP("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b"));
  }

  @Test
  public void isMatchRecursiveDP() {
    Solution_44 instance = new Solution_44();
    assertFalse(instance.isMatchRecursiveDP("aa", "a"));
    assertTrue(instance.isMatchRecursiveDP("aa", "*"));
    assertFalse(instance.isMatchRecursiveDP("cd", "?a"));
    assertTrue(instance.isMatchRecursiveDP("adceb", "a*b"));
    assertTrue(instance.isMatchRecursiveDP("", "*"));
    assertFalse(instance.isMatchRecursiveDP("", "p"));
    assertTrue(instance.isMatchRecursiveDP("", "**"));
    assertFalse(instance.isMatchRecursiveDP("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b"));
  }

  @Test
  public void isMatchRecursive() {
    Solution_44 instance = new Solution_44();
    assertFalse(instance.isMatchRecursive("aa", "a"));
    assertTrue(instance.isMatchRecursive("aa", "*"));
    assertFalse(instance.isMatchRecursive("cd", "?a"));
    assertTrue(instance.isMatchRecursive("adceb", "a*b"));
    assertTrue(instance.isMatchRecursive("", "*"));
    assertFalse(instance.isMatchRecursive("", "p"));
    assertTrue(instance.isMatchRecursive("", "**"));
//    TLE
//    assertFalse(instance.isMatch("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b"));
  }
}