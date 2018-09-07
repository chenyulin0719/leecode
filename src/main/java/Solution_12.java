public class Solution_12 {

  public String intToRoman(int num) {
    String[] roma = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < val.length; i++) {
      while (num >= val[i]) {
        sb.append(roma[i]);
        num -= val[i];
      }
    }
    return sb.toString();
  }
}
