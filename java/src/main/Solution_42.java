import java.util.Stack;

public class Solution_42 {
  //Stack cached index of decreasing height
  public int trapStack2(int[] height) {
    int total = 0;
    Stack<Integer> stack = new Stack<>();
    int i = 0, n = height.length;
    while (i < n) {
      if (stack.isEmpty() || height[stack.peek()] >= height[i]) {
        stack.push(i++);
      } else {
        int t = stack.pop();
        if (stack.isEmpty())
          continue;
        int heighDiff = Math.min(height[stack.peek()], height[i]) - height[t];
        int hotizontalDistance = (i - stack.peek() - 1);
        total += heighDiff * hotizontalDistance;
      }
    }
    return total;
  }

  public int trapStack(int[] height) {
    if (height.length <= 1)
      return 0;
    Stack<Integer> stack = new Stack<>();
    int total = 0;
    int leftHighest = height[0];
    stack.push(height[0]);
    for (int i = 1; i < height.length; i++) {
      if (height[i] >= leftHighest) {
        while (!stack.isEmpty()) {
          total += (leftHighest - stack.pop());
        }
        leftHighest = height[i];
      }
      stack.push(height[i]);
    }

    int rightHighest = stack.pop();
    while (!stack.isEmpty() && stack.peek() != leftHighest) {
      int next = stack.pop();
      if (next < rightHighest) {
        total += (rightHighest - next);
      } else {
        rightHighest = next;
      }
    }
    return total;
  }


  public int trapTwoPointer2(int[] height) {
    int left = 0, right = height.length - 1, total = 0, level = 0;
    while (left < right) {
      int lowerIndex = (height[left] < height[right]) ? left++ : right--;
      int lower = height[lowerIndex];
      level = Math.max(level, lower);
      total += level - lower;
    }
    return total;
  }

  public int trapTwoPointer(int[] height) {
    if (height.length <= 2)
      return 0;
    int total = 0;
    int leftIndex = 0;
    int rightIndex = height.length - 1;
    int leftHeight = height[leftIndex];
    int rightHeight = height[rightIndex];

    while (leftIndex + 1 < rightIndex) {
      int min = Math.min(leftHeight, rightHeight);
      if (leftHeight <= rightHeight) {
        leftIndex++;
        if (height[leftIndex] < min) {
          total += (min - height[leftIndex]);
        } else {
          leftHeight = height[leftIndex];
        }
      } else {
        rightIndex--;
        if (height[rightIndex] < min) {
          total += (min - height[rightIndex]);
        } else {
          rightHeight = height[rightIndex];
        }
      }
    }
    return total;
  }
}
