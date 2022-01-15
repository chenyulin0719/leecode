public class Solution_66 {
  public int[] plusOne(int[] digits) {
    if (digits.length == 0)
      throw new RuntimeException("Illegal input.");

    int carry = 1;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] + carry == 10) {
        digits[i] = 0;
        carry = 1;
      } else {
        digits[i] = digits[i] + carry;
        return digits;
      }
    }

    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
  }
}