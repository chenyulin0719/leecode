public class Solution_9 {
  public boolean isPalindrome(int x) {

    // 要忽略尾數為0，ex: 10 20 100
    if (x < 0 || (x % 10 == 0 && (x != 0))) {
      return false;
    }

    int left = x;
    int right = 0;
    do {
      int quotient = left / 10;
      int remainder = left % 10;

      right = right * 10 + remainder;
      left = quotient;

    } while (left > right);

    if (left == right) {
      return true;
    }

    if (left == (right / 10)) {
      return true;
    }

    return false;
  }
}
