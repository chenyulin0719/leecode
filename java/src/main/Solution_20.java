import java.util.Stack;

public class Solution_20 {
  private Stack<Character> stack;

  public boolean isValid(String s) {
    stack = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (c == '[' || c == '{' || c == '(') {
        stack.push(c);
      } else if (c == ']' || c == '}' || c == ')') {
        if (stack.empty()) return false;
        if (c == ']' && '[' != stack.peek()) return false;
        if (c == '}' && '{' != stack.peek()) return false;
        if (c == ')' && '(' != stack.peek()) return false;
        stack.pop();
      }
    }
    return stack.size() == 0;
  }
}