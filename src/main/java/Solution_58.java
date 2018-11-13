public class Solution_58 {
  public int lengthOfLastWord(String s) {
    if (s == null)
      return 0;
    String trimed = s.trim();
    int count = 0;
    for (int i = trimed.length()-1; i >= 0; i--){
      if (trimed.charAt(i) != ' ')
        count++;
      else
        break;
    }
    return count;
  }
}