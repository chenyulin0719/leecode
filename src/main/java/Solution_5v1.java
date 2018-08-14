
public class Solution_5v1 {

  public String longestPalindrome(String s) {

    int length = s.length();
    DpInfo[][] table = new DpInfo[length][length];
    for (int y = 0; y < length; y++) {
      for (int x = y; x < length; x++) {
        table[x][y] = new DpInfo();
      }
    }

    for (int i = 0; i < length; i++) {
      table[i][i].setCount(1);
      if (i + 1 < length) {
        if (s.charAt(i) == s.charAt(i + 1)) {
          table[i + 1][i].setCount(2);
        }
      }
    }

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

    public int getCount() {
      return count;
    }

    public boolean isPalindrome() {
      return count > 0;
    }

    public void setCount(int count) {
      this.count = count;
    }
  }
}
