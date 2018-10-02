import java.util.Stack;

public class Solution_32 {
  //DP[i] : longest valid parentheses substring by end of s[i-1]
  public int longestValidParenthesesDP(String s) {
    int n = s.length();
    int maxLength = 0;
    int DP[] = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      char c = s.charAt(i - 1);
      int j = i - 2 - DP[i - 1];
      if (c == '(' || j < 0 || s.charAt(j) == ')') {
        DP[i] = 0;
      } else {
        DP[i] = 2 + DP[i - 1] + DP[j];
        maxLength = Math.max(maxLength, DP[i]);
      }
    }

    return maxLength;
  }

  //when queue is empty,reset start
  //when any parenthese matched, count max length(two case)
  public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    int start = 0;
    int maxLength = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack.push(i);
      } else if (c == ')') {
        if (stack.empty()) {
          start = i + 1;
        } else {
          stack.pop();
          maxLength = stack.empty() ? Math.max(maxLength, i - start + 1) : Math.max(maxLength, i - stack.peek());
        }
      }
    }

    return maxLength;
  }

  public int longestValidParenthesesBrute(String s) {
    // -1 means '('
    // -2 means ')' or stop
    Stack<Integer> stack = new Stack<>();
    stack.push(-2);

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(-1);
      } else if (s.charAt(i) == ')') {
        int count = 0;
        while (true) {
          int len = stack.pop();
          if (len == -1) {
            count += 2;
            stack.push(count);
            break;
          } else if (len == -2) {
            stack.push(-2);
            if (count > 0) {
              stack.push(count);
              stack.push(-2);
            } else {
              stack.push(-2);
            }
            break;
          } else {
            count += len;
          }
        }
      }
    }
    int maxLength = 0;
    int count = 0;
    while (!stack.empty()) {
      int len = stack.pop();
      if (len == -2 || len == -1) {
        maxLength = Math.max(maxLength, count);
        count = 0;
      } else {
        count += len;
      }
    }

    return Math.max(maxLength, count);
  }
}
