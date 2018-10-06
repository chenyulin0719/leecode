public class Solution_38 {
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }

    String lastSay = countAndSay(n - 1);
    StringBuilder sb = new StringBuilder();
    int count = 1;
    char c = lastSay.charAt(0);
    for (int i = 1; i < lastSay.length(); i++) {
      if (lastSay.charAt(i) == c) {
        count += 1;
      } else {
        sb.append(count).append(c);
        c = lastSay.charAt(i);
        count = 1;
      }
    }

    return sb.append(count).append(c).toString();
  }
}
