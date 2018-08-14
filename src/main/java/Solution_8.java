public class Solution_8 {
  public int myAtoi(String str) {

    boolean positive = true;
    if (str == null) {
      return 0;
    }

    str = str.trim();
    if (str.length() == 0) {
      return 0;
    }

    int i = 0;
    if (str.charAt(i) == '-') {
      positive = false;
      i++;
    } else if (str.charAt(i) == '+') {
      positive = true;
      i++;
    }

    int output = 0;
    for (; i < str.length(); i++) {
      int digit = str.charAt(i) - '0';
      if (digit < 0 || digit > 9) {
        return output;
      } else if (positive) {
        if (output > 214748364 || (output == 214748364 && digit > 7)) {
          return Integer.MAX_VALUE;
        }
        output = output * 10 + digit;
      } else {
        if (output < -214748364 || (output == -214748364 && digit > 8)) {
          return Integer.MIN_VALUE;
        }
        output = output * 10 - digit;
      }
    }
    return output;
  }
}
