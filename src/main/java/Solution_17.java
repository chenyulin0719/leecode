import java.util.*;
import static java.util.stream.Collectors.toList;

public class Solution_17 {

  private Map<Character, List<Character>> numberLetterListMap = new HashMap<>();

  public List<String> letterCombinations(String digits) {
    numberLetterListMap.put('2', Arrays.asList('a', 'b', 'c'));
    numberLetterListMap.put('3', Arrays.asList('d', 'e', 'f'));
    numberLetterListMap.put('4', Arrays.asList('g', 'h', 'i'));
    numberLetterListMap.put('5', Arrays.asList('j', 'k', 'l'));
    numberLetterListMap.put('6', Arrays.asList('m', 'n', 'o'));
    numberLetterListMap.put('7', Arrays.asList('p', 'q', 'r', 's'));
    numberLetterListMap.put('8', Arrays.asList('t', 'u', 'v'));
    numberLetterListMap.put('9', Arrays.asList('w', 'x', 'y', 'z'));

    return combination(new ArrayList<>(), digits);
  }

  private List<String> combination(List<String> inputList, String digits) {

    if (digits.isEmpty()) {
      return inputList;
    }
    List<Character> litterList = numberLetterListMap.get(digits.charAt(digits.length() - 1));
    if (litterList == null) {
      throw new RuntimeException("Please Enter Number(2-9)");
    }
    List<String> outputList = new ArrayList<>();
    if (inputList.size() == 0) {
      outputList = litterList.stream().map(String::valueOf).collect(toList());
    } else {
      for (Character c : litterList) {
        List<String> list = inputList.stream().map(input -> String.valueOf(c) + input).collect(toList());
        outputList.addAll(list);
      }
    }
    return combination(outputList, digits.substring(0, digits.length() - 1));
  }
}
