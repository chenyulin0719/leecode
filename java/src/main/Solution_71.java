import java.util.Stack;
import java.util.stream.Collectors;

public class Solution_71 {

  public String simplifyPath2(String path) {
    if (path.length() == 0)
      return path;

    Stack<String> stack = new Stack<>();
    String[] elements = path.split("/");
    for (String element : elements) {
      switch (element) {
        case "":
        case ".":
          break;
        case "..":
          if (stack.size() > 0)
            stack.pop();
          break;
        default:
          stack.push(element);
      }
    }
    return path.charAt(0) == '/' ? '/' + buildSimplifyPath(stack) : buildSimplifyPath(stack);
  }


  public String simplifyPath(String path) {
    if (path.length() == 0)
      return path;

    Stack<String> stack = new Stack<>();
    int start = 0;
    for (int i = 1; i <= path.length(); i++) {
      if (path.charAt(i - 1) == '/') {
        if (start != i - 1) {
          handleStackElement(stack, path, start, i - 1);
        }
        start = i;
      }
    }

    if (start != path.length()) {
      handleStackElement(stack, path, start, path.length());
    }
    return path.charAt(0) == '/' ? '/' + buildSimplifyPath(stack) : buildSimplifyPath(stack);
  }

  private void handleStackElement(Stack<String> stack, String path, int start, int i) {
    String element = path.substring(start, i);
    if ("..".equals(element)) {
      if (stack.size() != 0)
        stack.pop();
    } else if (!".".equals(element)) {
      stack.push(element);
    }
  }

  private String buildSimplifyPath(Stack<String> stack) {
    return stack.stream().collect(Collectors.joining("/"));
  }
}
