import java.util.ArrayList;
import java.util.List;

public class Solution_68 {
  public List<String> fullJustify(String[] words, int maxWidth) {

    List<String> result = new ArrayList<>();
    int lineStart = 0, width = 0;

    for (int i = 0; i < words.length; i++) {
      width += words[i].length();
      if (i != lineStart) width += 1;
      if (width > maxWidth) {
        result.add(buildFullJustifyString(words, lineStart, i - 1, maxWidth, false));
        width = words[i].length();
        lineStart = i;
      }
    }

    result.add(buildFullJustifyString(words, lineStart, words.length - 1, maxWidth, true));
    return result;
  }

  private String buildFullJustifyString(String[] words, int start, int end, int maxWidth, boolean lastLine) {
    StringBuilder sb = new StringBuilder(words[start]);
    if (lastLine) {
      for (int i = start + 1; i <= end; i++) {
        sb.append(" ").append(words[i]);
      }
      sb.append(repeatSting(' ', (maxWidth - sb.length())));
      return sb.toString();
    }
    if (start == end) {
      int spaces = maxWidth - words[start].length();
      sb.append(repeatSting(' ', spaces));
      return sb.toString();
    }

    int gapNumber = end - start;
    int wordWidth = 0;
    for (int i = start; i <= end; i++) {
      wordWidth += words[i].length();
    }
    int spaces = maxWidth - wordWidth;
    int basicGapLength = spaces / gapNumber;
    int extraGapNumber = spaces % gapNumber;
    String basicGap = repeatSting(' ', basicGapLength);

    for (int i = start + 1; i <= end; i++) {
      if ((i - start) <= extraGapNumber)
        sb.append(' ');
      sb.append(basicGap).append(words[i]);
    }
    return sb.toString();
  }

  private String repeatSting(char c, int number) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < number; i++)
      sb.append(c);
    return sb.toString();
  }
}