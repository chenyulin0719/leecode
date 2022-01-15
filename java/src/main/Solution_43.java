public class Solution_43 {
  public String multiply(String num1, String num2) {
    if ("0".equals(num1) || "0".equals(num2)) {
      return "0";
    }
    int n1 = num1.length(), n2 = num2.length();
    int k = n1 + n2;
    int[] multiply = new int[k];
    StringBuilder sb = new StringBuilder();

    for (int i = n1 - 1; i >= 0; i--) {
      for (int j = n2 - 1; j >= 0; j--) {
        int multiIndex = n1 + n2 - 2 - i - j;
        multiply[multiIndex] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
      }
    }
    int quotient = 0;
    for (int i = 0; i < k; i++) {
      multiply[i] += quotient;
      quotient = multiply[i] / 10;
      multiply[i] %= 10;
    }
    int firstNumber = k - 1;
    while (multiply[firstNumber] == 0) {
      firstNumber--;
    }
    for (int i = firstNumber; i >= 0; i--) {
      sb.append(multiply[i]);
    }

    return sb.toString();
  }
}