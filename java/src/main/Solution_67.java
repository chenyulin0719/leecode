public class Solution_67 {

  public String addBinary(String a, String b) {
    if (a == null || b == null)
      throw new RuntimeException("Illegal input.");

    int n1 = a.length(), n2 = b.length();
    int i = 1, j = 1, carry = 0;
    StringBuilder sb = new StringBuilder();
    while (i <= n1 || j <= n2) {
      int sum = carry;
      if (i <= n1) sum += a.charAt(n1 - i++) - '0';
      if (j <= n2) sum += b.charAt(n2 - j++) - '0';
      carry = sum / 2;
      sb.insert(0, (sum % 2));
    }
    if (carry == 1)
      sb.insert(0, '1');
    return sb.toString();
  }

  public String addBinary2(String a, String b) {
    if (a == null || b == null)
      throw new RuntimeException("Illegal input.");

    if (a.length() < b.length()) {
      return addBinary(b, a);
    }
    StringBuilder sb = new StringBuilder();
    int n1 = a.length(), n2 = b.length();
    int carry = 0;
    for (int i = 1; i <= n1; i++) {
      int num1 = a.charAt(n1 - i) - '0';
      if (i <= n2) {
        int num2 = b.charAt(n2 - i) - '0';
        sb.insert(0, (num1 ^ num2 ^ carry));
        carry = (num1 + num2 + carry) > 1 ? 1 : 0;
      } else {
        sb.insert(0, (num1 ^ carry));
        carry = num1 & carry;
      }
    }
    if (carry > 0)
      sb.insert(0, '1');
    return sb.toString();
  }
}