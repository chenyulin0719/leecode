public class Solution_29 {

  public int divide(int dividend, int divisor) {
    int sign = 1;
    if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) sign = -1;
    long lDividend = Math.abs((long) dividend);
    long lDivisor = Math.abs((long) divisor);
    long result = divideRecursive(lDividend, lDivisor);
    if (result == 2147483648L) {
      return (sign == 1) ? 2147483647 : Integer.MIN_VALUE;
    }
    return sign * (int) result;
  }

  private long divideRecursive(long dividend, long divisor) {
    long p = 1;
    long sum = divisor;
    if (dividend < divisor)
      return 0;
    else {
      while (dividend >= (sum << 1)) {
        sum <<= 1;
        p <<= 1;
      }
    }
    return p + divideRecursive(dividend - sum, divisor);
  }
}
