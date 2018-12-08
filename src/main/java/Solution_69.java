public class Solution_69 {
  //  X(i+1) = (Xi+ n/Xi)/2
  public int mySqrtNewton(int x) {
    if (x == 0) return 0;
    double last = 0;
    double res = 1;
    while (last != res) {
      last = res;
      res = (res + x / res) / 2;
    }
    return (int) res;
  }

  public int mySqrtBinarySearch(int x) {
    int left = 0, right = 46340;
    if (x > 46340 * 46340)
      return 46340;

    while (left <= right) {
      int middle = (left + right) / 2;
      int middleSqrt = middle * middle;
      if (middleSqrt < x) {
        left = middle + 1;
      } else if (middleSqrt == x) {
        return middle;
      } else {
        right = middle - 1;
      }
    }
    return right;
  }

  public int mySqrtBrute(int x) {
    for (int i = 1; i <= 46340; i++) {
      if ((i * i) > x)
        return i - 1;
    }
    return 46340;
  }
}