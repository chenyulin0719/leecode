
public class Solution_5 {

  private final char TAG = '#';

  /*
      b a a b b
    b 1 0 X
    a   1 2 X
    a     1 0 X
    b       1 2
    b         1

    核心概念: 回文的裡面還會是回文。
    X可透過查表得知
   */
  //O(n^2)
  public String longestPalindromeDP(String s) {

    int length = s.length();
    DpInfo[][] table = new DpInfo[length][length];
    //填滿 shift == 0
    for (int y = 0; y < length; y++) {
      for (int x = y; x < length; x++) {
        table[x][y] = new DpInfo();
      }
    }


    //填滿 shift == 1
    for (int i = 0; i < length; i++) {
      table[i][i].setCount(1);
      if (i + 1 < length) {
        if (s.charAt(i) == s.charAt(i + 1)) {
          table[i + 1][i].setCount(2);
        }
      }
    }

    //填滿 shift ~ (length-1)
    for (int shift = 2; shift < length; shift++) {
      for (int y = 0; y < length; y++) {
        int x = y + shift;
        if (x < length) {
          int count = (table[x - 1][y + 1].isPalindrome()
                  && s.charAt(x) == s.charAt(y)) ? table[x - 1][y + 1].getCount() + 2 : 0;
          table[x][y].setCount(count);
        }
      }
    }


    String answer = null;
    int maxCount = 0;
    for (int y = 0; y < length; y++) {
      for (int x = y; x < length; x++) {
        int count = table[x][y].getCount();
        if (count > maxCount) {
          maxCount = count;
          answer = s.substring(y, x + 1);
        }
      }
    }

    return answer;
  }

  class DpInfo {
    int count = 0;

    int getCount() {
      return count;
    }

    boolean isPalindrome() {
      return count > 0;
    }

    void setCount(int count) {
      this.count = count;
    }
  }

  //中心擴散法 O(n^2)
  //要中心為1或2個值的情形
  public String longestPalindromeExpandAroundCenter(String s) {

    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
      int len1 = expandAroundCenter(s, i, i);
      int len2 = expandAroundCenter(s, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > end - start + 1) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return s.substring(start, end + 1);
  }

  private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;

    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
      L--;
      R++;
    }

    return R - L - 1;
  }

  //Manacher O(n)
  //https://segmentfault.com/a/1190000003914228
  public String longestPalindromeManacher(String s) {
//        System.out.println("input:" + s);
    String T = preProcess(s);
    int n = T.length();
    int[] P = new int[n];
    int C = 0, R = 0;

    for (int i = 1; i < n - 1; i++) {
      int i_mirror = 2 * C - i;
      P[i] = (R > i) ? Math.min(R - i, P[i_mirror]) : 0;
//            System.out.println("i:" + i + " ,P[i]:" + P[i]);
      if ((i + P[i] + 1) < n && (i - P[i] - 1) > -1) {
        while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {

          P[i]++;
//          System.out.println("i:" + i + " ,P[i]:" + P[i]);
          if ((i + P[i] + 1) > n - 1 || (i - P[i] - 1) < 0) {
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
//            System.out.println("P[i]:" + P[i]);
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

  private String preProcess(String s) {
    StringBuilder sb = new StringBuilder().append(TAG);
    for (char c : s.toCharArray()) {
      sb.append(c).append(TAG);
    }
    return sb.toString();
  }


}
