import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_30 {
  //Use a dictionary(HashMap) to find words appeared times.
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> res = new ArrayList<>();
    if (words.length == 0)
      return res;

    int n = words.length;
    int k = words[0].length();
    Map<String, Integer> wordsMap = new HashMap<>();
    for (String word : words) {
      wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
    }
    for (int i = 0; i < s.length() - n * k + 1; i++) {
      int count = 0;
      int j = i;
      Map<String, Integer> copy = new HashMap<>(wordsMap);
      while (count < n) {
        String nextWord = s.substring(j, j + k);
        j = j + k;
        if (copy.containsKey(nextWord) && copy.get(nextWord) > 0) {
          copy.put(nextWord, copy.get(nextWord) - 1);
          count++;
        } else {
          break;
        }
      }
      if (count == n)
        res.add(i);
    }

    return res;
  }
}
