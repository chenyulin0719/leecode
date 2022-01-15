import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_68Test {

  @Test
  public void fullJustify() {
    Solution_68 instance = new Solution_68();
    String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
    String[] words2 = {"What", "must", "be", "acknowledgment", "shall", "be"};
    String[] words3 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
            "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
    int maxWidth1 = 16;
    int maxWidth2 = 16;
    int maxWidth3 = 20;

    List<String> expect1 = Arrays.asList(
            "This    is    an",
            "example  of text",
            "justification.  "
    );
    List<String> expect2 = Arrays.asList(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
    );
    List<String> expect3 = Arrays.asList(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
    );
    assertEquals(expect1, instance.fullJustify(words1, maxWidth1));
    assertEquals(expect2, instance.fullJustify(words2, maxWidth2));
    assertEquals(expect3, instance.fullJustify(words3, maxWidth3));
  }
}