import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_30Test {

  @Test
  public void findSubstring() {
    Solution_30 instance = new Solution_30();
    String s1 = "barfoothefoobarman";
    String[] word1 = {"foo", "bar"};
    List<Integer> expect1 = Arrays.asList(0, 9);

    assertEquals(expect1, instance.findSubstring(s1, word1));

    String s2 = "wordgoodstudentgoodword";
    String[] word2 = {"word", "student"};
    List<Integer> expect2 = Collections.emptyList();

    assertEquals(expect2, instance.findSubstring(s2, word2));

    String s3 = "barfoofoobarthefoobarman";
    String[] word3 = {"bar", "foo", "the"};
    List<Integer> expect3 = Arrays.asList(6, 9, 12);

    assertEquals(expect3, instance.findSubstring(s3, word3));
  }
}