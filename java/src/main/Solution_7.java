public class Solution_7 {
  public int reverse(int x) {
    //(2147483647~-2147483648)
    int source = x;
    int output = 0;
    while (source != 0) {
      int quotient = source / 10;
      int remainder = source % 10;
      //tips: 輸入值x不會overflow,output=214748364時只有可能為remainder=1，計算後的output為+-2147483641，不會造成overflow。
      if (Math.abs(output) > 214748364) {
        return 0;
      }
      output = output * 10 + remainder;
      source = quotient;
    }
    return output;
  }
}
