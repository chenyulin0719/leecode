public class Solution_50 {
  public double myPow3(double x, int n) {
    long m = n < 0 ? Math.abs((long) n) : n;
    double square = x;
    double multiple = 1;
    for (; m > 0; m = m >> 1) {
      if ((m & 1) > 0) {
        multiple *= square;
      }
      square *= square;
    }
    return (n < 0) ? 1 / multiple : multiple;
  }

  //O(log n)
  public double myPow2(double x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;
    if (n == 1) return x;
    double nextX = x;
    int nextN = n / 2;
    if (n < 0) {
      nextX = 1 / x;
      nextN = -nextN;
    }
    double res = myPow2(nextX, nextN);
    return n % 2 == 0 ? res * res : res * res * nextX;
  }

  // O(log n) => wrong ,recursive ,every level caculate twice.
  // O(1+2+2^2+2^3+...) = O(2^n) = O(2^logn) = O(n) => true
  // TLE
  public double myPow(double x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;
    if (n == 1) return x;
    if (n == -1) return 1 / x;

    if (n > 0) {
      return myPow(x, n / 2) * myPow(x, n - n / 2);
    } else {
      return myPow(x, n / 2) * myPow(x, n - n / 2);
    }
  }
}