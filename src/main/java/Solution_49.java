import java.util.*;

public class Solution_49 {

  // O (m*n)
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      String key = sortString(str);
      if (map.containsKey(key)) {
        map.get(key).add(str);
      } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(key, list);
      }
    }
    return new ArrayList<>(map.values());
  }

  private String sortString(String strs) {
    Map<Character, Integer> litterMap = new HashMap<>();
    for (char c = 'a'; c <= 'z'; c++) {
      litterMap.put(c, 0);
    }
    for (char c : strs.toCharArray()) {
      litterMap.put(c, litterMap.get(c) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (char c = 'a'; c <= 'z'; c++) {
      int charCount = litterMap.get(c);
      for (int i = 0; i < charCount; i++)
        sb.append(c);
    }
    return sb.toString();
  }
}
