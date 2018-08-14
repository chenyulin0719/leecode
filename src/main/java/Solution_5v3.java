public class Solution_5v3 {
  private final char TAG = '#';

  public String longestPalindrome(String s) {
    System.out.println("input:" + s);
    String T = preProcess(s);
    int n = T.length();
    int[] P = new int[n];
    int C = 0, R = 0;

    for (int i = 1; i < n - 1; i++) {
      int i_mirror = 2 * C - i;
      P[i] = (R > i) ? Math.min(R - i, P[i_mirror]) : 0;
      System.out.println("i:" + i + " ,P[i]:" + P[i]);
      if ((i + P[i] + 1) < n  && (i - P[i] - 1) > -1) {
        while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {

          P[i]++;
//          System.out.println("i:" + i + " ,P[i]:" + P[i]);
          if ((i + P[i] + 1) > n - 1 ||  (i - P[i] - 1) < 0) {
            break;
          }
        }
      }

      if (i + P[i] > R) {
        C = i;
        R = i + P[i];
      }

    }

    int max_length = 0;
    int centerIndex = 0;
    for (int i = 0; i < n; i++) {
      System.out.println("P[i]:" + P[i]);
      if (P[i] > max_length) {
        max_length = P[i];
        centerIndex = i;
      }
    }
    int startIndex = (centerIndex - max_length) / 2;
//    System.out.println("centerIndex:" + centerIndex);
//    System.out.println("max_length:" + max_length);
//    System.out.println("startIndex:" + startIndex);
    return s.substring(startIndex, startIndex + max_length);
  }

  String preProcess(String s) {
    StringBuilder sb = new StringBuilder().append(TAG);
    for (char c : s.toCharArray()) {
      sb.append(c).append(TAG);
    }
    return sb.toString();
  }
}
