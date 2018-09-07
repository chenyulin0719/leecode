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
      //比較 left 和 right 才會有交集，如果只比較x 和 right ，當5,4,3,2,1 時不會跳出迴圈
    } while (left > right);

    return left == right || left == (right / 10);
  }
}
